package com.anshika.maths;

public class Maths {

	public int add(int a,int b )
	{
		int addnum;
		addnum=a+b;
		return addnum;
	}
	 
	public int subtract(int a ,int b)
	{
		int subnum;
		subnum=a-b;
		return subnum;
	}
	public int factorial(int a)
	{
		int i;
		int fact=1;
		for(i=1;i<=a;i++)
			{
			fact=i*fact;;
			}
		return fact;
	}
	public int product(int a, int b)
	{
		int pro;
		pro=a*b;
		return pro;
	}
	
	
	}

