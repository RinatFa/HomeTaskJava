package org.example;

import java.util.List;

public class StudyGroup {
    int groupID;
    Teacher teach;
    List<User> studs;

    public StudyGroup(int groupID, Teacher teach, List<User> studs) {
        this.groupID = groupID;
        this.teach = teach;
        this.studs = studs;
    }

    public StudyGroup() {
    }

    @Override
    public String toString() {
        return "\nУчебная группа: " + groupID +
                "\n  учитель = " + teach +
                "  студенты = " + studs;
    }
}
