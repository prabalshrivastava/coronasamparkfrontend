package com.hackathon.coronasampark.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address")
public class AddressEntity extends AuditModel{
    @ApiModelProperty(required = true, example = "personId")
    @Column(nullable = false)
    private Integer personId;

    @ApiModelProperty(required = true, example = "country")
    @Column(nullable = false, length = 50)
    private String country;

    @ApiModelProperty(required = true, example = "state")
    @Column(nullable = false, length = 100)
    private String state;

    @ApiModelProperty(required = true, example = "city")
    @Column(nullable = false, length = 100)
    private String city;

    @ApiModelProperty(required = true, example = "area")
    @Column(nullable = false, length = 250)
    private String area;

    @ApiModelProperty(required = true, example = "pincode")
    @Column(nullable = false)
    private Integer pincode;

    @ApiModelProperty(required = true, example = "cloumn1")
    @Column(nullable = false, length = 250)
    private String cloumn1;

    @ApiModelProperty(required = true, example = "cloumn2")
    @Column(nullable = false, length = 250)
    private String cloumn2;

    @ApiModelProperty(required = true, example = "cloumn3")
    @Column(nullable = false, length = 250)
    private String cloumn3;
}
