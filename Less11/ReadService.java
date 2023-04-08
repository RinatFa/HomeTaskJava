package org.example;

import java.util.List;

/**
 * Принцип инверсии зависимостей ->
 * Dependency Inversion Principle
 * Открыт для расширения, но закрыт для изменения ->
 * Open-Closed Principle
 */
public interface ReadService {
    List<User> read(List<User> users);
}
