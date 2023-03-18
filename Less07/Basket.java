package org.example;

public class Basket { // класс Корзина
    private Product[] buy;

    public Basket() {
    }

    public Basket(Product[] buy) {
        this.buy = buy;
    }

    public String getBuy() {
        String sStr = "";
        for (int i = 0; i < buy.length; i++) {
            sStr += "\n  " + this.buy[i].getRating() + "  " +
                    this.buy[i].getName() + "  " +
                    this.buy[i].getPrice() + " руб.";
        }
        return sStr;
    }

    public void setBuy(Product[] buy) {
        this.buy = buy;
    }
}
