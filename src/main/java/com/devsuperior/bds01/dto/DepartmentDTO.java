package com.devsuperior.bds01.dto;

import java.io.Serializable;

import com.devsuperior.bds01.entities.Department;

public class DepartmentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Long id;
	public String name;
	
	public DepartmentDTO() {
		
	}
	
	public DepartmentDTO(Long _id, String _name) {
		id = _id;
		name = _name;
	}
	
	public DepartmentDTO(Department _entity) {
		id = _entity.getId();
		name = _entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long _id) {
		id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		name = _name;
	}
	
	
}