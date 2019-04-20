package com.example.kotlin.chapter3;

public class Main {
    public static void main(String[] args) {
        Preson preson = new Child();
        System.out.println(((Child) preson).getName());
        if (preson instanceof Preson){
            System.out.println(((Child) preson).getName());
        }
    }
}
