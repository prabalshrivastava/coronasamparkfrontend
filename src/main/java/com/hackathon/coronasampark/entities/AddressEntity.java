package com.hackathon.coronasampark.entities;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "address")
public class AddressEntity extends AuditModel{
    @ApiModelProperty(required = true, example = "personId")
    @Column(nullable = false)
    private Integer personId;

    @ApiModelProperty(required = true, example = "taluka")
    @Column(nullable = false)
    private String taluka;

    @ApiModelProperty(required = true, example = "pincode")
    @Column(nullable = false)
    private Integer pincode;

    @ApiModelProperty(required = true, example = "area")
    @Column(nullable = false, length = 250)
    private String area;

    @ApiModelProperty(required = true, example = "district")
    @Column(nullable = false, length = 100)
    private String district;

    @ApiModelProperty(required = true, example = "city")
    @Column(nullable = false, length = 100)
    private String city;

    @ApiModelProperty(required = true, example = "state")
    @Column(nullable = false, length = 100)
    private String state;

    @ApiModelProperty(required = true, example = "country")
    @Column(nullable = false, length = 50)
    private String country;
}
