package com.foomix.model.game;

import com.foomix.model.User;

import java.util.List;
import java.util.Objects;
import java.util.UUID;


public abstract class Game {
    private final UUID uuid = UUID.randomUUID();
    private final long id;
    private List<User> users;

    public Game(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Game{" +
                "uuid=" + uuid +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id &&
                uuid.equals(game.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, id);
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public List<User> getUsers() {
        //todo: Return in a better format
        return users;
    }

    public UUID getUuid() {
        return uuid;
    }

    public long getId() {
        return id;
    }
}
