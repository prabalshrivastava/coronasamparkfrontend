package com.hackathon.coronasampark.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "ind_adm0")
public class CountryEntity {
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

    @ApiModelProperty(required = true, example = "objectid1")
    @Column(name = "objectid_1", nullable = true)
    private Long objectid1;

    @ApiModelProperty(required = true, example = "iso3")
    @Column(name = "iso3", nullable = true, length = 5)
    private String iso3;

    @ApiModelProperty(required = true, example = "nameEngli")
    @Column(name = "name_engli", nullable = true, length = 50)
    private String nameEngli;

    @ApiModelProperty(required = true, example = "nameIso")
    @Column(name = "name_iso", nullable = true, length = 54)
    private String nameIso;

    @ApiModelProperty(required = true, example = "nameFao")
    @Column(name = "name_fao", nullable = true, length = 50)
    private String nameFao;

    @ApiModelProperty(required = true, example = "nameLocal")
    @Column(name = "name_local", nullable = true, length = 54)
    private String nameLocal;

    @ApiModelProperty(required = true, example = "nameObsol")
    @Column(name = "name_obsol", nullable = true, length = 150)
    private String nameObsol;

    @ApiModelProperty(required = true, example = "nameVaria")
    @Column(name = "name_varia", nullable = true, length = 160)
    private String nameVaria;

    @ApiModelProperty(required = true, example = "nameNonla")
    @Column(name = "name_nonla", nullable = true, length = 50)
    private String nameNonla;

    @ApiModelProperty(required = true, example = "nameFrenc")
    @Column(name = "name_frenc", nullable = true, length = 50)
    private String nameFrenc;

    @ApiModelProperty(required = true, example = "nameSpani")
    @Column(name = "name_spani", nullable = true, length = 50)
    private String nameSpani;

    @ApiModelProperty(required = true, example = "nameRussi")
    @Column(name = "name_russi", nullable = true, length = 50)
    private String nameRussi;

    @ApiModelProperty(required = true, example = "nameArabi")
    @Column(name = "name_arabi", nullable = true, length = 50)
    private String nameArabi;

    @ApiModelProperty(required = true, example = "nameChine")
    @Column(name = "name_chine", nullable = true, length = 50)
    private String nameChine;

    @ApiModelProperty(required = true, example = "waspartof")
    @Column(name = "waspartof", nullable = true, length = 100)
    private String waspartof;

    @ApiModelProperty(required = true, example = "contains")
    @Column(name = "contains", nullable = true, length = 50)
    private String contains;

    @ApiModelProperty(required = true, example = "sovereign")
    @Column(name = "sovereign", nullable = true, length = 40)
    private String sovereign;

    @ApiModelProperty(required = true, example = "iso2")
    @Column(name = "iso2", nullable = true, length = 4)
    private String iso2;

    @ApiModelProperty(required = true, example = "www")
    @Column(name = "www", nullable = true, length = 2)
    private String www;

    @ApiModelProperty(required = true, example = "fips")
    @Column(name = "fips", nullable = true, length = 6)
    private String fips;

    @ApiModelProperty(required = true, example = "ison")
    @Column(name = "ison", nullable = true, precision = 0)
    private BigInteger ison;

    @ApiModelProperty(required = true, example = "validfr")
    @Column(name = "validfr", nullable = true, length = 12)
    private String validfr;

    @ApiModelProperty(required = true, example = "validto")
    @Column(name = "validto", nullable = true, length = 10)
    private String validto;

    @ApiModelProperty(required = true, example = "pop2000")
    @Column(name = "pop2000", nullable = true, precision = 0)
    private BigInteger pop2000;

    @ApiModelProperty(required = true, example = "sqkm")
    @Column(name = "sqkm", nullable = true, precision = 0)
    private BigInteger sqkm;

    @ApiModelProperty(required = true, example = "popsqkm")
    @Column(name = "popsqkm", nullable = true, precision = 0)
    private BigInteger popsqkm;

    @ApiModelProperty(required = true, example = "unregion1")
    @Column(name = "unregion1", nullable = true, length = 254)
    private String unregion1;

    @ApiModelProperty(required = true, example = "unregion2")
    @Column(name = "unregion2", nullable = true, length = 254)
    private String unregion2;

    @ApiModelProperty(required = true, example = "developing")
    @Column(name = "developing", nullable = true, precision = 0)
    private BigInteger developing;

    @ApiModelProperty(required = true, example = "cis")
    @Column(name = "cis", nullable = true, precision = 0)
    private BigInteger cis;

    @ApiModelProperty(required = true, example = "transition")
    @Column(name = "transition", nullable = true, precision = 0)
    private BigInteger transition;

    @ApiModelProperty(required = true, example = "oecd")
    @Column(name = "oecd", nullable = true, precision = 0)
    private BigInteger oecd;

    @ApiModelProperty(required = true, example = "wbregion")
    @Column(name = "wbregion", nullable = true, length = 254)
    private String wbregion;

