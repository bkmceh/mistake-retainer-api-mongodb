package ru.inforest.addmistakemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.inforest.addmistakemongodb.model.Mistake;

public interface MistakeRepository extends MongoRepository<Mistake, String> {
}
