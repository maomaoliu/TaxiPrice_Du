package com.thoughtworks;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11-12-3
 * Time: 下午4:14
 * To change this template use File | Settings | File Templates.
 */
public class Price {
    private static final int ZERO = 0;
    private static final int THREE_MILES = 3;
    private static final double BASIC_PRICE = 6.0;
    private static final double PRICE_PER_MILE = 1.5;

    /**
     * Description:
     * Created by 董登, 杜娟
     * @param miles
     * @return
     */
    public double total(int miles) {
        Calculate calculate = new Calculate(miles);
        return calculate.outputTotalPrice();
    }

    private double outputPriceOverThreeMiles(int miles) {
        return BASIC_PRICE + (miles - THREE_MILES) * PRICE_PER_MILE;
    }

    private double outputPriceWithinThreeMiles() {
        return BASIC_PRICE;
    }

    private double outputPriceWithoutMoving() {
        return 0.0;
    }

    /**
     * Decription: Input the miles
     * Created by 李栋
     * @param args
     */
    public static void main(String args[]){
        Price price=new Price();
        System.out.println("输入公里数：");
        Scanner in=new Scanner(System.in);
        int distance=in.nextInt();
        double result=price.total(distance);
        System.out.print("您需要付");
        System.out.print(result);
        System.out.println("元");
    }
}
