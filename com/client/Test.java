package com.client;
import com.model.*;
import com.service.*;
import java.util.Scanner;

public class Test {
	
	public static void LogIn() {
		Scanner sc=new Scanner(System.in);
		user u=new user();
		System.out.println("Enter UserName And Password.");
		u.setUsername(sc.next());
		u.setPassword(sc.next());
		if(u.getUsername()==u.getUsername()) {
			if(u.getPassword()==u.getPassword()) {
				System.out.println("Login User");
			}
		}
		else {
			System.out.println("Trying.");
		}
		
	}
	public static void main(String[] args) throws Exception {
	
		
		Scanner sc=new Scanner(System.in);
		BookingMyshow desk=new BookingDisk();
		System.out.println("User Login");
		LogIn();
		
		
		for(;;)
		{
		System.out.println("Choose option from below list");
		System.out.println("1.Book your ticket\n2.Add Meal\n3.Print Details\n4.LogOut");
		int n=sc.nextInt();		 
		switch(n)
		{
		  case 1 :
		  
			  			desk.bookTicket();
			  			break;
		  case 2 :
			  		System.out.println("PVR Menus Card");
			  		System.out.println("What do you want to eat");
			  
			  		desk.addMeal();
			  		break;
		  case 3 :
			  		desk.printDetails();
			  		break;
		  case 4:
			  		desk.logout();
			  		break;
			  
		  default :
			  System.out.println("Invaild choice option.");
		}
		}

	}

}



