package com.spring_introduction;

//@Component
public class Cat implements Pet {


    public Cat() {
        System.out.println("Cat is created");
    }

//    public void init(){
//        System.out.println("Init Cat");
//    }
//
//    public void destroy(){
//        System.out.println("Destroy Cat");
//    }
    public void say() {
        System.out.println("Moew");
    }
}
