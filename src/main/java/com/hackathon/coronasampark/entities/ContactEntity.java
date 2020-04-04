package com.hackathon.coronasampark.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

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
}
