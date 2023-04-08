package org.example;

import java.util.List;

/**
 * Принцип разделения интерфейса ->
 * Interface Segregation Principle
 * Принцип инверсии зависимостей ->
 * Dependency Inversion Principle
 */
public class UsersService implements ReadService {

    @Override
    public List<User> read(List<User> users) {
        return users;
    }
}
