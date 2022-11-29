package Day1Assignment;

import java.util.Scanner;

import org.testng.annotations.Test;


public class Assignment1 {
	@Test
    public void assignment() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Name");
		String firstName=sc.nextLine();
		System.out.println("Enter the Last Name");
		String lastName=sc.nextLine();
		System.out.println("Hello"+" "+firstName+" "+lastName);

	}

}
