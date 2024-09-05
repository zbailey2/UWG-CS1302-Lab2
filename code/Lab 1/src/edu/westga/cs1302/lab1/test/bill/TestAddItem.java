package edu.westga.cs1302.lab1.test.bill;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

public class TestAddItem {

	@Test
	public void testWhenAddingNullItem() {
		Bill currentBill = new Bill();
		assertThrows(IllegalArgumentException.class, () -> {
			currentBill.addItem(null);
		});
	}

	@Test
	public void testWhenAddingNoItems() {
		Bill currentBill = new Bill();

		assertEquals(0, currentBill.getBillItems().size(), "makes sure that the current bill does not contain any items when none are added");
	}

	@Test
	public void testWhenAddingOneItem() {
		Bill currentBill = new Bill();
		BillItem item = new BillItem("Chicken", 0.99);

		currentBill.addItem(item);
		assertEquals(1, currentBill.getBillItems().size(), "makes sure all added items are included in the curent bill");
	}

	@Test
	public void testWhenAddingMultipleItems() {
		Bill currentBill = new Bill();
		BillItem item1 = new BillItem("Chicken", 0.99);
		BillItem item2 = new BillItem("Rice", 1.99);
		BillItem item3 = new BillItem("Broccoli", 5.00);

		currentBill.addItem(item1);
		currentBill.addItem(item2);
		currentBill.addItem(item3);
		assertEquals(3, currentBill.getBillItems().size(), "makes sure all added items are included in the curent bill");
	}
}
