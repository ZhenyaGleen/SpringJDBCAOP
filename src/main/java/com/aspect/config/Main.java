package com.aspect.config;

import com.aspect.dao.PersonDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        System.out.println( personDAO.getPersonById(2L));
    }
}
