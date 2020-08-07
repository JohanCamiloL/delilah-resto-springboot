package io.johancamilo.delilahrestobackend.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Order {

    @NotNull
    private int number;

    @NotNull
    private int userId;

    @NotBlank
    @Size(max = 100)
    private String description;

    @NotBlank
    private String date;

    @NotBlank
    private String state;

    @NotBlank
    private String wayToPay;

    @NotNull
    private int total;
}
