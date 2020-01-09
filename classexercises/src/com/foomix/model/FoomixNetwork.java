package com.foomix.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FoomixNetwork {
    private MarketPlace marketPlace;
    private User[] users = new User[0];

    public FoomixNetwork(MarketPlace marketPlace) {
        this.marketPlace = marketPlace;
    }

    public void addUser(User user){
        List<User> userList = new ArrayList<>(Arrays.asList(this.users));
        userList.add(user);
        this.users = userList.toArray(this.users);
    }

    @Override
    public String toString() {
        return "FoomixNetwork{" +
                "marketPlace=" + marketPlace +
                ", users=" + Arrays.toString(users) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoomixNetwork that = (FoomixNetwork) o;
        return Objects.equals(marketPlace, that.marketPlace) &&
                Arrays.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(marketPlace);
        result = 31 * result + Arrays.hashCode(users);
        return result;
    }

    public MarketPlace getMarketPlace() {
        return marketPlace;
    }

    public void setMarketPlace(MarketPlace marketPlace) {
        this.marketPlace = marketPlace;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
