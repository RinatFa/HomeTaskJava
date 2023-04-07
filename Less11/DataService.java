package org.example;

import java.util.List;

public interface DataService {
    User create(Student student);

    User create(Teacher teacher);

    List<User> read(List<User> users);
}
