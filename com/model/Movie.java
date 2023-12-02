package com.model;

public class Movie {



	private int id;
	private String name;
	private int price;
	private double rating;
	private String genre;
	 public void setId(int id)
	 {
		 this.id=id;
	 }
	 public int getId()
	 {
		 return id;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public void setPrice(int price)
	 {
		 this.price=price;
	 }
	 public int getPrice()
	 {
		 return price;
	 }
     public void setRating(double rating)
     {
    	 this.rating=rating;
     }
     public double getRating()
     {
    	 return rating;
     }
     public void setGenre(String genre)
     {
    	 this.genre=genre;
     }
     public String getGenre()
     {
    	 return genre;
     }
     public Movie(int id,String name,int price,double rating,String genre)
     {
    	 this.id=id;
    	 this.name=name;
    	 this.price=price;
    	 this.rating=rating;
    	 this.genre=genre;
     }
}


