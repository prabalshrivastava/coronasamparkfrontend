package com.hackathon.coronasampark.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Data
@Entity
@Table(name = "ind_adm3")
public class TalukaEntity {
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

    @ApiModelProperty(required = true, example = "id2")
    @Column(name = "id_2", nullable = true)
    private Long id2;

    @ApiModelProperty(required = true, example = "name2")
    @Column(name = "name_2", nullable = true, length = 75)
    private String name2;

    @ApiModelProperty(required = true, example = "id3")
    @Column(name = "id_3", nullable = true)
    private Long id3;

    @ApiModelProperty(required = true, example = "name3")
    @Column(name = "name_3", nullable = true, length = 75)
    private String name3;

    @ApiModelProperty(required = true, example = "type3")
    @Column(name = "type_3", nullable = true, length = 50)
    private String type3;

    @ApiModelProperty(required = true, example = "engtype3")
    @Column(name = "engtype_3", nullable = true, length = 50)
    private String engtype3;

    @ApiModelProperty(required = true, example = "nlName3")
    @Column(name = "nl_name_3", nullable = true, length = 75)
    private String nlName3;

    @ApiModelProperty(required = true, example = "varname3")
    @Column(name = "varname_3", nullable = true, length = 100)
    private String varname3;

    @ApiModelProperty(required = true, example = "shapeLeng")
    @Column(name = "shape_leng", nullable = true, precision = 0)
    private BigInteger shapeLeng;

    @ApiModelProperty(required = true, example = "shapeArea")
    @Column(name = "shape_area", nullable = true, precision = 0)
    private BigInteger shapeArea;

    @ApiModelProperty(required = true, example = "geom")
    @Column(name = "geom", nullable = true, precision = 0)
    private Object geom;
}
