package org.example.controller;

import org.example.*;
import org.example.veiw.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void buttonClick() {
        UserService us = new UserService();

        List<Integer> group1 = new ArrayList<>();
        group1.add(1);
        group1.add(3);
        List<Integer> group2 = new ArrayList<>();
        group2.add(2);
        group2.add(4);
        Teacher teach1 = new Teacher(15, group1, "17.01.1983", "Петров П.П.", 1);
        Teacher teach2 = new Teacher(12, group2, "10.03.1985", "Сидоров С.С.", 2);

        List<User> studs1 = new ArrayList<>();
        studs1.add(us.create(new Student(1, "15.02.2004", "Котов К.К.", 1)));
        studs1.add(us.create(new Student(1, "03.10.2003", "Грачев Г.Г", 2)));
        studs1.add(us.create(new Student(1, "12.11.2003", "Гусев А.А.", 3)));
        List<User> studs2 = new ArrayList<>();
        studs2.add(us.create(new Student(2, "12.09.2003", "Соколов С.С.", 4)));
        studs2.add(us.create(new Student(2, "05.03.2004", "Карасев К.К.", 5)));
        studs2.add(us.create(new Student(2, "23.10.2003", "Орлов О.О.", 6)));
        List<User> studs3 = new ArrayList<>();
        studs3.add(us.create(new Student(3, "26.03.2004", "Крутов В.В", 7)));
        studs3.add(us.create(new Student(3, "04.08.2003", "Бобров Б.Б.", 8)));
        studs3.add(us.create(new Student(3, "21.11.2003", "Рыбников Р.Р.", 9)));

        StudyGroupService sgs = new StudyGroupService();
        List<StudyGroup> studsgrs = new ArrayList<>();
        studsgrs.add(sgs.create(new StudyGroup(1, teach1, studs1)));
        studsgrs.add(sgs.create(new StudyGroup(2, teach2, studs2)));
        studsgrs.add(sgs.create(new StudyGroup(3, teach1, studs3)));

        View view = new View();
        System.out.println();
        System.out.println(view.grView(studsgrs));
    }
}
