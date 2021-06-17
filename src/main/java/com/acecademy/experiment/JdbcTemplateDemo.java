package com.acecademy.experiment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTemplateDemo {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcExpConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        Student student = new Student(13, "Manish", "Indore");
        int insert = studentDao.insert(student);
        System.out.println("Insert result : " + insert);
    }
}
