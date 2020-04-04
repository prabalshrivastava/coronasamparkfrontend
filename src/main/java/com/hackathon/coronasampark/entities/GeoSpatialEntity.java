package com.hackathon.coronasampark.entities;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "geo_spatial")
public class GeoSpatialEntity extends AuditModel{
}
