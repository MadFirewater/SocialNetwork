package com.chatingtime.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "type of interests")
public class Interest {
	@Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(name= "name")
	private String name;
	
	@ManyToOne(targetEntity = TypeOfInterests.class)
    @JoinColumn(name = "id_type_of_interests")
	private TypeOfInterests typeOfInterests;
	
	@Column(name= "priority")
	private int priority;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeOfInterests getTypeOfInterests() {
		return typeOfInterests;
	}

	public void setTypeOfInterests(TypeOfInterests typeOfInterests) {
		this.typeOfInterests = typeOfInterests;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	

}
