package com.graymatter;

import java.util.Comparator;

public class salaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return (int) (o1.getEmpSal() - o2.getEmpSal());
	}
	
	

}
