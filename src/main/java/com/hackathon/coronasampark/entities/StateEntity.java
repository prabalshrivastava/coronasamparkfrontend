package com.hackathon.coronasampark.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "ind_adm1")
public class StateEntity {
    @Id
    @ApiModelProperty(required = true, example = "gid")
    @Column(name = "gid", nullable = false)
    private Integer gid;

    @ApiModelProperty(required = true, example = "id0")
    @Column(name = "id_0", nullable = true)
    private Long id0;

    @ApiModelProperty(required = true, example = "iso")
    @Column(name = "iso", nullable = true, length = 3)
    private String iso;

    @ApiModelProperty(required = true, example = "name0")
    @Column(name = "name_0", nullable = true, length = 75)
    private String name0;

    @ApiModelProperty(required = true, example = "id1")
    @Column(name = "id_1", nullable = true)
    private Long id1;

    @ApiModelProperty(required = true, example = "name1")
    @Column(name = "name_1", nullable = true, length = 75)
    private String name1;

    @ApiModelProperty(required = true, example = "type1")
    @Column(name = "type_1", nullable = true, length = 50)
    private String type1;

    @ApiModelProperty(required = true, example = "engtype1")
    @Column(name = "engtype_1", nullable = true, length = 50)
    private String engtype1;

    @ApiModelProperty(required = true, example = "nlName1")
    @Column(name = "nl_name_1", nullable = true, length = 50)
    private String nlName1;

    @ApiModelProperty(required = true, example = "varname1")
    @Column(name = "varname_1", nullable = true, length = 150)
    private String varname1;

    @ApiModelProperty(required = true, example = "shapeLeng")
    @Column(name = "shape_leng", nullable = true, precision = 0)
    private BigInteger shapeLeng;

    @ApiModelProperty(required = true, example = "shapeArea")
    @Column(name = "shape_area", nullable = true, precision = 0)
    private BigInteger shapeArea;

}
