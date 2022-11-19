package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void constructorTest() {

        Cat cat = new Cat("Kimba");

        String expected = "Kimba";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {

        Cat cat = new Cat("Kimba");

        String expected = "MEEEAAAAAOOO";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

}