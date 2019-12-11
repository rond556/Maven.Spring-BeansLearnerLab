package com.example.demo.config;

import com.example.demo.Student;
import com.example.demo.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {

    @Autowired
    @Qualifier("current students")
    Students currentStudents;

    @Autowired
    @Qualifier("previous students")
    Students previousStudents;

    @Test
    public void currentStudentExistsTest(){
        List<Student> students = new ArrayList<>();
        for(Student s : currentStudents.findAll())
            students.add(s);

        Assert.assertTrue(students.contains(currentStudents.findById(7L)));
    }

    @Test
    public void previousStudentExistsTest(){
        List<Student> students = new ArrayList<>();
        for(Student s : previousStudents.findAll())
            students.add(s);

        Assert.assertTrue(students.contains(previousStudents.findById(23L)));
    }
}
