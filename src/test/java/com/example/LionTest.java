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
public class LionTest{

    @Mock
    private Feline feline;

    @Test
    public void getKittensReturnCorrectKittensCount() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);

        final Lion lion = new Lion("Самка", feline);
        final int expectedKittensCount = 1;
        final int actualKittensCounts = lion.getKittens();

        assertEquals("Ожидаемое количество котят не соответствует полученному", expectedKittensCount, actualKittensCounts);

    }

    @Test
    public void doesHaveManeReturnTrue() throws Exception {
        final Lion lion = new Lion("Самец", feline);
        final boolean actualHaseMane = lion.doesHaveMane();

        assertTrue("Ожидаемое значение не соответствует правде", actualHaseMane);
    }

    @Test
    public void doesHaveManeReturnFalse() throws Exception {
        final Lion lion = new Lion("Самка", feline);
        final boolean actualHaseMane = lion.doesHaveMane();

        assertFalse("Ожидаемое значение правда", actualHaseMane);
    }

    @Test
    public void getFoodReturnMeatList() throws Exception{
        final Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getFood()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        final List<String> expectedMeatList = Arrays.asList("Животные", "Птицы", "Рыба");
        final List<String> actualMeatList = lion.getFood();

        assertEquals("Ожидался список: 'Животные', 'Птицы', 'Рыба'", expectedMeatList, actualMeatList);
    }
}