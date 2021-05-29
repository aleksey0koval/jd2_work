package com.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
//        Cat cat = context.getBean(Cat.class);

        Person person = context.getBean(Person.class);

        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        person.sayPerson();

        context.close();
    }

}

