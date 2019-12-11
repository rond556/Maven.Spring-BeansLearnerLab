package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previous students")
    Students previousStudents;

    @Autowired
    Instructors instructors;

    public Alumni(){
    }

    @PostConstruct
    public void executeBootCamp() {
        Double totalNumberOfHours = 1200D;
        for(Instructor i : instructors){
            i.lecture(previousStudents, (totalNumberOfHours * previousStudents.size() / instructors.size()));
        }
    }

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public void setPreviousStudents(Students previousStudents) {
        this.previousStudents = previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}


