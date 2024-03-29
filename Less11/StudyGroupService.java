package org.example;

/**
 * Принцип разделения интерфейса ->
 * Interface Segregation Principle
 * Принцип инверсии зависимостей ->
 * Dependency Inversion Principle
 */
public class StudyGroupService implements GroupService {

    @Override
    public StudyGroup create(StudyGroup studygroup) {
        return studygroup;
    }
}
