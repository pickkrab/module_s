package ru.sbt.social_network.domain;

/**
 * Created by alexander on 18.08.16.
 */
public class Communication {
    private final String Id_1;
    private final String Id_2;
    private final String message;

    public Communication(String Id_1, String Id_2, String message) {
        this.Id_1 = Id_1;
        this.Id_2 = Id_2;
        this.message = message;
    }

    public String getId_1() {
        return Id_1;
    }
    public String getId_2() {
        return Id_2;
    }
    public String getMessage() {
        return message;
    }

}
