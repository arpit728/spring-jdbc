package com.acecademy;

import com.acecademy.dao.StudentDao;
import com.acecademy.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);


//        int res = studentDao.insert(new Student(13, "John", "Lucknow"));
//        System.out.println("Insert Result : " + res);
/*
        int updateRes = studentDao.update(new Student(3, "John", "Lucknow"));
        System.out.println("Update Result : " + updateRes);
*/

 /*       int delRes = studentDao.delete(13);
        System.out.println("Del res : " + delRes);
*/
        List<Student> students = studentDao.getAllStudent();
        System.out.println(students);
    }
}
