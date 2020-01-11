package com.foomix.model.game;

public enum GameType {
    FARM_TOWN(0),
    MAFIA_STRUGGLE(1);

    private long id;

    GameType(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

}
