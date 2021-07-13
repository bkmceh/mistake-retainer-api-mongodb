package ru.inforest.addmistakemongodb.model.request;

import lombok.Data;

@Data
public class MistakeRequest {

    private String causer;

    private String mistake;

    private String date;

}
