package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean(UniLibrary.class);
        Book book = context.getBean(Book.class);
        uniLibrary.getBook();
        uniLibrary.addBook("Aleksey", book);
        uniLibrary.addMagazine();

//        SchoolLibrary schoolLibrary = context.getBean(SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();

    }
}
