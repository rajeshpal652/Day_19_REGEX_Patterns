package com.bl.userregistration;
/*
 * @Author: Rajesh Pal
 * Testing all the sample emails if they are valid or invalid using Regular Expressions.
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

	public static void main(String[] args) {
		ArrayList<String> emails =new ArrayList<>();
		
		emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");
        //invalid emails
        emails.add("abc");
	    emails.add("abc..");
	    emails.add("abc..@gmail.com");
	    emails.add("abc@abc@gmail.com");
	    emails.add("abc@.com.my");
	    emails.add("abc123@gmail.a");
	    emails.add("abc123@.com");
	    emails.add("abc123@.com.com");
	    emails.add(".abc@abc.com");
	    emails.add("abc()*@gmail.com");
	    emails.add("abc..2002@gmail.com");
	    emails.add("abc.@gmail.com");
	    emails.add("abc@abc@gmail.com");
	    emails.add("abc@gmail.com.1a");
	    emails.add("abc..@gmail.com");
	    emails.add("abc@gmail.com.aa.au");
	    
	    String reGex ="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
        Pattern pattern = Pattern.compile(reGex);
        for (String str:emails){
            Matcher matcher=pattern.matcher(str);
            if(matcher.matches()){
                System.out.println("vaild email: "+ str + " :"+matcher.matches());
            }
            else {
                System.out.println("Invaild email: "+ str + " :"+matcher.matches());
            }
        }
	}
}
