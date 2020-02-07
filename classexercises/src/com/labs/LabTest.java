package com.labs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LabTest {
	public static void main(String[] args) {
//		List<Employee> employees = new ArrayList<>();
//		List<Manager> managers = new ArrayList<>();
		List<Employee> combined = new ArrayList<>();
		Random random = new Random();
//		for (int i = 0 ; i < 100 ; i++) {
//			employees.add(new Employee("FirstName"+i, "LastName"+i, 50000*random.nextFloat(),"Department"+ random.nextInt(3)));
//			managers.add(new Manager("FirstName"+i, "LastName"+i, 50000*random.nextFloat(),"Department"+ random.nextInt(3)));
//		}


//		float averageSalary = EmployeeStatistics.averageSalary(employees);
//		int numOfEmployees = EmployeeStatistics.numOfEmployees(employees);
//		int numOfEmployeesPerDepartment = EmployeeStatistics.numOfEmployeesPerDepartment(employees, "Department1");
//
//		System.out.println(employees);
//		System.out.println("averageSalary :" + averageSalary);
//		System.out.println("numOfEmployees :" + numOfEmployees);
//		System.out.println("numOfEmployeesPerDepartment :" + numOfEmployeesPerDepartment);
//
//		float averageManagerSalary = EmployeeStatistics.averageSalary(managers);
//		int numOfManagers = EmployeeStatistics.numOfEmployees(managers);
//		int numOfManagersPerDepartment = EmployeeStatistics.numOfEmployeesPerDepartment(managers, "Department1");
//
//		System.out.println(managers);
//		System.out.println("averageManagerSalary :" + averageManagerSalary);
//		System.out.println("numOfManagers :" + numOfManagers);
//		System.out.println("numOfManagersPerDepartment :" + numOfManagersPerDepartment);

		for (int i = 0 ; i < 3 ; i++) {
			combined.add(new Employee("FirstName"+i, "LastName"+i, 50000*random.nextFloat(),"Department"+ random.nextInt(3)));
			combined.add(new Manager("FirstName"+i, "LastName"+i, 50000*random.nextFloat(),"Department"+ random.nextInt(3)));
		}

		List<Manager> managers = EmployeeStatistics.getManagers(combined);
		System.out.println(managers);

		List<Employee> newEmployees = new ArrayList<>();
		System.out.println("Before adding: " + newEmployees);
		EmployeeStatistics.insertEmployees(managers, newEmployees);
		System.out.println("After adding: " + newEmployees);

	}

}
