package com.example.demo.config;

import com.example.demo.Instructor;
import com.example.demo.Instructors;
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
public class TestTeacherConfig {

    @Autowired
    @Qualifier("Tech Connect USA Instructors")
    Instructors techConnectUsaInstructors;

    @Autowired
    @Qualifier("Tech Connect UK Instructors")
    Instructors techConnectUkInstructors;

    @Autowired
    @Qualifier("ZipCodeWilmington Instructors")
    Instructors zcwInstructors;

    @Test
    public void instructorsExistTest(){
        List<Instructor> instructors = new ArrayList<>();
        for(Instructor i : techConnectUkInstructors.findAll())
            instructors.add(i);

        Assert.assertTrue(instructors.contains(techConnectUkInstructors.findById(3535L)));
    }

    @Test
    public void instructorsExistTest2(){
        List<Instructor> instructors = new ArrayList<>();
        for(Instructor i : zcwInstructors.findAll())
            instructors.add(i);

        Assert.assertTrue(instructors.contains(zcwInstructors.findById(3636L)));
    }

    @Test
    public void instructorsExistTest3(){
        List<Instructor> instructors = new ArrayList<>();
        for(Instructor i : techConnectUsaInstructors.findAll())
            instructors.add(i);

        Assert.assertTrue(instructors.contains(techConnectUsaInstructors.findById(4545L)));
    }
}
