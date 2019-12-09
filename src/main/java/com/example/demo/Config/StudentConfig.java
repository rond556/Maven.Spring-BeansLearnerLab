package com.example.demo.Config;

import com.example.demo.Student;
import com.example.demo.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "current students")
    public Students currentStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(1,new Student(1L,"Crono"));
        studentList.add(1,new Student(2L,"Marle"));
        studentList.add(1,new Student(3L,"Lucca"));
        studentList.add(1,new Student(4L,"Frog"));
        studentList.add(1,new Student(5L,"Robo"));
        studentList.add(1,new Student(1L,"Ayla"));
        studentList.add(1,new Student(1L,"Magus"));
        return new Students(studentList);
    }

    @Bean(name = "previous students")
    public Students previouStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(1, new Student(12L,"Terra"));
        studentList.add(1, new Student(23L,"Locke"));
        studentList.add(1, new Student(34L,"Edgar"));
        studentList.add(1, new Student(45L,"Sabin"));
        return new Students(studentList);
    }
}
