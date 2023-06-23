package com.arc.entity;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patient_Id;
	private String name;
	private String last;
	private String age;
	private int weight;
	
	@ManyToMany(mappedBy = "patient")
	private List<doctor> doctor=new LinkedList<doctor>();
	
}
