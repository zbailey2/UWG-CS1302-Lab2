package edu.westga.cs1302.lab1.test.bill_item;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab1.model.BillItem;

public class TestConstructor {

	@Test
	public void testWhenNameIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem(null, 6.99);
		});
	}

	@Test
	public void testWhenValueIsNegative() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem("Chicken", -0.01);
		});
	}

	@Test
	public void testWhenValueIsZero() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem("Chicken", 0.00);
		});
	}

	@Test
	public void testWhenValueIsRightAboveZero() {
		BillItem item = new BillItem("Chicken", 0.01);

		assertEquals("Chicken", item.getName(), "Makes sure created item with correct name");
		assertEquals(0.01, item.getAmount(), "Makes sure created item with correct price");
	}

	@Test
	public void testWhenCreatingNormalObject() {
		BillItem item = new BillItem("Ham", 15.69);

		assertEquals("Ham", item.getName(), "Makes sure created item with correct name");
		assertEquals(15.69, item.getAmount(), "Makes sure created item with correct price");
	}
}
