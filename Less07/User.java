package org.example;

public class User { // класс Пользователь
    private String first_name; // имя
    private String last_name; // фамилия
    private Basket bask; // объект класса Корзина

    public User() {
    }

    public User(String first_name, String last_name, Basket bask) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.bask = bask;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBask() {
        String sStr = "\n";
        sStr = this.bask.getBuy(); // вывод товаров в корзине
        return sStr;
    }

    public void setBask(Basket bask) {
        this.bask = bask;
    }
}
