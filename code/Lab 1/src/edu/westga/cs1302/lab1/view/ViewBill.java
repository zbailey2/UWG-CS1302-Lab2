package edu.westga.cs1302.lab1.view;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

/** Takes information from a bill and displays it
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class ViewBill {
	private Bill bill;
	/**
	 * Creates a ViewBill object, by passing a bill object in
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param bill previously created bill object containing the list of items
	 */
	
	public ViewBill(Bill bill) {
		this.bill = bill;
	}
	
	/** Return a String containing the list of bill items and total for the bill.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return a String containing the list of bill items and total for the bill
	 */
	
	public String getText() {
		String text = "ITEMS" + System.lineSeparator();
		double subTotal = 0.0;
		for (BillItem item : this.bill.getBillItems()) {
			text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
			subTotal += item.getAmount();
		}
		
		text += System.lineSeparator();
		text += "SUBTOTAL - $" + subTotal + System.lineSeparator();
		double billTax = subTotal * Bill.TAX;
		billTax = Math.round(billTax * 100.00) / 100.00;
		double billTip = subTotal * Bill.TIP;
		billTip = Math.round(billTip * 100.00) / 100.00;
		subTotal = Math.round(subTotal * 100.00) / 100.00;
		text += "TAX - $" + billTax + System.lineSeparator();
		text += "TIP - $" + billTip + System.lineSeparator();
		text += "TOTAL - $" + (subTotal + billTip + billTax);
		
		return text;
	}
}
