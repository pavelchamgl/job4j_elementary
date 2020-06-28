package ru.job4j.calculator;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class X2Test {

    @Test
    public void whenBCZero() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenResultThree() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenResultTwo() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenResultAgainTwo() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenResultOne() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
         int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }
}