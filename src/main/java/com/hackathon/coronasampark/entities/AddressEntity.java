package com.hackathon.coronasampark.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "CoronaSampark", catalog = "postgres")
public class AddressEntity {
    private Integer addressKey;
    private Integer personId;
    private String country;
    private String state;
    private String city;
    private String area;
    private Integer pincode;
    private String cloumn1;
    private String cloumn2;
    private String cloumn3;

    @Id
    @Column(name = "address_key", nullable = false)
    public Integer getAddressKey() {
        return addressKey;
    }

    public void setAddressKey(Integer addressKey) {
        this.addressKey = addressKey;
    }

    @Basic
    @Column(name = "person_id", nullable = false)
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "country", nullable = false, length = 50)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "state", nullable = false, length = 100)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 100)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "area", nullable = false, length = 250)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "pincode", nullable = false)
    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
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
        AddressEntity that = (AddressEntity) o;
        return Objects.equals(addressKey, that.addressKey) &&
                Objects.equals(personId, that.personId) &&
                Objects.equals(country, that.country) &&
                Objects.equals(state, that.state) &&
                Objects.equals(city, that.city) &&
                Objects.equals(area, that.area) &&
                Objects.equals(pincode, that.pincode) &&
                Objects.equals(cloumn1, that.cloumn1) &&
                Objects.equals(cloumn2, that.cloumn2) &&
                Objects.equals(cloumn3, that.cloumn3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressKey, personId, country, state, city, area, pincode, cloumn1, cloumn2, cloumn3);
    }
}
