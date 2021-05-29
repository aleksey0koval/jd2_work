package com.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigAnnotation1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person = context.getBean(Person.class);
        person.sayPerson();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
