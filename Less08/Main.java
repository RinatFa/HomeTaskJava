package org.example;

// Задача.
// 1)Создайте три класса: Человек, Кот, Робот, которые наследуются от
// одного класса. Эти классы должны уметь бегать и прыгать, все также
// с выводом информации о действии в консоль. 
// 2) Создайте два класса: беговая дорожка и стена, при прохождении
// через которые, участники должны выполнять соответствующие действия
// (бежать или прыгать), результат выполнения печатаем в консоль (успешно
// пробежал, не смог пробежать и т.д.). У препятствий есть длина (для 
// дорожки) или высота (для стены), а участников ограничения на бег и прыжки. 
// 3) Создайте два массива: с участниками и препятствиями, и заставьте 
// всех участников пройти этот набор препятствий. Если участник не смог 
// пройти одно из препятствий, то дальше по списку препятствий он не идет. 

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("---------------------");
        LivingBeing[] livingbeings = {new Cat("Кот Барсик"),
                new Robot("Робот Макс"),
                new Human("Легкоатлет")};
        for (LivingBeing item : livingbeings) {
            item.run();
            item.jump();
        }
        System.out.println("---------------------");
        Obstacle[] obstacles = {new Runningtrack(100), new Runningtrack(1000),
                new Runningtrack(10000), new Wall(0.3),
                new Wall(0.6), new Wall(0.9)};
        for (LivingBeing item : livingbeings) {
            boolean successfully = true;
            for (Obstacle item2 : obstacles) {
                if (item2 instanceof Runningtrack) {
                    if (item.runRunningtrack(item2.getLength())) {
                    } else {
                        System.out.println("--- " + item.name + " завершил эстафету досрочно! ---");
                        successfully = false;
                        break;
                    }
                } else {
                    if (item.jumpWall(item2.getHeight())) {
                    } else {
                        System.out.println("--- " + item.name + " завершил эстафету досрочно! ---");
                        successfully = false;
                        break;
                    }

                }
            }
            if (successfully) {
                System.out.println("***** " + item.name + " УСПЕШНО прошел эстафету! *****");
            }
        }
        System.out.println();
    }
}
