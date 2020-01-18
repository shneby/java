package com.exercisepdf.banksystem.model;

import com.exercisepdf.banksystem.exceptions.ClientAlreadyExistsException;
import com.exercisepdf.banksystem.exceptions.ClientNotFoundException;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private ArrayList<Client> clients;
    private Logger logService =  new Logger("");
    //todo: add account updater

    public Bank(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public float getBalance(){
        float grandTotal = 0;
        for(Client client: this.clients){
            grandTotal += client.getFortune();
        }
        return grandTotal;
    }

    public void addClient(Client client) throws ClientAlreadyExistsException {
        boolean foundClient = false;
        for(Client cli: this.clients){
            if(client.equals(cli)){
                foundClient = true;
                break;
            }
        }
        if(foundClient){
            throw new ClientAlreadyExistsException(client.getId());
        } else {
            int clientId = client.getId();
            this.clients.add(client);
            logService.log(new Log(clientId, String.format("bank update - added client %d to clients", clientId), 0f));
        }
    }

    public void removeClient(int id) throws ClientNotFoundException {
        Client client = null;
        for(Client cli: this.clients){
            if(id == cli.getId()){
                client = cli;
                break;
            }
        }
        if(client == null){
            throw new ClientNotFoundException(id);
        } else {
            this.clients.remove(client);
            this.logService.log(new Log(id, String.format("client update - removed account %d from accounts", id), 0f));
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "clients=" + clients +
                ", logService=" + logService +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(clients, bank.clients) &&
                Objects.equals(logService, bank.logService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clients, logService);
    }
}
