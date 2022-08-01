package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTestNG {

    @Test
    public void shouldCashbackBeforeOneThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
            int actual = cashbackHackService.remain(900);
            int expected = 100;

            assertEquals(actual, expected);

    }

    @Test
    public void shouldCashbackOneThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}