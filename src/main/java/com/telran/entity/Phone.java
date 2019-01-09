package com.telran.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


@Document /*-> @Entity */
public class Phone { //collection=phone

    @Id
    private String id; //hex decimal ID -> ObjectId

    private String brand;
    private String model;

    private LocalDate yearOfManufacturing;

    private Double inch;
}
