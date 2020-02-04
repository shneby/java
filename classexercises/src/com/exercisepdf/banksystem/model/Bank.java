package com.exercisepdf.banksystem.model;

import com.exercisepdf.banksystem.model.exceptions.ClientAlreadyAddedException;
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
            Logger.log(new Log(0, "bank [load] - unable to load state from bank.data", 0f));
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

    public void addClient(Client client) throws ClientAlreadyAddedException {
        int id = client.getId();
        if(clients.contains(client)){
            throw new ClientAlreadyAddedException(id);
        }
        this.clients.add(client);
        Logger.log(new Log(id, String.format("bank [add] - added client %d", id), 0f));
    }

    public void store(){
        try{
            FileOutputStream fileOut = new FileOutputStream("bank.data");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(this.clients);
            objOut.close();
            Logger.log(new Log(0, "bank [save] - saved state to bank.data", 0f));
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    private void load() throws Exception{
        FileInputStream fileIn = new FileInputStream("bank.data");
        ObjectInputStream objIn = new ObjectInputStream(fileIn);
        this.clients = (ArrayList<Client>) objIn.readObject();
        Logger.log(new Log(0, "bank [load] - loaded bank state from bank.data", 0f));
        objIn.close();
    }

    public void removeClient(Client client){
        int id = client.getId();
        clients.remove(client);
        Logger.log(new Log(id, String.format("bank [remove] - removed client %d", id), 0f));
    }

    private Client getClient(int id) throws ClientNotFoundException{
        for(Client cli: this.clients){
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
