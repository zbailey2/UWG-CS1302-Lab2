package edu.westga.cs1301.lab1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;


public class TestRoundingOnValues {
	
	@Test
	public void testWhenRoundingMultiplePlacesOut() {
		Bill currentBill = new Bill();
		BillItem item = new BillItem("Free Eggs", 0.00001);
		
		currentBill.addItem(item);
		
		assertEquals(0.00, item.getAmount(), "checking to see if rounds nothing");
	}
	
	@Test
	public void testWhenRoundingUpOneDecimalPlace() {
		Bill currentBill = new Bill();
		BillItem item = new BillItem("Not Free Eggs", 7.995);
		
		currentBill.addItem(item);
		
		assertEquals(8.00, item.getAmount(), "checking if rounds three decimal places ");
	}
	
	@Test
	public void testWhenNoRoundingNeeded() {
		Bill currentBill = new Bill();
		BillItem item = new BillItem("Cheap Eggs", 9.01);
		
		currentBill.addItem(item);
		
		assertEquals(9.01, item.getAmount(), "checking to see if doesnt round");
	}
	
	@Test
	public void testWhenRoundingIsNotNecessary() {
		Bill currentBill = new Bill();
		BillItem item = new BillItem("Not eggs?!", 9.091);
		
		currentBill.addItem(item);
		
		assertEquals(9.09, item.getAmount(), "checking to see if rounds up once");
	}
}
