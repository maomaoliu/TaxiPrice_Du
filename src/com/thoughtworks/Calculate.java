package com.thoughtworks;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11-12-4
 * Time: 下午1:46
 * To change this template use File | Settings | File Templates.
 */
public class Calculate {
    private int itsMiles;

    Calculate(int miles) {
        itsMiles = miles;
    }

    Calculate() {
        itsMiles = 0;
    }

    public double outputTotalPrice() {
         itsMiles = countTotalPrice();
    }

    private double countTotalPrice() {

    }
}
