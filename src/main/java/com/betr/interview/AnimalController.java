package com.betr.interview;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AnimalController {

    @PostMapping("/animals")
    public ResponseEntity<String> postHello(@RequestBody String name) {
        return new ResponseEntity<>("Hello, " + name + "!", HttpStatus.CREATED);
    }

    @GetMapping("/animals")
    public List<Animal> getAnimals(
            @RequestParam(required = false) String type,
            @RequestParam(required = false) Integer numOfAnimals
    ) {
        return getAllAnimals();
    }

    public List<Animal> getAllAnimals() {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal(1, 5, "dog", "bulldog"));
        animals.add(new Animal(2, 10, "dog", "poodle"));
        animals.add(new Animal(3, 15, "dog", "golden retriever"));
        animals.add( new Animal(4, 5, "cat", "persian"));
        animals.add(new Animal(5, 100, "cat", "russian blue"));
        animals.add(new Animal(6, 10, "cat", "scottish fold"));
        animals.add(new Animal(7, 15, "cat", "siamese"));
        animals.add(new Animal(8, 100, "cow", "angus"));
        animals.add(new Animal(9, 200, "cow", "hereford"));
        animals.add(new Animal(10, 1000, "cow", "guernsey"));

        return animals;
    }

}
