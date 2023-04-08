package org.example;

import java.util.List;

/**
 * Принцип подстановки Барбары Лисков ->
 * Liskov Substitution Principle
 * Единственная ответственность ->
 * Single Responsibility Principle
 */
public class Student extends User {
    int groupID;
    List<Integer> grade;

    public Student(String dateBirth, String fio, int ID) {
        super(dateBirth, fio, ID);
    }

    public Student(int groupID, String dateBirth, String fio, int ID) {
        super(dateBirth, fio, ID);
        this.groupID = groupID;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "\n    Студент " + ID +
                ": группа=" + groupID +
                ", фамилия='" + fio + '\'' +
                ", оценки=" + grade +
                ", дата рождения=" + dateBirth;
    }
}
