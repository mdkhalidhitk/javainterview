package com.java.map.feature;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
	private String gender;
	private List<FemaleEmployee> femaeEmp;
	private List<MaleEmployee> maleEmployee;

}
