package com.example.API;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/people")
public class firstAPI {
    private List<Person> people = new ArrayList<>();
    private long idCounter = 1; // Simple ID counter

    // Get all people
    @GetMapping    
    public List<Person> getAllPeople() {
        return people;
    }

    // Get person by ID
    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable int id) {
        return people.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Create a new person
    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        person.setId(idCounter++);
        people.add(person);
        return person;
    }

    // Update a person
    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable int id, @RequestBody Person updatedPerson) {
        Optional<Person> existingPerson = people.stream()
                .filter(person -> person.getId() == id) // Ensure you're using == for int comparison
                .findFirst();

        if (existingPerson.isPresent()) {
            Person person = existingPerson.get();
            person.setName(updatedPerson.getName());
            person.setAge(updatedPerson.getAge());
            return person;
        }
        return null; // or throw an exception
    }

    // Delete a person
    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable int id) {
        people.removeIf(person -> person.getId().equals(id));
        return "Person removed";
    }
}

