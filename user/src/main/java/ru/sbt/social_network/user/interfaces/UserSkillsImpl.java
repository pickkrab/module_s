package ru.sbt.social_network.user.interfaces;

import ru.sbt.social_network.user.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexander on 18.08.16.
 */
public class UserSkillsImpl implements UserSkills {

    List<User> list = new ArrayList<User>();
    //храним в list всех пользователей
    List<User> list2 = new ArrayList<User>();
    //список друзей нашего юзера
    //реализация условная
    @Override
    public String login(String email, String password) {
        if (email.equals("javaschool") & (password.equals("12345"))) {
            System.out.println("Рады вас видеть");
        }
        else {
            System.out.println("Невервый логин/пароль");
        }
        return null;
    }
    @Override
    public User find_friend(String name, String lastname) {
        for (User ll : list2) {
            if (ll.getName().equals(name) & ll.getLastname().equals(lastname))
                return ll;
            else {
                throw new RuntimeException("такого друга нет");
            }
        }
        return null;

    }
    @Override
    public void add_friends(String name, String lastname) {
        for (User ll : list) {
            if (ll.getName().equals(name) & ll.getLastname().equals(lastname))
                list2.add(ll);
        }
    }
}
