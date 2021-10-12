package com.project.service.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseModel {
    private Boolean result;
    private String message;
    private Object data;

    public BaseModel() {
        super();
    }

    public BaseModel(Boolean result, String message) {
        super();
        this.result = result;
        this.message = message;
    }



}