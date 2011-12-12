package com.thoughtworks;

import org.junit.Assert;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11-12-3
 * Time: 下午4:07
 * To change this template use File | Settings | File Templates.
 */
public class TestPrice {

    private Calculate calculate = new Calculate();

    @Test
    public void testTrue() {
        Assert.assertTrue(true);
    }

    @Test
    public void ouputPriceWithoutMoving() {
        assertThat(calculate.taxiPrice(0), is(0.0));
    }

   @Test
    public void outputPriceWithinThreeMiles() {
        assertThat(calculate.taxiPrice(1), is(6.0));
    }

    @Test
    public void outputPriceOverThreeMiles() {
        assertThat(calculate.taxiPrice(3.5), is(7.5));
    }

}
