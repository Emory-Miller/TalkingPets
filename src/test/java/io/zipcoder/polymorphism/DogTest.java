package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void constructorTest() {

        Dog dog = new Dog("Rudy");

        String expected = "Rudy";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {

        Dog dog = new Dog("Rudy");

        String expected = "wuf";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

}