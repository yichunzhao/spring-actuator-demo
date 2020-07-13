package com.ynz.actuator.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "SHIP")
@NoArgsConstructor
public class Ship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double length;
    private double width;
    private int tonnage;
}
