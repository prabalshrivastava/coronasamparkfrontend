package com.hackathon.coronasampark.entities;

import lombok.Data;

import javax.persistence.Entity;
import java.util.UUID;

@Data
@Entity
public class Patient extends AuditModel {
}
