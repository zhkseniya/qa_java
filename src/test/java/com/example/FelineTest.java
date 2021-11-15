package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FelineTest{

    @Test
    public void eatMeatReturnMeatList() throws Exception {
        final Feline feline = new Feline();
        final List<String> expectedMeatList = Arrays.asList("Животные", "Птицы", "Рыба");
        final List<String> actualMeatList = feline.getFood("Хищник");

        assertEquals("Ожидался список: 'Животные', 'Птицы', 'Рыба'", expectedMeatList, actualMeatList);
    }

    @Test
    public void getFamilyReturnFeline() {
        final Feline feline = new Feline();
        final String expectedSound = "Кошачьи";
        final String actualSound = feline.getFamily();

        assertEquals("Ожидаемое семейство - 'Кошачьи'", expectedSound, actualSound);
    }

    @Test
    public void getKittensReturnCorrectKittensCount() {
        final Feline feline = new Feline();

        final int expectedKittensCount = 1;
        final int actualKittensCounts = feline.getKittens();

        assertEquals("Ожидаемое количество котят не соответствует полученному", expectedKittensCount, actualKittensCounts);
    }
}