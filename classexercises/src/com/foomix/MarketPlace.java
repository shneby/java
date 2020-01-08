package com.foomix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarketPlace {
    private Game[] games = new Game[0];

    public MarketPlace(){}

    public MarketPlace(Game[] games) {
        this.games = games;
    }

    public void addGame(Game game){
        List<Game> userList = new ArrayList<>(Arrays.asList(this.games));
        userList.add(game);
        this.games = userList.toArray(this.games);
    }

    @Override
    public String toString() {
        return "MarketPlace{" +
                "games=" + Arrays.toString(games) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketPlace that = (MarketPlace) o;
        return Arrays.equals(games, that.games);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(games);
    }

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }
}
