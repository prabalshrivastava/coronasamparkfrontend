package com.hackathon.coronasampark.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "patient_info", schema = "CoronaSampark", catalog = "postgres")
public class PatientInfoEntity {
    private Integer personId;
    private String criticalityIndication;
    private String treatmentStatus;
    private Timestamp detectedOn;
    private Timestamp statusChangeOn;
    private String treatedAt;
    private String cloumn1;
    private String cloumn2;
    private String cloumn3;

    @Basic
    @Column(name = "person_id", nullable = false)
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "criticality_indication", nullable = false, length = 10)
    public String getCriticalityIndication() {
        return criticalityIndication;
    }

    public void setCriticalityIndication(String criticalityIndication) {
        this.criticalityIndication = criticalityIndication;
    }

    @Basic
    @Column(name = "treatment_status", nullable = false, length = 50)
    public String getTreatmentStatus() {
        return treatmentStatus;
    }

    public void setTreatmentStatus(String treatmentStatus) {
        this.treatmentStatus = treatmentStatus;
    }

    @Basic
    @Column(name = "detected_on", nullable = false)
    public Timestamp getDetectedOn() {
        return detectedOn;
    }

    public void setDetectedOn(Timestamp detectedOn) {
        this.detectedOn = detectedOn;
    }

    @Basic
    @Column(name = "status_change_on", nullable = false)
    public Timestamp getStatusChangeOn() {
        return statusChangeOn;
    }

    public void setStatusChangeOn(Timestamp statusChangeOn) {
        this.statusChangeOn = statusChangeOn;
    }

    @Basic
    @Column(name = "treated_at", nullable = false, length = 100)
    public String getTreatedAt() {
        return treatedAt;
    }

    public void setTreatedAt(String treatedAt) {
        this.treatedAt = treatedAt;
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
        PatientInfoEntity that = (PatientInfoEntity) o;
        return Objects.equals(personId, that.personId) &&
                Objects.equals(criticalityIndication, that.criticalityIndication) &&
                Objects.equals(treatmentStatus, that.treatmentStatus) &&
                Objects.equals(detectedOn, that.detectedOn) &&
                Objects.equals(statusChangeOn, that.statusChangeOn) &&
                Objects.equals(treatedAt, that.treatedAt) &&
                Objects.equals(cloumn1, that.cloumn1) &&
                Objects.equals(cloumn2, that.cloumn2) &&
                Objects.equals(cloumn3, that.cloumn3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, criticalityIndication, treatmentStatus, detectedOn, statusChangeOn, treatedAt, cloumn1, cloumn2, cloumn3);
    }
}
