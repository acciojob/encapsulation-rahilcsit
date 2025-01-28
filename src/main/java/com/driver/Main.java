package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly=new RWOnly();
    //    rwOnly.name="Rahil";
    //    System.out.println(rwOnly.name);//the field is not visible or the field is private.

    rwOnly.setName("Rahil");
    System.out.println(rwOnly.getName());

    }
  
}