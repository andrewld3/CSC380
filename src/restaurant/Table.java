package restaurant;

import java.util.Scanner;

public class Table {
    ///
	
	private String[] orderDesc = new String[100];
	private double[] price = new double[100];
	private double total;
	private double tax;
	private double subtotal;
	
	public void LoadTable() {
	
		orderDesc[0] = "hamburger";
		price[0] = 10.98;
		orderDesc[1] = "cheeseburger";
		price[1] = 11.99;
		orderDesc[2] = "pizza";
		price[2] = 2.98;
	}
	
	public void EditOrder() {
		orderDesc[0] = "pizza";
	}
	
	public void PrintBill() {
		subtotal = price[0] + price[1] + price[2];
		tax = subtotal *.05;
		total = subtotal + tax;
	}
	
	public String[] ReturnOrder() {
		return orderDesc;
	}
	
	public double[] ReturnPrice() {
		return price;
	}
	
	public double ReturnTotal() {
		return total;
	}
        
        public void Test() {
            //test shit.
        }
}
