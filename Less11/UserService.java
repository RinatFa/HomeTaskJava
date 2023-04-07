package org.example;

import java.util.List;

public class UserService implements DataService {

    @Override
    public User create(Student student) {
        return student;
    }

    @Override
    public User create(Teacher teacher) {
        return teacher;
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }
}