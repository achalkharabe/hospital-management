package com.arc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arc.entity.patient;

public interface patientrepo extends JpaRepository<patient, Integer> {

}
