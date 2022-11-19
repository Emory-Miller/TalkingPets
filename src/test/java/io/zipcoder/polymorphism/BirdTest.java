package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    @Test
    public void constructorTest() {

        Bird bird = new Bird("Emro");

        String expected = "Emro";
        String actual = bird.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {

        Bird bird = new Bird("Emro");

        String expected = "SQUAWK";
        String actual = bird.speak();

        Assert.assertEquals(expected, actual);
    }
}