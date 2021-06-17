package com.acecademy.experiment;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        System.out.println("Row number " + rowNum);
        return new Student(rs.getInt("id"), rs.getString("name"), rs.getString("city"));
    }
}
