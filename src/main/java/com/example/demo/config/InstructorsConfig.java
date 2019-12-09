package com.example.demo.config;

import com.example.demo.Instructor;
import com.example.demo.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {

    @Bean(name = "Tech Connect USA Instructors")
    public Instructors tcUsaInstructors(){
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(1, new Instructor(1212L, "Cloud"));
        instructorList.add(1, new Instructor(2323L, "Tifa"));
        instructorList.add(1, new Instructor(3434L, "Aeris"));
        instructorList.add(1, new Instructor(4545L, "Barret"));
        return new Instructors(instructorList);
    }

    @Bean(name = "Tech Connect UK Instructors")
    public Instructors tcUkInstructors(){
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(1, new Instructor(1313L, "Ryu"));
        instructorList.add(1, new Instructor(2424L, "Rei"));
        instructorList.add(1, new Instructor(3535L, "Nina"));
        instructorList.add(1, new Instructor(4646L, "Momo"));
        return new Instructors(instructorList);
    }

    @Bean(name = "ZipCodeWilmington Instructors")
    @Primary
    public Instructors instructors(){
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(1, new Instructor(1414L, "Claude"));
        instructorList.add(1, new Instructor(2525L, "Rena"));
        instructorList.add(1, new Instructor(3636L, "Ashton"));
        instructorList.add(1, new Instructor(4747L, "Bowgit addman"));
        return new Instructors(instructorList);
    }

}
