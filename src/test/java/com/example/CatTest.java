package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CatTest{

    @Test
    public void getSoundCatReturnMeow() {
        final Feline feline = new Feline();
        final Cat cat = new Cat(feline);

        final String expectedSound = "Мяу";
        final String actualSound = cat.getSound();

        assertEquals("Ожидаемый звук - 'Мяу'", expectedSound, actualSound);
    }

    @Test
    public void getFoodCatReturnMeatList() throws Exception{
        final Feline feline = new Feline();
        final Cat cat = new Cat(feline);

        final List<String> expectedMeatList = Arrays.asList("Животные", "Птицы", "Рыба");
        final List<String> actualMeatList = cat.getFood();

        assertEquals("Ожидался список: 'Животные', 'Птицы', 'Рыба'", expectedMeatList, actualMeatList);
    }
}