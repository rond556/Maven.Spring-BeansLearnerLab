package com.example.demo.config;

import com.example.demo.Student;
import com.example.demo.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "current students")
    public Students currentStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1L,"Crono"));
        studentList.add(new Student(2L,"Marle"));
        studentList.add(new Student(3L,"Lucca"));
        studentList.add(new Student(4L,"Frog"));
        studentList.add(new Student(5L,"Robo"));
        studentList.add(new Student(6L,"Ayla"));
        studentList.add(new Student(7L,"Magus"));
        return new Students(studentList);
    }

    @Bean(name = "previous students")
    public Students previousStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(12L,"Terra"));
        studentList.add(new Student(23L,"Locke"));
        studentList.add(new Student(34L,"Edgar"));
        studentList.add(new Student(45L,"Sabin"));
        return new Students(studentList);
    }
}
