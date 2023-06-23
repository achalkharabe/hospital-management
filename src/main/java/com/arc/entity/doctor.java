package com.arc.entity;




import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int docId;
	private String name;
	private String last;
	private long phone_no=(long)(Math.random()*Math.pow(10, 10));
	
	@ManyToMany()
	@JoinTable(name = "doc_patient",
	joinColumns = @JoinColumn(name="doct_id"),inverseJoinColumns = @JoinColumn(name="patient_id"))
	private List<patient> patient=new LinkedList<patient>();
	
}
