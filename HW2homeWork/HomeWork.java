package HW2homeWork;

import java.util.Base64;
import java.util.Scanner;

 class HomeWork{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Please entry you full name");
	String fullName=sc.nextLine();
	String encodedFullName = Base64.getEncoder().encodeToString(fullName.getBytes());
	System.out.println("Program result: " + encodedFullName);
	}
}
