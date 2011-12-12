package com.thoughtworks;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11-12-4
 * Time: 下午1:46
 * To change this template use File | Settings | File Templates.
 */
public class Calculate {
    public double taxiPrice(double miles) {
        double totalPrice;
        Price price = new Price(miles);

        price.countTotalPrice();
        totalPrice = price.outputTotalPrice();

        return totalPrice;
    }
}
