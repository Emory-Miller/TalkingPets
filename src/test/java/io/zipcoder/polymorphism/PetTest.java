package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void constructorTest() {

        Pet pet = new Pet("Kimba");

        String expected = "Kimba";
        String actual = pet.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {

        Pet pet = new Pet("Kimba");

        String expected = "";
        String actual = pet.speak();

        Assert.assertEquals(expected, actual);
    }

}