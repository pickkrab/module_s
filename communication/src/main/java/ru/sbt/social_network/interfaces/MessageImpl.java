package ru.sbt.social_network.interfaces;

import ru.sbt.social_network.domain.Communication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alexander on 18.08.16.
 */
public class MessageImpl implements Message {
    private final Map<String, List<Communication>> list = new HashMap<String, List<Communication>>();

    @Override
    public void letter(String Id_1, String Id_2, String message) {
        if (message.length() < 2) {
            throw new RuntimeException("короткое сообщение:)");
        }
        else
            list.get(Id_2).add(new Communication(Id_1, Id_2, message));
    }
}

