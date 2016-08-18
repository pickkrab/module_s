package ru.sbt.social_network.interfaces;

import org.junit.Test;
import ru.sbt.social_network.user.interfaces.UserSkills;
import ru.sbt.social_network.user.interfaces.UserSkillsImpl;

import static org.junit.Assert.*;

/**
 * Created by alexander on 18.08.16.
 */
public class UserSkillsImplTest {
    UserSkills user_skills = new UserSkillsImpl();

    @Test
    public void getList() {
        user_skills.find_friend("misha", "pupkin");
    }

    @Test(expected = RuntimeException.class)
    public void fail() {
        user_skills.login("sbt@sbt.ru","12345");
    }


}
