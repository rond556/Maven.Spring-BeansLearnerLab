package com.example.demo;

import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    List<PersonType> personTypeList;

    public People(List<PersonType> personTypeList){
        this.personTypeList = personTypeList;
    }

    public void add(PersonType personType){
        personTypeList.add(personType);
    }

    public void remove(PersonType personType){
        personTypeList.remove(personType);
    }

    public Integer size(){
        return personTypeList.size();
    }

    public void clear(){
        personTypeList.clear();
    }

    public void addAll(Iterable<PersonType> personTypes){
        for(PersonType p : personTypes){
            personTypeList.add(p);
        }
    }
    public PersonType findById(Long id) {
        for (PersonType p : personTypeList){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personTypeList;
    }

}
