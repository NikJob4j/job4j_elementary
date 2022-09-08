package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Max;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax30To1Then30() {
        int left = 30;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax30To50Then50() {
        int left = 30;
        int right = 50;
        int result = Max.max(left, right);
        int expected = 50;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax50To50Then50() {
        int left = 50;
        int right = 50;
        int result = Max.max(left, right);
        int expected = 50;
        Assert.assertEquals(result, expected);
    }

}