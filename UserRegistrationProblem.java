package com.bl.userregistration;
/*
 * @Author: Rajesh Pal
 * Checking if entered Phone number by user is valid or invalid.
 */
import java.util.Scanner;

public class UserRegistrationProblem {
	public static void main(String[] args) {
		System.out.println("Enter your Phone Number : ");
		Scanner sc = new Scanner(System.in);
		boolean result = phoneNumber(sc.nextLine());
		
		if(result) {
			System.out.println("Phonne Number is Valid.");
		}else {
			System.out.println("Phone Number is Invalid.");
		}
	}
	
	public static boolean phoneNumber(String phoneNumber) {
		return phoneNumber.matches("^[0-9]{2}\s[0-9]{10}");
	}
}
