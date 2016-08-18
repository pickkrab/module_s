package ru.sbt.social_network.interfaces;

/**
 * Created by alexander on 18.08.16.
 */
public interface Client {
    void add_friends(String name, String last_name);
    User find_friend(String name, String lastname);
    void login(String email, String password);
}
