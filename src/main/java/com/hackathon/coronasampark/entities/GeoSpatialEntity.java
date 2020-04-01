package com.hackathon.coronasampark.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "geo_spatial", schema = "CoronaSampark", catalog = "postgres")
public class GeoSpatialEntity {
    private Integer addressKey;
    private String cloumn1;
    private String cloumn2;
    private String cloumn3;

    @Basic
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_key", nullable = false)
    public Integer getAddressKey() {
        return addressKey;
    }

    public void setAddressKey(Integer addressKey) {
        this.addressKey = addressKey;
    }

    @Basic
    @Column(name = "cloumn1", nullable = false, length = 250)
    public String getCloumn1() {
        return cloumn1;
    }

    public void setCloumn1(String cloumn1) {
        this.cloumn1 = cloumn1;
    }

    @Basic
    @Column(name = "cloumn2", nullable = false, length = 250)
    public String getCloumn2() {
        return cloumn2;
    }

    public void setCloumn2(String cloumn2) {
        this.cloumn2 = cloumn2;
    }

    @Basic
    @Column(name = "cloumn3", nullable = false, length = 250)
    public String getCloumn3() {
        return cloumn3;
    }

    public void setCloumn3(String cloumn3) {
        this.cloumn3 = cloumn3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoSpatialEntity that = (GeoSpatialEntity) o;
        return Objects.equals(addressKey, that.addressKey) &&
                Objects.equals(cloumn1, that.cloumn1) &&
                Objects.equals(cloumn2, that.cloumn2) &&
                Objects.equals(cloumn3, that.cloumn3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressKey, cloumn1, cloumn2, cloumn3);
    }
}
