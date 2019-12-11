package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAlumni {

    @Autowired
    Alumni alumni;

    @Test
    public void executeBootCampTest() {
        Double expected = 1200D;

        for(Student s : alumni.getPreviousStudents()){
            Assert.assertEquals(expected, s.getTotalStudyTime(),.01);
        }
    }
}
