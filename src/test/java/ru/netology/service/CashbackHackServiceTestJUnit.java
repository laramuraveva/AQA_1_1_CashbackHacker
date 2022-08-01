package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTestJUnit {

    @Test
    public void shouldCashbackBefore1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 100;
        int actual = cashbackHackService.remain(900);

        Assertions.assertEquals(expected, actual,"Докупить на 100р.");

    }

    @Test
    public void shouldCashbackUnder1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 900;
        int actual = cashbackHackService.remain(1100);

        Assertions.assertEquals(expected, actual, "Докупить на 900р");
    }
}