package com.bl.userregistration;
/*
 * @Author: Rajesh Pal
 * Checking if entered name by use is valid or invalid.
 */
import java.util.Scanner;

public class UserRegistrationProblem {
	public static void main(String[] args) {
		System.out.println("Enter your Email Id : ");
		Scanner sc = new Scanner(System.in);
		boolean result = eMail(sc.nextLine());
		
		if(result) {
			System.out.println("Email Id is Valid.");
		}else {
			System.out.println("Email Id is Invalid.");
		}
	}
	
	public static boolean eMail(String email) {
		return email.matches("[a-zA-Z0-9]+[.][a-zA-Z0-9]*@([a-zA-Z]{2,})+([.][a-zA-Z]+)+");
	}
}
