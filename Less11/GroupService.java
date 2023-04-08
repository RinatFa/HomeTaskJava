package org.example;

/**
 * Принцип разделения интерфейса ->
 * Interface Segregation Principle
 * Открыт для расширения, но закрыт для изменения ->
 * Open-Closed Principle
 */
public interface GroupService {
    StudyGroup create(StudyGroup studygroup);
}
