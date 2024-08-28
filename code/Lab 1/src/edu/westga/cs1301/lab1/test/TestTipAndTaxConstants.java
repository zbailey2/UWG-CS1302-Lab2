package edu.westga.cs1301.lab1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs1302.lab1.model.Bill;

public class TestTipAndTaxConstants {
	
	@Test
	public void testWhenNoValueInSubTotal() {
		double subTotal = 0.0;
		double billTax = subTotal * Bill.TAX;
		double billTip = subTotal * Bill.TIP;
		
		assertEquals(0.0, billTax, "checking for billTax amount with no subTotal");
		assertEquals(0.0, billTip, "checking for billTip amount with no subTotal");
	}
	
	@Test
	public void testWhenSomeValueInSubTotal() {
		double subTotal = 5.0;
		double billTax = subTotal * Bill.TAX;
		double billTip = subTotal * Bill.TIP;
		
		assertEquals(1, billTax, "checking for billTax amount with subTotal");
		assertEquals(0.5, billTip, "checking for billTip amount with subTotal");
	}
}
