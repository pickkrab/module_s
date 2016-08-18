package ru.sbt.social_network.user.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by alexander on 18.08.16.
 */
public class User {
    private final int id;
    private final String name;
    private final String lastname;
    private final Date date;
    private final List<User> friends;
    private final String email;

    public User(int id, String name, String lastname, Date date, List<User> friends, String email) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.date = date;
        this.friends = friends;
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public Date getDate() {
        return date;
    }
    public List<User> getFriends() {
        return friends;
    }
    public String getEmail() {
        return email;
    }
}
