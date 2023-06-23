package com.arc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.arc.entity.patient;
import com.arc.repo.doctorrepo;
import com.arc.repo.patientrepo;

@RestController
@RequestMapping("/patient")
public class patientcontroller {

	
	
	@Autowired
	private patientrepo parepo;
	
	@PostMapping("/save")
	public patient save(@RequestBody patient patient) {
		
		return parepo.save(patient);
	}
}

