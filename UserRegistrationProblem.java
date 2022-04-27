package com.bl.userregistration;
/*
 * @Author: Rajesh Pal
 * Checking if entered Password by user is valid or invalid.
 * Rule 1 : Password should have minimum 8 characters.
 * Rule 2 : Password should have at least one upper Case.
 * Rule 3 : Password should have at least one numeric number.
 */
import java.util.Scanner;

public class UserRegistrationProblem {
	public static void main(String[] args) {
		System.out.println("Enter the Password you want to put : ");
		Scanner sc = new Scanner(System.in);
		boolean result = password(sc.nextLine());
		
		if(result) {
			System.out.println("Password is Valid.");
		}else {
			System.out.println("Password is Invalid.");
		}
	}
	
	public static boolean password(String password) {
		return password.matches("^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9@!#$%&_]{8,}");
	}
}
