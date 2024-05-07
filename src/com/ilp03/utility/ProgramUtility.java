 package com.ilp03.utility;

import java.util.Scanner;

import com.ilp03.service.EmployeeDetailsImpl;

public class ProgramUtility {

	public static void main(String[] args) {
		char continueQuery='Y';
        Scanner scanner=new Scanner(System.in);
		EmployeeDetailsImpl employeeDetails = new EmployeeDetailsImpl();
		do {
			System.out.println("Choose 1.Insert values into Employee table,2.Display Employee assessment on a particular program");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1: employeeDetails.insertIntoEmployees();
			break;
			case 2:employeeDetails.getEmployeeBasedOnProgram();
			break;
			default: System.out.println("Invalid Choice");
			break;
			}
			System.out.println("\n");
			System.out.println("Continue doing query (Y/N)");
			continueQuery = scanner.next().charAt(0);
	}
		while(continueQuery=='Y');
			}

}
