package com.smsk.Hospital.management.repository;

import com.smsk.Hospital.management.entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientRep extends JpaRepository<patient,Long> {
}
