package com.daniel.main;
import java.util.Scanner;
import com.daniel.service.CredentialService;
import com.daniel.model.Employee;

public class DriverClass {
	
	public static void main(String[] args) {
	
		Employee employee = new Employee("Daniel","Rajasekar");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		Scanner sc= new Scanner(System.in);
		int option = sc.nextInt();
		
//		String department = null;
		switch(option) {
		case 1:
			generatedEmail=cs.generateEmail(employee.getFirstName(),employee.getLastName(),"tech");
			generatedPassword=cs.generatePassword();
			cs.showCredential(employee, generatedEmail, generatedPassword);
//			department ="technical";
//			
			break;
		case 2:
			generatedEmail=cs.generateEmail(employee.getFirstName(),employee.getLastName(),"admin");
			generatedPassword=cs.generatePassword();
			cs.showCredential(employee, generatedEmail, generatedPassword);
//		    department ="admin";
//		    
		    break;
		case 3:
			generatedEmail=cs.generateEmail(employee.getFirstName(),employee.getLastName(),"hr");
			generatedPassword=cs.generatePassword();
			cs.showCredential(employee, generatedEmail, generatedPassword);
//			department ="hr";
//			
			break;
		case 4:
			generatedEmail=cs.generateEmail(employee.getFirstName(),employee.getLastName(),"legal");
			generatedPassword=cs.generatePassword();
			cs.showCredential(employee, generatedEmail, generatedPassword);
//			department ="legal";
//			
			break;
		default:
			System.out.print("Invalid option");
		}
		
		
	}
	
}
