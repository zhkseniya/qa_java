package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest{

    @Mock
    private Feline feline;

    @Test(expected = Exception.class)
    public void getExceptionLionIncorrectLionSex() throws Exception {
        final Lion lion = new Lion("Samka", feline);
    }

    @Test(expected = AssertionError.class)
    public void exceptionTextTest() throws AssertionError {
        try {
            final Lion lion = new Lion("Samka", feline);
            Assert.fail("Expected AssertionError");
        } catch (Exception thrown) {
            Assert.assertNotEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }
    }

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
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));

        final Lion lion = new Lion("Самец", feline);

        final List<String> expectedMeatList = Arrays.asList("Животные", "Птицы", "Рыба");
        final List<String> actualMeatList = lion.getFood();

        assertEquals("Ожидался список: 'Животные', 'Птицы', 'Рыба'", expectedMeatList, actualMeatList);
    }
}