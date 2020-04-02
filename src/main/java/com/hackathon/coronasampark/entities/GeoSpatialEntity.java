package com.hackathon.coronasampark.entities;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "geo_spatial")
public class GeoSpatialEntity extends AuditModel{
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
