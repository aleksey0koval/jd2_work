package com.spring_introduction;

import org.springframework.beans.factory.annotation.Value;

//@Component
public class Person {

//    @Autowired
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        System.out.println("Person is created!");
        this.pet = pet;
    }

    public void sayPerson(){
        System.out.println("Person say");
        pet.say();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
