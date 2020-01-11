package com.foomix.model;

import java.util.List;
import java.util.Objects;
import java.util.UUID;


public class FoomixNetwork {
    private final UUID uuid = UUID.randomUUID();
    private MarketPlace marketPlace;
    private List<User> users;

    public FoomixNetwork(MarketPlace marketPlace) {
        this.marketPlace = marketPlace;
    }

    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public String toString() {
        return "FoomixNetwork{" +
                "uuid=" + uuid +
                ", marketPlace=" + marketPlace +
                ", users=" + users +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoomixNetwork that = (FoomixNetwork) o;
        return uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }

    public UUID getUuid() {
        return uuid;
    }

    public MarketPlace getMarketPlace() {
        return marketPlace;
    }

    public List<User> getUsers() {
        //todo: Return in a better format
        return users;
    }
}
