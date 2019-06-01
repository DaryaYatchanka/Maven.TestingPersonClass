package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testSetAddress(){
        Person person = new Person();
        String expected = "356 Market St, Wilmington, DE";

        person.setAddress(expected);

        String actual = person.getAddress();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetDateOfBirth(){
        Person person = new Person();
        Date date = new Date(1991, 9,23);

        person.setDateOfBirth(date);

        Date actual = person.getDateOfBirth();
        Assert.assertEquals(date, actual);
    }

    @Test
     public void testSetPhoneNumber(){
        Person person = new Person();
        Integer expected = 305546789;

        person.setPhoneNumber(expected);

        Integer actual = person.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }

}
