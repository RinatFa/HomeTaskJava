package org.example;

/**
 * Принцип разделения интерфейса ->
 * Interface Segregation Principle
 * Принцип инверсии зависимостей ->
 * Dependency Inversion Principle
 */
public class UserService implements DataService {

    @Override
    public User create(Student student) {
        return student;
    }

    @Override
    public User create(Teacher teacher) {
        return teacher;
    }
}
