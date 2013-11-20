package com.anshika.records;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class RecordsTest {

	private Records record;
	
	@Before
	public void setup(){
		record = new Records("Anshika",23,3127);
		
	}
	@Test
	public void testRecordGetName(){
		String expectedName ="Anshika";
		String actualName = record.getname();
		//The message is displayed only when the condition is not met
		Assert.assertEquals("Expected name does not match with the actual name", expectedName,actualName);
		
	}
	
	@Test
	public void testRecordGetNameNotNull(){
		String actualName = record.getname();
		Assert.assertNotNull("Name cannot be null", actualName);
	}
	
	//TODO
	//Do the same for age and phone number
	
}
