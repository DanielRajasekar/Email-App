package com.daniel.service;
import java.util.*;

import com.daniel.model.Employee;
public class CredentialService {
	
	
	public String generateEmail(String firstName, String lastName, String department) {
		
		return firstName+lastName+"@"+department+".abc.com";
	
	}
	
	public char[] generatePassword() {
		
		String upperCase ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase ="abcdefghijklmnopqrstuvwxyz";
		String number ="0123456789";
		String special ="!@#$%^&*()<>+-=_{}";
		
		String value = upperCase+lowerCase+number+special;
		
		Random random =new Random();
		
		char[] password =new char[8];
		
		for (int i=0; i<8; i++) {
			password[i]=value.charAt(random.nextInt(value.length()));
		}
		return password;
	}
	
	public void showCredential(Employee employee, String generatedEmail, char[] generatedPassword) {
		System.out.println("Dear"+employee.getFirstName()+"your generated credential are as follows");
		System.out.println("Email -->"+generatedEmail);
		System.out.println("Password -->");
		System.out.println(generatedPassword);
	}
	
}
