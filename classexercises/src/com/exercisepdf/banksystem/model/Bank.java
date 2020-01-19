package com.exercisepdf.banksystem.model;

import com.exercisepdf.banksystem.model.exceptions.ClientAlreadyAddedException;
import com.exercisepdf.banksystem.model.exceptions.ClientNotFoundException;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private static Bank instance;
    private static float totalCommissons = 0;

    ArrayList<Client> clients;

    private Bank(){
        this.clients = new ArrayList<>();
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
        boolean clientFound = false;
        for(Client cli: this.clients){
            if(client.getId() == id){
                clientFound = true;
                break;
            }
        }
        if(clientFound){
            throw new ClientAlreadyAddedException(id);
        } else {
            this.clients.add(client);
            Logger.log(new Log(id, String.format("bank [add] - added client %d", id), 0f));
        }
    }

    public void removeClient(Client client){
        int id = client.getId();
        this.clients.remove(client);
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
