package com.labs;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStatistics {
	public static float averageSalary(List<? extends Employee> employees) {
		float average = 0;
		for (Employee employee : employees) {
			average += employee.getSalary();
		}
		if (employees.size() > 0) {
			return average / employees.size();
		} else {
			return 0;
		}

	}

	public static int numOfEmployees(List<? extends Employee> employees) {
		return employees.size();
	}

	public static int numOfEmployeesPerDepartment(List<? extends Employee> employees, String department) {
		int employeeCount = 0;
		for (Employee employee : employees) {
			if (employee.getDepartment().equals(department)) {
				employeeCount++;
			}
		}
		return employeeCount;
	}

	public static List<Manager> getManagers(List<? extends Employee> employees){
		List<Manager> managers = new ArrayList<>();
		for(Employee employee: employees){
			if(employee instanceof Manager){
				managers.add((Manager)employee);
			}
		}
		return managers;
	}

	public static <T extends Employee> void insertEmployees(List<? extends T> src, List<T> dst){
		dst.addAll(src);
	}
}
