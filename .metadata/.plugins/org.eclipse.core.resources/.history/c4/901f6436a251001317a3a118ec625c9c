package com.anshika.records;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortedTest {

	private Sorted sort;
	private String name;
	private int age;
	private int ph;
	
	@Before
	public void setup(){
	 sort = new Sorted();
	 name= "anshika";
	 age=23;
	 ph=3122;
	}
	
	
	@Test
	public void testAddEntry(){
		sort.addentry(name, ph, age);
		Records r = new Records(name, ph, age);
		
		Assert.assertEquals("Name does not match ", r.getname(), sort.table.get(0).getname());
		Assert.assertEquals("Age does not match ", r.getage(), sort.table.get(0).getage());
		Assert.assertEquals("Ph does not match ", r.getphn(), sort.table.get(0).getphn());
	}
	
}
