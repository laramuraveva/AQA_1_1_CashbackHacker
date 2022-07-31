package ru.netology.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @Test
    public void test() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 900;
        int actual = cashbackHackService.remain(100);
        assertEquals(expected, actual);
    }

//    @Test
//    public void test2() {
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int expected = 1000;
//        int actual = cashbackHackService.remain(2000);
//        assertEquals(expected, actual);
//    }
}
