package ru.sbt.social_network.interfaces;

import ru.sbt.social_network.user.domain.User;

/**
 * Created by alexander on 18.08.16.
 */
public class ClientImpl implements Client{
    private final Message message;
    private final UserSkills user;
    private int user_id;

    public ClientImpl(Message message, User user) {
        this.message = message;
        this.user = user;
    }

    @Override
    public void add_friends(String name, String last_name) {
        user.add_friends(name, last_name);
    }

    @Override
    public User find_friend(String name, String lastname) {
        return user.find_friend(name, lastname);
    }

    @Override
    public void login(String email, String password) {
        int id = Integer.parseInt(user.login(email, password));
        this.user_id = id;
    }

}
