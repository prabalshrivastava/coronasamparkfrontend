package com.hackathon.coronasampark.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "contact", schema = "CoronaSampark", catalog = "postgres")
public class ContactEntity {
    private Integer personId;
    private Integer patientId;
    private Timestamp contactDate;
    private String isQuarantine;
    private Timestamp quarantineSince;
    private String symptoms;
    private String degreeOfContact;
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
    @Column(name = "patient_id", nullable = false)
    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "contact_date", nullable = false)
    public Timestamp getContactDate() {
        return contactDate;
    }

    public void setContactDate(Timestamp contactDate) {
        this.contactDate = contactDate;
    }

    @Basic
    @Column(name = "is_quarantine", nullable = false, length = 10)
    public String getIsQuarantine() {
        return isQuarantine;
    }

    public void setIsQuarantine(String isQuarantine) {
        this.isQuarantine = isQuarantine;
    }

    @Basic
    @Column(name = "quarantine_since", nullable = false)
    public Timestamp getQuarantineSince() {
        return quarantineSince;
    }

    public void setQuarantineSince(Timestamp quarantineSince) {
        this.quarantineSince = quarantineSince;
    }

    @Basic
    @Column(name = "symptoms", nullable = false, length = 200)
    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    @Basic
    @Column(name = "degree_of_contact", nullable = false, length = 100)
    public String getDegreeOfContact() {
        return degreeOfContact;
    }

    public void setDegreeOfContact(String degreeOfContact) {
        this.degreeOfContact = degreeOfContact;
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
        ContactEntity that = (ContactEntity) o;
        return Objects.equals(personId, that.personId) &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(contactDate, that.contactDate) &&
                Objects.equals(isQuarantine, that.isQuarantine) &&
                Objects.equals(quarantineSince, that.quarantineSince) &&
                Objects.equals(symptoms, that.symptoms) &&
                Objects.equals(degreeOfContact, that.degreeOfContact) &&
                Objects.equals(cloumn1, that.cloumn1) &&
                Objects.equals(cloumn2, that.cloumn2) &&
                Objects.equals(cloumn3, that.cloumn3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, patientId, contactDate, isQuarantine, quarantineSince, symptoms, degreeOfContact, cloumn1, cloumn2, cloumn3);
    }
}
