package ru.netology.service;

import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceAPITest {
    @org.junit.jupiter.api.Test

    public void shouldSuggestAddingGoodsIfLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
       Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggestAddingGoodsIfOneUnderBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldNotSuggestAddingGoodsIfEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggestAddingGoodsIfOneUpperBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggestAddingGoodsIfMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1201;

        int actual = service.remain(amount);
        int expected = 799;
        Assertions.assertEquals(expected, actual);
    }
}
