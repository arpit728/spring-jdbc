package com.acecademy.dao;

import com.acecademy.entity.Student;

import java.util.List;


public interface StudentDao {

    int insert(Student student);

    int update(Student student);

    int delete(int id);

    Student getStudent(int id);

    List<Student> getAllStudent();
}
