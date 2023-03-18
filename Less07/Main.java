package org.example;

// Задача:
// 1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
// 2)Создать класс Категория, имеющий переменные имя и массив товаров.
// Создать несколько объектов класса Категория.
// 3)Создать класс Basket, содержащий массив купленных товаров.
// 4)Создать класс User, содержащий логин, пароль и объект класса Basket.
// Создать несколько объектов класса User.
// 5)Вывести на консоль каталог продуктов. (все продукты магазина)
// 6)Вывести на консоль покупки посетителей магазина. (После покупки
// у пользователя добавляется товар, а из магазина - удаляется)

public class Main {
        static void ProdSpis(Product[] pr) { // отображение списка продуктов
                if (pr.length > 0) {
                        for (int i = 1; i < pr.length + 1; i++) {
                                System.out.println(pr[i - 1].getRating() + "  " +
                                                pr[i - 1].getName() + " - " +
                                                pr[i - 1].getPrice() + " руб.");
                        }
                } else {
                        System.out.println("Список пустой!");
                }
        }

        static Product[] ProdFree(Product[] pr, int rating) { // удаление продуктов из списка
                Product[] temp = new Product[0];
                if (pr.length > 0) { // удаляет 1 товар
                        temp = new Product[pr.length - 1];
                        int j = 0;
                        for (int i = 0; i < pr.length; i++) {
                                if (pr[i].getRating() == rating) {
                                } else {
                                        temp[j] = pr[i];
                                        j += 1;
                                }
                        }
                        pr = temp;
                }
                return pr;
        }

        static Product[] ProdBuy(Product[] pr, Product[] all, int rating) { // добавление продуктов в список
                Product[] temp = new Product[0];
                if (pr.length >= 0) { // добавляет 1 товар
                        temp = new Product[pr.length + 1];
                        for (int i = 0; i < pr.length; i++) {
                                temp[i] = pr[i];
                        }
                        pr = temp;
                        pr[pr.length - 1] = all[rating - 1];
                }
                return pr;
        }

        public static void main(String[] args) {
                Product rose = new Product("RoseRed", 200, 1);
                Product tulip = new Product("RedTulip", 100, 2);
                Product pion = new Product("RedPeony", 400, 3);
                Product wine1 = new Product("SparklingWine", 650, 4);
                Product wine2 = new Product("SemiSweetWine", 450, 5);
                Product wine3 = new Product("DryWine", 550, 6);
                Product cake1 = new Product("SpongeCake", 600, 7);
                Product cake2 = new Product("WaffleCake", 400, 8);
                Product cake3 = new Product("ShortbreadCake", 500, 9);
                // массив всех классов Товар:
                Product[] all = new Product[] { rose, tulip, pion, wine1, wine2, wine3, cake1, cake2, cake3 };

                System.out.println();
                System.out.println("---------------------");
                Product[] flowers = new Product[] { rose, tulip, pion }; // массив цветов
                Product[] wines = new Product[] { wine1, wine2, wine3 }; // массив вин
                Product[] cakes = new Product[] { cake1, cake2, cake3 }; // массив тортов

                System.out.println("Список товаров в магазине до покупок: ");
                System.out.println("  Можно выбрать цветы из " + flowers.length + ":");
                ProdSpis(flowers);
                System.out.println("  Можно выбрать вино из " + wines.length + ":");
                ProdSpis(wines);
                System.out.println("  Можно выбрать торты из " + cakes.length + ":");
                ProdSpis(cakes);

                Product[] buy = new Product[0]; // массив разных товаров
                int rating = 1;
                buy = ProdBuy(buy, all, rating); // выбор товара
                flowers = ProdFree(flowers, rating); // наличие цветов после покупки
                rating = 6;
                buy = ProdBuy(buy, all, rating); // выбор товара
                wines = ProdFree(wines, rating); // наличие вин после покупки
                Basket bask1 = new Basket(buy);

                buy = new Product[0]; // массив разных товаров
                rating = 5;
                buy = ProdBuy(buy, all, rating); // выбор товара
                wines = ProdFree(wines, rating); // наличие вин после покупки
                Basket bask2 = new Basket(buy);

                buy = new Product[0]; // массив разных товаров
                rating = 8;
                buy = ProdBuy(buy, all, rating); // выбор товара
                cakes = ProdFree(cakes, rating); // наличие тортов после покупки
                Basket bask3 = new Basket(buy);

                User user1 = new User("Андрей", "Петров", bask1);
                User user2 = new User("Сергей", "Иванов", bask2);
                User user3 = new User("Петр", "Новиков", bask3);
                User[] users = new User[] { user1, user2, user3 }; // массив покупателей

                System.out.println("---------------------");
                for (int i = 1; i < users.length + 1; i++) {
                        System.out.println(i + " покупатель " + users[i - 1].getFirst_name() + " " +
                                        users[i - 1].getLast_name() + " добавил в корзину: " +
                                        users[i - 1].getBask());
                }

                Category flowers2 = new Category("Цветы", flowers);
                Category wines2 = new Category("Вино", wines);
                Category cakes2 = new Category("Торты", cakes);
                Category[] prodList = new Category[] { flowers2, wines2, cakes2 }; // массив категорий

                System.out.println("---------------------");
                System.out.println("Список товаров после покупок: ");
                for (int i = 1; i < prodList.length + 1; i++) {
                        System.out.println(i + ". " + prodList[i - 1].getName() + ": " +
                                        prodList[i - 1].getProducts());
                }
                System.out.println();
        }
}
