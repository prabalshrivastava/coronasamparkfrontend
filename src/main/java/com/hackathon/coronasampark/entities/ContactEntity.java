package com.hackathon.coronasampark.entities;
import io.swagger.annotations.ApiModelProperty;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "contact")
public class ContactEntity extends AuditModel{
    @ApiModelProperty(required = true, example = "patientId")
    @Column(nullable = false)
    private Integer patientId;

    @ApiModelProperty(required = true, example = "contactDate")
    @Column(nullable = false)
    private Timestamp contactDate;

    @ApiModelProperty(required = true, example = "isQuarantine")
    @Column(nullable = false, length = 10)
    private String isQuarantine;

    @ApiModelProperty(required = true, example = "quarantineSince")
    @Column(nullable = false)
    private Timestamp quarantineSince;

    @ApiModelProperty(required = true, example = "symptoms")
    @Column(nullable = false, length = 200)
    private String symptoms;

    @ApiModelProperty(required = true, example = "degreeOfContact")
    @Column(nullable = false, length = 100)
    private String degreeOfContact;

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
