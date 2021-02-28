package it.academy;

import it.academy.service.PromoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        final Object promoService = (PromoService) ac.getBean("promoService");

        System.out.println(promoService);

        ((PromoService)promoService).printPromo();
        ((ClassPathXmlApplicationContext)ac).close();

    }
}
