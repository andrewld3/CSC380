package restaurant;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Table {
    ///
	private ArrayList<String> orderDesc = new ArrayList<String>();
	
	public Boolean addToOrder(String name) {
                return orderDesc.add(name);
		
	}
	
	public Boolean removeFromOrder(String name) {
		return orderDesc.remove(name);
	}
        
	
        public ArrayList getBillInfo(Map<String, MenuItem> menu){
            ArrayList<ArrayList> billInfo = new ArrayList<ArrayList>();
            ArrayList<Double> prices = new ArrayList<Double>();
            
            for(int i = 0; i < orderDesc.size(); i++){
                prices.add(i, menu.get(orderDesc.get(i)).getPrice());
            }
            
            billInfo.add(orderDesc);
            billInfo.add(1, prices);
            
            
            return billInfo;
        }
        
	public ArrayList ReturnOrder() {
		return orderDesc;
	}
	
        public double getSubtotal(Map<String, MenuItem> menu){
            double subtotal = 0;
            
            for(int i = 0; i < orderDesc.size(); i++){
                subtotal = menu.get(orderDesc.get(i)).getPrice() + subtotal;
            }
            
            return subtotal;
        }
        
        public double getTax(Map<String, MenuItem> menu){
            return .08 * getSubtotal(menu);
        }
	
	public double ReturnTotal(Map<String, MenuItem> menu) {
		return getSubtotal(menu) * 1.08;
	}
}
