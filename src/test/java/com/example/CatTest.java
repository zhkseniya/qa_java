package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest{

    @Mock
    private Feline feline;

    @Test
    public void getSoundCatReturnMeow() {
        final Cat cat = new Cat(feline);
        final String expectedSound = "Мяу";
        final String actualSound = cat.getSound();

        assertEquals("Ожидаемый звук - 'Мяу'", expectedSound, actualSound);
    }

    @Test
    public void getFoodCatReturnMeatList() throws Exception{
        final Cat cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        final List<String> expectedMeatList = Arrays.asList("Животные", "Птицы", "Рыба");
        final List<String> actualMeatList = cat.getFood();

        assertEquals("Ожидался список: 'Животные', 'Птицы', 'Рыба'", expectedMeatList, actualMeatList);
    }
}