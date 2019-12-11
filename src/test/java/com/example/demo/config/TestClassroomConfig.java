package com.example.demo.config;

import com.example.demo.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {

    @Autowired
    @Qualifier("current cohort")
    Classroom currentClassroom;

    @Autowired
    @Qualifier("previous cohort")
    Classroom previousClassroom;

    @Test
    public void checkCurrentClassroomSize(){
        Integer expectedCurrentSize = 7;
        Integer expectedPreviousSize = 4;

        Integer actualCurrentSize = currentClassroom.getStudents().size();
        Integer actualPreviousSize = currentClassroom.getInstructors().size();

        Assert.assertEquals(expectedCurrentSize,actualCurrentSize);
        Assert.assertEquals(expectedPreviousSize,actualPreviousSize);
    }

    @Test
    public void checkPreviousClassroomSize(){
        Integer expectedCurrentSize = 4;
        Integer expectedPreviousSize = 4;

        Integer actualCurrentSize = previousClassroom.getInstructors().size();
        Integer actualPreviousSize = previousClassroom.getInstructors().size();

        Assert.assertEquals(expectedCurrentSize,actualCurrentSize);
        Assert.assertEquals(expectedPreviousSize,actualPreviousSize);
    }
}
