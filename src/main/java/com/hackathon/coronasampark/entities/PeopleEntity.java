package com.hackathon.coronasampark.entities;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "people")
public class PeopleEntity extends AuditModel{
    @ApiModelProperty(required = true, example = "photoKey")
    @Column(nullable = false)
    private Integer photoKey;

    @ApiModelProperty(required = true, example = "name")
    @Column(nullable = false, length = 250)
    private String name;

    @ApiModelProperty(required = true, example = "age")
    @Column(nullable = false)
    private Integer age;

    @ApiModelProperty(required = true, example = "sex")
    @Column(nullable = false, length = 10)
    private String sex;

    @ApiModelProperty(required = true, example = "status")
    @Column(nullable = false, length = 25)
    private String status;

    @ApiModelProperty(required = true, example = "contactNumber")
    @Column(nullable = true)
    private Integer contactNumber;

    @ApiModelProperty(required = true, example = "emailId")
    @Column(nullable = true, length = 150)
    private String emailId;

    @ApiModelProperty(required = true, example = "fbLink")
    @Column(nullable = true, length = 500)
    private String fbLink;

    @ApiModelProperty(required = true, example = "twitterLink")
    @Column(nullable = true, length = 500)
    private String twitterLink;

    @ApiModelProperty(required = true, example = "instagarmLink")
    @Column(nullable = true, length = 500)
    private String instagarmLink;

    @ApiModelProperty(required = true, example = "otherLink")
    @Column(nullable = true, length = 500)
    private String otherLink;

    @ApiModelProperty(required = true, example = "cloumn1")
    @Column(nullable = false, length = 250)
    private String cloumn1;

    @ApiModelProperty(required = true, example = "cloumn2")
    @Column(nullable = false, length = 250)
    private String cloumn2;

    @ApiModelProperty(required = true, example = "cloumn3")
    @Column(nullable = false, length = 250)
    private String cloumn3;

    @ApiModelProperty(required = true, example = "location")
    @Column(nullable = false, length = 250)
    private String location;

    @ApiModelProperty(required = true, example = "format")
    @Column(nullable = false, length = 250)
    private String format;
}
