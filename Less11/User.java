package org.example;

public abstract class User {
    String dateBirth;
    String fio;
    int ID;

    public User(String dateBirth, String fio, int ID) {
        this.dateBirth = dateBirth;
        this.fio = fio;
        this.ID = ID;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "dateBirth=" + dateBirth +
                ", fio='" + fio + '\'' +
                ", ID=" + ID +
                '}';
    }
}
