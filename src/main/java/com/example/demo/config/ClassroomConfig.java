package com.example.demo.config;

import com.example.demo.Classroom;
import com.example.demo.Instructors;
import com.example.demo.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {

    @Autowired
    Instructors instructors;

    @Bean(name = "Current cohort")
    public Classroom currentCohort(Instructors instructors, @Qualifier("current students") Students students){
        return new Classroom(instructors,students);
    }

    @Bean(name = "previous cohort")
    public Classroom previousCohort(Instructors instructors, @Qualifier("previous students") Students students){
        return new Classroom(instructors,students);
    }
}
