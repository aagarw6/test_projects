package com.anshika.records;

public class Records {
	private String name;
	private int phn;
	private int age;
	public Records()
	{
		name="";
		phn= 0;
		age= 0;
		
	
	}
	public Records(String name,int phn,int age)
	{
		this.name=name;
		this.phn =phn;
		this.age = age;
	}
	public String getname()
	{
		return name;
	}
	public int getphn()
	{
		return phn;
	}
	public int getage()
	{
		return age;
	}
	
	}


