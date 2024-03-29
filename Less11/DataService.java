package org.example;

/**
 * Принцип разделения интерфейса ->
 * Interface Segregation Principle
 * Открыт для расширения, но закрыт для изменения ->
 * Open-Closed Principle
 */
public interface DataService {
    User create(Student student);

    User create(Teacher teacher);
}
