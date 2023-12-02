package com.model;

public class Snack {
	private int id;
	private String name;
	private int price;
	private String desc;
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
	public void setDesc(String desc)
	{
		this.desc=desc;
	}
	public String getDesc()
	{
		return desc;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public Snack(int id,String name,int price,String desc)
	{
		this.id=id;
		this.name=name;
		this.desc=desc;
		this.price=price;
	}
}
