package edu.westga.cs1302.lab1.test.view_bill;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		String expected = "ITEMS" + System.lineSeparator() + System.lineSeparator() + "SUBTOTAL - $0.0"
				+ System.lineSeparator() + "TAX - $0.0" + System.lineSeparator() + "TIP - $0.0" + System.lineSeparator()
				+ "TOTAL - $0.0";
		assertEquals(expected, display, "Checks the string displayed to make sure it correctly adds elements to string");
	}

	@Test
	public void testWhenOneItemInBill() {
		Bill currentBill = new Bill();
		ViewBill displayedBill = new ViewBill(currentBill);

		BillItem item = new BillItem("Eggs", 6.89);
		currentBill.addItem(item);

		String display = displayedBill.getText();
		String expected = "ITEMS" + System.lineSeparator() + "Eggs - 6.89" + System.lineSeparator()
				+ System.lineSeparator() + "SUBTOTAL - $6.89" + System.lineSeparator() + "TAX - $1.38"
				+ System.lineSeparator() + "TIP - $0.69" + System.lineSeparator() + "TOTAL - $8.96";
		assertEquals(expected, display, "Checks the string displayed to make sure it correctly adds elements to string");

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
		String expected = "ITEMS" + System.lineSeparator() + "Eggs - 6.89" + System.lineSeparator() + "Cheese - 10.98"
				+ System.lineSeparator() + "Bread - 7.99" + System.lineSeparator() + System.lineSeparator()
				+ "SUBTOTAL - $25.86" + System.lineSeparator() + "TAX - $5.17" + System.lineSeparator() + "TIP - $2.59"
				+ System.lineSeparator() + "TOTAL - $33.62";
		assertEquals(expected, display, "Checks the string displayed to make sure it correctly adds elements to string");
	}
}
