package com.zipcodewilmington.person;

import com.sun.xml.internal.ws.encoding.DataSourceStreamingDataHandler;

import java.util.Date;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String address;
    private Date dateOfBirth;
    private int phoneNumber;

    public Person() {

    }

    public Person(int age) {
        this.age=age;

    }

    public Person(String name) {
         this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;

       // System.out.println();
    }

    public void setAge(int age) {
       this.age=age;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setDateOfBirth(Date dateOfBirth){

        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getName() {

        return this.name;
    }

    public Integer getAge() {

        return this.age;
    }

    public String getAddress(){
        return this.address;
    }

    public Date getDateOfBirth(){

        return this.dateOfBirth;
    }

    public Integer getPhoneNumber(){
        return this.phoneNumber;
    }
}
