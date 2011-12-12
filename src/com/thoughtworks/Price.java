package com.thoughtworks;

import static java.lang.Math.ceil;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11-12-3
 * Time: 下午4:14
 * To change this template use File | Settings | File Templates.
 */
public class Price {
    private int itsMiles = 0;
    private double itsPrice = 0.0;
    private static final int ZERO = 0;
    private static final int THREE_MILES = 3;
    private static final double BASIC_PRICE = 6.0;
    private static final double PRICE_PER_MILE = 1.5;

    Price(double miles){
        itsMiles = (int) Math.ceil(miles);
    }

    public double outputTotalPrice() {
        return itsPrice;
    }

    public void countTotalPrice() {
        if (itsMiles == ZERO) {
            countPriceWithoutMoving();
        } else if (itsMiles <= THREE_MILES) {
            countPriceWithinThreeMiles();
        } else {
            countPriceOverThreeMiles();
        }
    }

    private void countPriceOverThreeMiles() {
        itsPrice = BASIC_PRICE + (itsMiles - THREE_MILES) * PRICE_PER_MILE;
    }

    private void countPriceWithinThreeMiles() {
        itsPrice = BASIC_PRICE;
    }

    private void countPriceWithoutMoving() {
        itsPrice = 0.0;
    }
}
