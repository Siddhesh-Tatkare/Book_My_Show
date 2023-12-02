package com.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import com.model.user;
import com.model.Movie;
import com.model.Snack;

public class BookingDisk implements BookingMyshow {
	Scanner sc=new Scanner(System.in);
	List<Movie> moviesChoosen=new LinkedList<>();
	List<Snack> snacksChoosen=new LinkedList<>();
	
	 public Movie bookTicket() {
		
		 List<Movie> mv = new ArrayList<Movie>();
	        mv.add(new Movie(1, "RRR", 400, 8.2, "Action"));
	        mv.add(new Movie(2, "Jawan", 540, 8.1, "Action"));
	        mv.add(new Movie(3, "Nun", 111, 8.2, "Horier"));
	        mv.add(new Movie(4, "Don", 130, 7.8, "Action"));
	        
	        for (Movie m : mv) {
	            System.out.println("ID: " + m.getId());
	            System.out.println("Name: " + m.getName());
	            System.out.println("Price: $" + m.getPrice());
	            System.out.println("Rating: " + m.getRating());
	            System.out.println("Genre: " + m.getGenre());
	            System.out.println("---------------------------------");
	        }
	        System.out.println("Enter your choice movie .");
	        int movieNo=sc.nextInt();
	        
	        Movie mChoosen=mv.get(movieNo-1);
	        moviesChoosen.add(mChoosen);
	        for(Movie m:moviesChoosen)
	        {
	        	
	        	System.out.print("NAME :"+m.getName()+"  ");
	          	System.out.println("GENRE :"+m.getGenre());
	          	System.out.println("PRICE :"+m.getPrice()+"  ");
	        }
	        return null;
	    }
	public Snack addMeal()
	{
		
		List<Snack> sn=new LinkedList<>();
		sn.add(new Snack(1,"pizza",100,"chess"));
		sn.add(new Snack(2,"burger",120,"chiken"));	
		sn.add(new Snack(3,"soda",100,"cola"));
		
		for(Snack s:sn)
		{
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getPrice());
			System.out.println(s.getDesc());
			System.out.println("-----------------------------------");
		}
		
		System.out.print("Select a meal:");
		char loop='Y';
		do
		{
			int ch=sc.nextInt();
		 sc.nextLine();
		 Snack snackChoosen=sn.get(ch-1);
		 snacksChoosen.add(snackChoosen);
		 System.out.println("do you want to add anything");
		 System.out.println("Press Y to add meal");
		 System.out.println("press N exit.");
		 char loopchoice=sc.next().charAt(0);
		 loop=loopchoice;
		}while(loop=='y');
		
		//char choice = sc.next().charAt(0);
//		if(choice=='Y' || choice=='N') {
//			Snack snackChoosen=sn.get(choice-1);
//			 snacksChoosen.add(snackChoosen);
//			 System.out.println("do you want to add anything");
//		 System.out.println("Press Y to add another meal\n Otherwise press N");
//		}
		return null;
	}

	public void printDetails()
	{
		int moviePrice=0;
		 int snackPrice=0;
		System.out.println("....seat Booking.....");
		int seat=sc.nextInt();
		System.out.println("_______________Booking Details________________ ");
        for(Movie a:moviesChoosen)
        {
        	
        	System.out.print("NAME :"+a.getName()+"  ");
          	System.out.println("PRICE :"+a.getPrice()+"  ");
        }
        System.out.println("______________Your Meals___________________");
        
        
        for(Snack s:snacksChoosen)
        {
        	System.out.println("Snack :"+s.getName());
        	System.out.println("Price :"+s.getPrice());
        }
        
        if(snacksChoosen.isEmpty())
        {
        	System.out.println("No meal user will choice.");
        }else {
        	System.out.println("Error.");
        }
        System.out.println();
       
       for(Movie m:moviesChoosen)
       {
    	   moviePrice=+m.getPrice();
       }
       
       for(Snack s:snacksChoosen)
       {
    	  snackPrice=snackPrice+s.getPrice(); 
       }
       
        int price=moviePrice + snackPrice;
        System.out.println("Total Price :"+price);
        }
	
		public void logout()
		{
		user u=new user();
		u.setUsername("Siddhesh");
		u.setPassword("Siddhu@123");
		
		if(u.getUsername()==u.getUsername()) {
			if(u.getPassword()==u.getPassword()) {
				System.out.println("User LogOut Succesful.");
			}
		}
		else {
			System.out.println("User LogOut Failed...");
		}
	}

}

	

