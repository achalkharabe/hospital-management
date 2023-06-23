package com.arc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arc.entity.doctor;

public interface doctorrepo extends JpaRepository<doctor, Integer> {

}
