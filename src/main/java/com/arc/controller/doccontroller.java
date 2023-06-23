package com.arc.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arc.entity.doctor;
import com.arc.entity.patient;
import com.arc.repo.doctorrepo;
import com.arc.repo.patientrepo;

@RestController
@RequestMapping("/doctor")
public class doccontroller {

	@Autowired
	private doctorrepo docrepo;
	
	@Autowired
	private patientrepo parepo;
	
	/*@PostMapping("/save")
	public doctor save(@RequestBody doctor doctor) {
		
		return docrepo.save(doctor);
	}*/
	@PutMapping("/{docId}/patient/{patient_Id}")
	public doctor update(@PathVariable("docId")int docId,@PathVariable("patient_Id")int patient_Id) {
		
		doctor doctor=docrepo.findById(docId).get();
		patient patients=parepo.findById(patient_Id).get();
		List<patient> patientset=null;
		patientset=doctor.getPatient();
		patientset.add(patients);
		doctor.setPatient(patientset);
		return docrepo.save(doctor);
	}
}
