package com.acecademy.experiment;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class JdbcTemplateDemoTest extends TestCase {

    ApplicationContext context = new AnnotationConfigApplicationContext(JdbcExpConfig.class);
    StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

    @Test
    public void testInsert() {
        Student student = new Student(14, "Shyam", "Jaipur");
        int insert = studentDao.insert(student);
        System.out.println("Insert result : " + insert);
    }

    @Test
    public void testUpdate() {
        Student student = new Student(14, "Shyam", "Udaipur");
        int insert = studentDao.update(student);
        System.out.println("Insert result : " + insert);
    }

    @Test
    public void testDelete() {
        int res = studentDao.delete(13);
        System.out.println("Delete result : " + res);
    }

    @Test
    public void testGet() {
        Student student = studentDao.getStudent(14);
        System.out.println(student);
    }


    @Test
    public void testGetAll() {
        List<Student> students = studentDao.getAll();
        System.out.println(students);
    }


}