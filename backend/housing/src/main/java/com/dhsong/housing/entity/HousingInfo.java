package com.dhsong.housing.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class HousingInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double crime;

    private Double zoneLand;

    private Double industry;

    private Integer charleRiver;
    
    private Double nitricOxide;

    private Double room;

    private Double age;

    private Double disatnce;

    private Integer radialHighway;

    private Double tax;

    private Double pupilTeacher;

    private Double black;

    private Double lowerStatus;

    private Double medianPrice;

}
