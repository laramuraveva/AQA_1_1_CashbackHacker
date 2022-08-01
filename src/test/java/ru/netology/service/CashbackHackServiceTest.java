package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void test() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 900;
        int actual = cashbackHackService.remain(100);
        assertEquals(expected, actual);
    }

}
