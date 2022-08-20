package com.pokerface.spingboot.services;

import com.pokerface.spingboot.models.Person;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    List<Person> personList = new ArrayList<>();
  static  int i = 0;

    public Person save(Person dto) {
        dto.setIndex(i++);
        personList.add(dto);
        return dto;
    }

    @GetMapping("get-user")
    public List<Person> findAll() {
        return personList;
    }

    public Person findById(String id) {
        for (Person person : personList) {
            if (String.valueOf(person.getIndex()).equals(id)) {
                print(person);
                return person;
            }
        }
        return null;
    }

    @GetMapping("/update")
    public Person update(Person dto) {
        personList.set(dto.getIndex(),dto);
        return dto;
    }

    public Person delete(String id) {
        for (Person person : personList) {
            if (String.valueOf(person.getIndex()).equals(id)) {
                personList.remove(person);
                findAll();
                return person;
            }
        }
        return null;
    }

    public void print(Person person) {
        System.out.println("Index " + person.getIndex());
        System.out.println("firstName " + person.getfirstName());
        System.out.println("lastName " + person.getlastName());

    }
}

