package org.example;

public class Category { // класс Категория
    private String name; // имя
    private Product[] products; // товары

    public Category() {
    }

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducts() {
        String sStr = "";
        for (int i = 0; i < products.length; i++) {
            sStr += "\n  " + this.products[i].getRating() + "  " +
                    this.products[i].getName() + "  " +
                    this.products[i].getPrice() + " руб.";
        }
        return sStr;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
