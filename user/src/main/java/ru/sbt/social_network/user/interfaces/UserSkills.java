package ru.sbt.social_network.user.interfaces;

import ru.sbt.social_network.user.domain.User;

/**
 * Created by alexander on 18.08.16.
 */
public interface UserSkills {
    String login(String email, String password);
    User find_friend(String name, String lastname);
    void add_friends(String name, String lastname);

}
