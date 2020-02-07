package com.exercisepdf.banksystem.model;

import com.exercisepdf.banksystem.model.exceptions.ClientNotFoundException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private static Bank instance;
    private static Float totalCommissons = 0f;
    private ArrayList<Client> clients;

    private Bank(){
        try{
            load();
        } catch (Exception ex){
            Logger.log("Unable to load state from bank.data");
            this.clients = new ArrayList<>();
        }
    }

    public static Bank getBankInstance(){
        if(instance == null){
            instance = new Bank();
        }
        return instance;
    }

    public static void updateTotalCommission(float amount){
        totalCommissons += amount;
    }

    public float getBalance(){
        float grandTotal = 0;
        for(Client client: this.clients){
            grandTotal += client.getFortune();
        }
        return grandTotal + totalCommissons;
    }

    public <T extends Client> void addClient(T client){
        int id = client.getId();
        if(clients.contains(client)){
            Logger.log("Client already exists - id: " + id);
        } else {
            this.clients.add(client);
            Logger.log("Added client id: " + id);
        }
    }

    public void removeClient(Client client){
        int id = client.getId();
        if(clients.contains(client)){
            clients.remove(client);
            Logger.log(id, "Removed client id: " + id);
        } else {
            Logger.log(id, "Account not found - id: " + id);
        }
    }

    public void store(){
        try{
            FileOutputStream fileOut = new FileOutputStream("bank.data");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(this.clients);
            objOut.close();
            Logger.log("Saved state to bank.data");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    private void load() throws Exception{
        FileInputStream fileIn = new FileInputStream("bank.data");
        ObjectInputStream objIn = new ObjectInputStream(fileIn);
        clients = (ArrayList<Client>) objIn.readObject();
        Logger.log("Loaded bank state from bank.data");
        objIn.close();
    }

    private Client getClient(int id) throws ClientNotFoundException{
        for(Client cli: clients){
            if(cli.getId() == id){
                return cli;
            }
        }
        throw new ClientNotFoundException(id);
    }

    public ArrayList<Client> getClients(){
        return this.clients;
    }

    public void printClientList(){
        for(Client client: this.clients){
            System.out.println(client);
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "clients=" + clients +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(clients, bank.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clients);
    }

    // todo: implement viewLogs() function when time comes
    // todo: implement startAccountUpdater() function when time comes
}
