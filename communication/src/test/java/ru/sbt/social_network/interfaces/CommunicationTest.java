package ru.sbt.social_network.interfaces;

import org.junit.Test;

/**
 * Created by alexander on 18.08.16.
 */
public class CommunicationTest {
    Message test_message = new MessageImpl();

    @Test(expected = RuntimeException.class)
    public void fail_message() {
        test_message.letter("user_1", "user_2", "+");
    }
}
