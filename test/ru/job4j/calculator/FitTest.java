package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double expected = 100.05;
        double out = Fit.manWeight(187);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double expected = 57.5;
        double out = Fit.womanWeight(160);
        Assert.assertEquals(expected, out, 0.01);
    }
}