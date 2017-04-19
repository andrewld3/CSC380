//package restaurant;
//
//import java.util.Map;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.ArrayList;
//import java.io.*;
//import java.util.Scanner;
//import java.util.concurrent.TimeUnit;
//
//public class Restaurant {
// 
////    Employee emp;
////    public static void main(String [] args)throws IOException, InterruptedException{
////        
////        Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
////        
////        initialize(menu);
////        
////        RestaurantGUI logingui = new RestaurantGUI();
////       
////        
//////        Login login = new Login();
//////        login.signIn();
////        //Employee test = login.getEmployee();
////      
//////        test.setSignIn();
//////        Employee test = new Employee();
//////        test.loadMenu(menu);
//////        test.createTable(1);
//////        table number, food item
//////        test.orderFood(1, "Hamburger");
//////        test.orderFood(1, "Hamburger");
//////        test.orderFood(1, "Small Children");
//////        test.finishTable(1);
//////        TimeUnit.SECONDS.sleep(10);
//////        test.setSignOut();
//////        System.out.println("Sign in: " + test.returnSignIn()+ " and Sign out: " + test.returnSignOut());
////    }
////    
////    public static void initialize(Map<String, MenuItem> menu)throws IOException{
////        File inFile = new File("menu.txt");
////        Scanner inFileSC = new Scanner(inFile);
////        
////        while(inFileSC.hasNext()){
////            String name = inFileSC.nextLine();
////            double price = Double.parseDouble(inFileSC.nextLine());
////            int inventory = Integer.parseInt(inFileSC.nextLine());
////            loadMenu(name, price, inventory, menu);
////        }
////    }
////    
////    public static void loadMenu(String name, double price, int inventory, Map<String, MenuItem> menu){
////        
////        MenuItem item = new MenuItem(name, price ,inventory);
////        menu.put(item.getName(), item);
////    }
//}
