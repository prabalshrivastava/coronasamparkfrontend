package com.hackathon.coronasampark.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import java.lang.Integer;

@Entity
@Data
@Table(name = "patient_info")
public class PatientInfoEntity extends AuditModel{
    @ApiModelProperty(required = true, example = "criticalityIndication")
    @Column(nullable = false, length = 10)
    private String criticalityIndication;

    @ApiModelProperty(required = true, example = "treatmentStatus")
    @Column(nullable = false, length = 50)
    private String treatmentStatus;

    @ApiModelProperty(required = true, example = "detectedOn")
    @Column(nullable = false)
    private Timestamp detectedOn;

    @ApiModelProperty(required = true, example = "statusChangeOn")
    @Column(nullable = false)
    private Timestamp statusChangeOn;

    @ApiModelProperty(required = true, example = "treatedAt")
    @Column(nullable = false, length = 100)
    private String treatedAt;

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
