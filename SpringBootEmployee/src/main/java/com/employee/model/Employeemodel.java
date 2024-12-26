package com.employee.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public class Employeemodel {

		private int eId;
		private String eName;
		private double esalary;
		private String eDept;
		private String eAddress;
		
	}


