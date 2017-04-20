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
       // System.out.println(name + " has been added to order.");
        return orderDesc.add(name);
        
    }

    public Boolean removeFromOrder(String name) {
        return orderDesc.remove(name);
    }


    public ArrayList getBillInfo(Map<String, MenuItem> menu){
        ArrayList<MenuItem> billInfo = new ArrayList<MenuItem>();
        //System.out.println(orderDesc);
        for(int i = 0; i < orderDesc.size(); i++){
            billInfo.add(menu.get(orderDesc.get(i)));
        }

        return billInfo;
    }

    public ArrayList returnOrder() {
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
        return getSubtotal(menu) + getTax(menu);
    }
}