package edu.westga.cs1301.lab1.test;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;
import edu.westga.cs1302.lab1.view.ViewBill;

public class TestViewBill {
	
	@Test
	public void testWhenNoItemInBill() {
		Bill currentBill = new Bill();
		ViewBill displayedBill = new ViewBill(currentBill);
		
		String display = displayedBill.getText();
		System.out.println(display);
	}
	
	@Test
	public void testWhenOneItemInBill() {
		Bill currentBill = new Bill();
		ViewBill displayedBill = new ViewBill(currentBill);
		
		BillItem item = new BillItem("Eggs", 6.89);
		currentBill.addItem(item);
		
		String display = displayedBill.getText();
		System.out.println(display);
		
	}
	
	@Test
	public void testWhenMultipleItemsInBill() {
		Bill currentBill = new Bill();
		ViewBill displayedBill = new ViewBill(currentBill);
		
		BillItem itemOne = new BillItem("Eggs", 6.89);
		currentBill.addItem(itemOne);
		BillItem itemTwo = new BillItem("Cheese", 10.98);
		currentBill.addItem(itemTwo);
		BillItem itemThree = new BillItem("Bread", 7.99);
		currentBill.addItem(itemThree);
		
		String display = displayedBill.getText();
		System.out.println(display);
	}
}
