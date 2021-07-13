package ru.inforest.addmistakemongodb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Mistake {

    @Id
    private String id;

    private String mistake;

    private String causer;

    private String date;
}
