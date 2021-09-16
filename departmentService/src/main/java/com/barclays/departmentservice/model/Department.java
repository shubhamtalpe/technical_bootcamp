package com.barclays.departmentservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "departmentTBL")
public class Department {
	
	@Id
	private long deptId;
	private String name;
	private String location;
}
