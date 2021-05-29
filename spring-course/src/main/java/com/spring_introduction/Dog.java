package com.spring_introduction;

//@Component
//@Primary
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog is created");
    }

    public void say() {
        System.out.println("Gaww");
    }
//
//    @PostConstruct
//    public void init(){
//        System.out.println("Init dog");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Destroy dog");
//    }
}
