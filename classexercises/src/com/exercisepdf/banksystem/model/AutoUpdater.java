package com.exercisepdf.banksystem.model;

import java.util.List;
import java.util.Objects;

public class AutoUpdater implements Runnable {

    private List<Client> clientList;

    public AutoUpdater(List<Client> clientList) {
        this.clientList = clientList;
    }

    @Override
    public void run() {
        for(Client client: clientList){
            client.autoUpdateAccounts();
        }
    }

    @Override
    public String toString() {
        return "AutoUpdater{" +
                "clientList=" + clientList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoUpdater that = (AutoUpdater) o;
        return Objects.equals(clientList, that.clientList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientList);
    }
}
