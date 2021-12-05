package com.polytech.rendu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/produit")
public class FruitService {

    private final Fruitrepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @GetMapping("/{desingation}/{prix}")
    public Fruit add(@PathVariable String desingation, @PathVariable double prix)
    {
        if(!desingation.isEmpty())
        {
            return fruitRepository.insert(new Fruit(null, desingation, prix));
        }
        else
        {
            return null;
        }

    }

    @GetMapping("/{designation}")
    public Fruit getById(@PathVariable String designation )
    {
        return fruitRepository.findByDesignation(designation);
    }

}