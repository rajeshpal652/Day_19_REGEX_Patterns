package com.bl.userregistration;
/*
 * @Author: Rajesh Pal
 * Checking if entered name by use is valid or invalid.
 */
import java.util.Scanner;

public class UserRegistrationProblem {
	public static void main(String[] args) {
		System.out.println("Enter your Full Name : ");
		Scanner sc = new Scanner(System.in);
		boolean result = fullName(sc.nextLine());
		
		if(result) {
			System.out.println("Full Name is Valid.");
		}else {
			System.out.println("Full Name is Invalid.");
		}
	}
	
	public static boolean fullName(String fullName) {
		return fullName.matches("^[A-Z][a-z]{2,}\\s[A-Z][a-z]{2,}$");
	}
}
