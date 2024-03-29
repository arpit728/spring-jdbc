package com.acecademy.dao;

import com.acecademy.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RowMapper<Student> studentRowMapper;

    @Override
    public int insert(Student student) {
        String sql = "insert into student values(?,?,?)";
        return jdbcTemplate.update(sql, student.getId(), student.getName(), student.getCity());
    }

    @Override
    public int update(Student student) {

        String sql = "update student set name = ? , city = ? where id = ?";
        return jdbcTemplate.update(sql, student.getName(), student.getCity(), student.getId());
    }

    @Override
    public int delete(int id) {
        String sql = "delete from student where id = ?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public Student getStudent(int id) {
        String sql = "select * from student where id = ?";
        return jdbcTemplate.queryForObject(sql, studentRowMapper, id);
    }

    @Override
    public List<Student> getAllStudent() {
        String sql = "select * from student where id";
        return jdbcTemplate.query(sql, studentRowMapper);
    }
}
