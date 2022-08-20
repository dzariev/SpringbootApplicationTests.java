package com.pokerface.spingboot.controllers;

import com.pokerface.spingboot.models.Person;
import com.pokerface.spingboot.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/add-user")
    public Person save(@RequestBody Person dto) {
        if (Objects.nonNull(dto.getIndex())) {
            throw new IllegalArgumentException("Index should  be null");
        }
        return personService.save(dto);
    }

    @GetMapping("/all")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable String id) { //@RequestParam, @PathVariable
        System.out.println("FindByID ");
        System.out.println(id);
        return personService.findById(id);
    }

//    @GetMapping
//    public Person findOne(@RequestParam String id,
//                          @RequestParam String name) { //@RequestParam, @PathVariable
//        System.out.println("FindOne");
//        System.out.println(id);
//        System.out.println(name);
//        return null;
//    }

    @PutMapping
    public Person update(@RequestBody Person dto) {
        if (Objects.isNull(dto.getIndex())) {
            throw new IllegalArgumentException("Index should not be null");
        }
        return personService.update(dto);
    }

    @DeleteMapping
    public Person delete(@RequestParam String id) {
        System.out.println(" id " + id + " deleted ");
        if (Objects.nonNull(id)) {
            personService.delete(id);
        }
        return null;
    }

}