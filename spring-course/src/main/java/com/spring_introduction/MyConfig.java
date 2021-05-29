package com.spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    public Pet petBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(petBean());
    }
}
