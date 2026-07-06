package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackerTest {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmountIsOver1000() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }
}
