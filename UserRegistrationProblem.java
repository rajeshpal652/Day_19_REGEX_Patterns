package com.bl.userregistration;
/*
 * @Author: Rajesh Pal
 * Checking if entered name by use is valid or invalid.
 */
import java.util.Scanner;

public class UserRegistrationProblem {
	public static void main(String[] args) {
		System.out.println("Enter your First Name : ");
		Scanner sc = new Scanner(System.in);
		boolean result = Email(sc.nextLine());
		
		if(result) {
			System.out.println("First Name is Valid.");
		}else {
			System.out.println("First Name is Invalid.");
		}
	}
	
	public static boolean Email(String eMail) {
		return eMail.matches("^[A-Z][a-z]{2,}");
	}
}
