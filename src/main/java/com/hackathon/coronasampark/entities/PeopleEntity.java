package com.hackathon.coronasampark.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "people", schema = "CoronaSampark", catalog = "postgres")
public class PeopleEntity {
    private Integer personId;
    private Integer photoKey;
    private String name;
    private Integer age;
    private String sex;
    private String status;
    private Integer contactNumber;
    private String emailId;
    private String fbLink;
    private String twitterLink;
    private String instagarmLink;
    private String otherLink;
    private String cloumn1;
    private String cloumn2;
    private String cloumn3;

    @Id
    @Column(name = "person_id", nullable = false)
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "photo_key", nullable = false)
    public Integer getPhotoKey() {
        return photoKey;
    }

    public void setPhotoKey(Integer photoKey) {
        this.photoKey = photoKey;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 250)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "age", nullable = false)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "sex", nullable = false, length = 10)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 25)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "contact_number", nullable = true)
    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Basic
    @Column(name = "email_id", nullable = true, length = 150)
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Basic
    @Column(name = "fb_link", nullable = true, length = 500)
    public String getFbLink() {
        return fbLink;
    }

    public void setFbLink(String fbLink) {
        this.fbLink = fbLink;
    }

    @Basic
    @Column(name = "twitter_link", nullable = true, length = 500)
    public String getTwitterLink() {
        return twitterLink;
    }

    public void setTwitterLink(String twitterLink) {
        this.twitterLink = twitterLink;
    }

    @Basic
    @Column(name = "instagarm_link", nullable = true, length = 500)
    public String getInstagarmLink() {
        return instagarmLink;
    }

    public void setInstagarmLink(String instagarmLink) {
        this.instagarmLink = instagarmLink;
    }

    @Basic
    @Column(name = "other_link", nullable = true, length = 500)
    public String getOtherLink() {
        return otherLink;
    }

    public void setOtherLink(String otherLink) {
        this.otherLink = otherLink;
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
        PeopleEntity that = (PeopleEntity) o;
        return Objects.equals(personId, that.personId) &&
                Objects.equals(photoKey, that.photoKey) &&
                Objects.equals(name, that.name) &&
                Objects.equals(age, that.age) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(status, that.status) &&
                Objects.equals(contactNumber, that.contactNumber) &&
                Objects.equals(emailId, that.emailId) &&
                Objects.equals(fbLink, that.fbLink) &&
                Objects.equals(twitterLink, that.twitterLink) &&
                Objects.equals(instagarmLink, that.instagarmLink) &&
                Objects.equals(otherLink, that.otherLink) &&
                Objects.equals(cloumn1, that.cloumn1) &&
                Objects.equals(cloumn2, that.cloumn2) &&
                Objects.equals(cloumn3, that.cloumn3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, photoKey, name, age, sex, status, contactNumber, emailId, fbLink, twitterLink, instagarmLink, otherLink, cloumn1, cloumn2, cloumn3);
    }
}
