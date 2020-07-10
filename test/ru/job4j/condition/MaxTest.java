package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void max() {
        assertThat(Max.max(5, 2), is(5));
    }

    @Test
    public void whenMaxIsNine() {
        assertThat(Max.max(5, 2, 9), is(9));
    }

    @Test
    public void whenMaxIsTwenty() {
        assertThat(Max.max(5, 2, 9, 20), is(20));
    }
}
