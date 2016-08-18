package ru.sbt.social_network.interfaces;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import ru.sbt.social_network.user.domain.User;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

/**
 * Created by alexander on 18.08.16.
 */
public class ClientTest {

    @Mock
    public User user;

    @Mock
    public Message message;

    Client client;

    @Before
    public void initialize() {
        client = new ClientImpl(message, user);
    }

    @Test
    public void check_login() {
        client.login("a", "b");
        verify(user).login("a", "b");
    }

    @Test(expected = RuntimeException.class)
    public void bad_logIn() {
        doThrow(RuntimeException.class).when(user).login("sbt@sbt.ru", "12345");
        client.login("sbt@sbt.ru", "12345");
    }

}

