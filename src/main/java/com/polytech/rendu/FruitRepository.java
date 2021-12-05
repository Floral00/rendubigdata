package com.polytech.rendu;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class FruitRepository extends MongoRepository<Fruit, String> {
    Fruit findByDesignation(String designation);
}
