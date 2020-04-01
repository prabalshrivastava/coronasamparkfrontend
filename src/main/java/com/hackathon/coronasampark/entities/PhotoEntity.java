package com.hackathon.coronasampark.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "photo", schema = "CoronaSampark", catalog = "postgres")
public class PhotoEntity {
    private Integer photoKey;
    private String location;
    private String format;
    private String cloumn1;
    private String cloumn2;
    private String cloumn3;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_key", nullable = false)
    public Integer getPhotoKey() {
        return photoKey;
    }

    public void setPhotoKey(Integer photoKey) {
        this.photoKey = photoKey;
    }

    @Basic
    @Column(name = "location", nullable = false, length = 150)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "format", nullable = false, length = 15)
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
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
        PhotoEntity that = (PhotoEntity) o;
        return Objects.equals(photoKey, that.photoKey) &&
                Objects.equals(location, that.location) &&
                Objects.equals(format, that.format) &&
                Objects.equals(cloumn1, that.cloumn1) &&
                Objects.equals(cloumn2, that.cloumn2) &&
                Objects.equals(cloumn3, that.cloumn3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(photoKey, location, format, cloumn1, cloumn2, cloumn3);
    }
}
