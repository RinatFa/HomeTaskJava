package org.example;

import java.util.List;

/**
 * Принцип подстановки Барбары Лисков ->
 * Liskov Substitution Principle
 * Единственная ответственность ->
 * Single Responsibility Principle
 */
public class Teacher extends User {
    int exp;
    List<Integer> group;

    public Teacher(String dateBirth, String fio, int ID) {
        super(dateBirth, fio, ID);
    }

    public Teacher(int exp, List<Integer> group, String dateBirth, String fio, int ID) {
        super(dateBirth, fio, ID);
        this.group = group;
        this.exp = exp;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Учитель " + ID +
                ": группы=" + group +
                ", фамилия='" + fio + '\'' +
                ", стаж=" + exp +
                ", дата рождения=" + dateBirth + "\n";
    }
}
