package org.example.veiw;

import org.example.StudyGroup;
import org.example.User;

import java.util.List;

public class View {
    public String useView(List<User> use) {
        return use.toString();
    }

    public String grView(List<StudyGroup> sg) {
        return sg.toString();
    }

}