    @ApiModelProperty(required = true, example = "wbincome")
    @Column(name = "wbincome", nullable = true, length = 254)
    private String wbincome;

    @ApiModelProperty(required = true, example = "wbdebt")
    @Column(name = "wbdebt", nullable = true, length = 254)
    private String wbdebt;

    @ApiModelProperty(required = true, example = "wbother")
    @Column(name = "wbother", nullable = true, length = 254)
    private String wbother;

    @ApiModelProperty(required = true, example = "ceeac")
    @Column(name = "ceeac", nullable = true, precision = 0)
    private BigInteger ceeac;

    @ApiModelProperty(required = true, example = "cemac")
    @Column(name = "cemac", nullable = true, precision = 0)
    private BigInteger cemac;

    @ApiModelProperty(required = true, example = "ceplg")
    @Column(name = "ceplg", nullable = true, precision = 0)
    private BigInteger ceplg;

    @ApiModelProperty(required = true, example = "comesa")
    @Column(name = "comesa", nullable = true, precision = 0)
    private BigInteger comesa;

    @ApiModelProperty(required = true, example = "eac")
    @Column(name = "eac", nullable = true, precision = 0)
    private BigInteger eac;

    @ApiModelProperty(required = true, example = "ecowas")
    @Column(name = "ecowas", nullable = true, precision = 0)
    private BigInteger ecowas;

    @ApiModelProperty(required = true, example = "igad")
    @Column(name = "igad", nullable = true, precision = 0)
    private BigInteger igad;

    @ApiModelProperty(required = true, example = "ioc")
    @Column(name = "ioc", nullable = true, precision = 0)
    private BigInteger ioc;

    @ApiModelProperty(required = true, example = "mru")
    @Column(name = "mru", nullable = true, precision = 0)
    private BigInteger mru;

    @ApiModelProperty(required = true, example = "sacu")
    @Column(name = "sacu", nullable = true, precision = 0)
    private BigInteger sacu;

    @ApiModelProperty(required = true, example = "uemoa")
    @Column(name = "uemoa", nullable = true, precision = 0)
    private BigInteger uemoa;

    @ApiModelProperty(required = true, example = "uma")
    @Column(name = "uma", nullable = true, precision = 0)
    private BigInteger uma;

    @ApiModelProperty(required = true, example = "palop")
    @Column(name = "palop", nullable = true, precision = 0)
    private BigInteger palop;

    @ApiModelProperty(required = true, example = "parta")
    @Column(name = "parta", nullable = true, precision = 0)
    private BigInteger parta;

    @ApiModelProperty(required = true, example = "cacm")
    @Column(name = "cacm", nullable = true, precision = 0)
    private BigInteger cacm;

    @ApiModelProperty(required = true, example = "eurasec")
    @Column(name = "eurasec", nullable = true, precision = 0)
    private BigInteger eurasec;

    @ApiModelProperty(required = true, example = "agadir")
    @Column(name = "agadir", nullable = true, precision = 0)
    private BigInteger agadir;

    @ApiModelProperty(required = true, example = "saarc")
    @Column(name = "saarc", nullable = true, precision = 0)
    private BigInteger saarc;

    @ApiModelProperty(required = true, example = "asean")
    @Column(name = "asean", nullable = true, precision = 0)
    private BigInteger asean;

    @ApiModelProperty(required = true, example = "nafta")
    @Column(name = "nafta", nullable = true, precision = 0)
    private BigInteger nafta;

    @ApiModelProperty(required = true, example = "gcc")
    @Column(name = "gcc", nullable = true, precision = 0)
    private BigInteger gcc;

    @ApiModelProperty(required = true, example = "csn")
    @Column(name = "csn", nullable = true, precision = 0)
    private BigInteger csn;

    @ApiModelProperty(required = true, example = "caricom")
    @Column(name = "caricom", nullable = true, precision = 0)
    private BigInteger caricom;

    @ApiModelProperty(required = true, example = "eu")
    @Column(name = "eu", nullable = true, precision = 0)
    private BigInteger eu;

    @ApiModelProperty(required = true, example = "can")
    @Column(name = "can", nullable = true, precision = 0)
    private BigInteger can;

    @ApiModelProperty(required = true, example = "acp")
    @Column(name = "acp", nullable = true, precision = 0)
    private BigInteger acp;

    @ApiModelProperty(required = true, example = "landlocked")
    @Column(name = "landlocked", nullable = true, precision = 0)
    private BigInteger landlocked;

    @ApiModelProperty(required = true, example = "aosis")
    @Column(name = "aosis", nullable = true, precision = 0)
    private BigInteger aosis;

    @ApiModelProperty(required = true, example = "sids")
    @Column(name = "sids", nullable = true, precision = 0)
    private BigInteger sids;

    @ApiModelProperty(required = true, example = "islands")
    @Column(name = "islands", nullable = true, precision = 0)
    private BigInteger islands;

    @ApiModelProperty(required = true, example = "ldc")
    @Column(name = "ldc", nullable = true, precision = 0)
    private BigInteger ldc;

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
