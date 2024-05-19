/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pharmcys;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

 import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Pharmcys {
 private static Object[] getmenuOrders;
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      
        ArrayList<User> employees = new ArrayList<>();
        ArrayList<User> managers=new ArrayList();
        ArrayList<Menu> menu=new ArrayList();
        ArrayList<Order> orders= new ArrayList();

     //end of arraylist of objects
      
        User e1=new Employee(888620, 5656, "Hour99","Hour",21, "0539356837", "Al Qatif");
        User e2=new Employee(888157, 1122, "Raghad4411","Raghad",20, "0509873410", "Khobar" );
        User e3=new Employee(888009, 9797, "Shahad505","Shahad",21, "0569273505", "Abha" );
        User e4=new Employee(888169, 5005, "Wejdan08","Wejdan",20, "0552239977", "Dammam" );
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
 
        User m1=new Manger(222003, 1141, "Reem99","Reem",29, "0553768390", "Jubail" );
        User m2=new Manger(222342, 4157, "Norah505","Norah",29, "0559006789", "Riyadh" );
      
        managers.add(m1);
        managers.add(m2);
      
        Main_menu item1=new Main_menu(73, "eyeliner","a felt-tip eyeliner with a higher precision to create an intense extra thin and graphic outline" ,1);
        Main_menu item2=new Main_menu(105, "Foundation","the foundation offers a medium coverage with a flexible formula that moves seamlessly with facial expressions to help prevent creasing or migration into wrinkles keeping skin looking healthy and flawless all day",2);
        Main_menu item3=new Main_menu(199, "Blush Palette","Multi-dimensional blush palette of 6 carefully selected shades, which can be used independently or layered for all types of flushed looks",3);
        Main_menu item4=new Main_menu(90, "Concealer","Concealer has got you covered, with a smooth, easy-to-blend, light-diffusing formula and a soft sponge-tipped applicator",4);
        Main_menu item5=new Main_menu(70, "Lipstick","Discover unusual nude colors in unusual matte lasting up to 16 hours super matte gel formula",5);
        Main_menu item6=new Main_menu(206, "Eyeshadow Palette","4in1 Eye Palette contains a base 6 seductive eyeshadows a highlighter and a liner",6);
      
        
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menu.add(item5);
        menu.add(item6);
      ///end of creating+adding objects
            
     
      String choice="";
      int countOrder=0;
      int customerId=0;
      int orderid=0; 
      while(!choice.equalsIgnoreCase("X")){//start of M/E choice 
      display();//call display method
      choice=input.next();
       if(choice.equalsIgnoreCase("m")) { //first if for manger
                Manger mngr= null;
 
                System.out.print("Please, Enter username: ");
                String username=input.next();
 
                System.out.print("Please, Enter password: ");
                int pass=input.nextInt();
              
                //Search for manager
                mngr= (Manger) User.login(pass, username, managers);
                if(mngr!=null){
                int c;
                do {
                  
                   
                        System.out.println("");
                        System.out.println("---Welcome "+mngr.getName()+"----");
                        System.out.println("");
                        System.out.println("1-Show your info");
                        System.out.println("2-Add employee");
                        System.out.println("3-Delete employee");
                        System.out.println("4-Exit");
                        System.out.print("Enter your choice: ");
                        c=input.nextInt();
                        System.out.println("");
                        switch (c) {
                            case 1:// print info
                                System.out.println("---- Manager Info ----");
                                System.out.println("ID       :"+mngr.getID());
                                System.out.println("Username :"+mngr.getUserName());
                                System.out.println("Name     :"+mngr.getName());
                                System.out.println("Age      :"+mngr.getAge());
                                System.out.println("Phone    :"+mngr.getPhoneNumber());
                                System.out.println("Address  :"+mngr.getAddress());
                                System.out.println();
                                break;
                            case 2://add employee

                                System.out.println("--- Add Employee ---");
                                System.out.print("Enter ID: ");
                                int empId=input.nextInt();
                                System.out.print("Enter username: ");
                                String un=input.next();
                                System.out.print("Enter password: ");
                                int password=input.nextInt();
                                System.out.print("Enter employee name: ");
                                String name=input.next();
                                System.out.print("Enter employee age: ");
                                int age=input.nextInt();
                                System.out.print("Enter phone: ");
                                String phoneNum=input.next();
                                System.out.print("Enter address: ");
                                String addr=input.next();
                                User e=new Employee(empId, password, un,name,age, phoneNum,addr);
Queue<User> employeesQueue = new LinkedList<>(employees);
mngr.addNew((Employee) e, employeesQueue);
                                System.out.println("");
                                System.out.println("---- Employee Added Successfully ----\n");
                                System.out.println("ID       :"+e.getID());
                                System.out.println("Username :"+e.getUserName());
                                System.out.println("Name     :"+e.getName());
                                System.out.println("Age      :"+e.getAge());
                                System.out.println("Phone    :"+e.getPhoneNumber());
                                System.out.println("Address  :"+e.getAddress());
                                System.out.println("\n");
                                break;
    case 3: // Delete employee
    System.out.println("---- Employees List ---- ");
    System.out.println("ID\tName");
    for (int i = 0; i < employees.size(); i++) {
        System.out.println(employees.get(i).getID() + "\t" + employees.get(i).getName()); // Print the emp ID and name you want to delete
    }
    System.out.println("");
    System.out.print("Enter employee ID: ");
    int id = input.nextInt();
    boolean found = false;
    for (int i = 0; i < employees.size(); i++) {
        if (employees.get(i).getID() == id) {
            employees.remove(i);
            found = true;
            break;
        }
    }
    if (found) {
        System.out.println("Employee deleted successfully.");
    } else {
        System.out.println("Employee not found.");
    }
    System.out.println("---- Remaining Employees ---- ");
    System.out.println("ID\tName");
    for (int i = 0; i < employees.size(); i++) {
        System.out.println(employees.get(i).getID() + "\t" + employees.get(i).getName());
    }
    break;


                            case 4://exit manager
                                System.out.println("Bye.."+mngr.getName()+"\n");
                                break;
                               default:
                                break;
                      }
                    } while (c!=4);
                }else{
                    System.out.println("Invalid Credintial !\n");
                }
       } // end of if for manger
       else if(choice.equalsIgnoreCase("e")){ //start of employee
              
                 
                System.out.print("Please, Enter username: ");
                String username=input.next();
 
                System.out.print("Please, Enter password: ");
                int pass=input.nextInt();
                              
                Employee emp=(Employee) User.login(pass, username, employees);
                int c;
                    do {
                        System.out.println("");
                        System.out.println("---Welcome "+emp.getName()+"----");
                        System.out.println("");
                        System.out.println("1-Show your info");
                        System.out.println("2-Add Item to the items list");
                        System.out.println("3-Delete Item from the items list");
                        System.out.println("4-New Order ");
                        System.out.println("5-Delete Order ");
                        System.out.println("6-Update Order ");
                        System.out.println("7-Exit");
                        System.out.print("Enter your choice: ");
                        c=input.nextInt();
                        switch (c) {
                            case 1:
                                System.out.println("");
                                System.out.println("---- Employee Info ----");
                                System.out.println("ID       :"+emp.getID());
                                System.out.println("Username :"+emp.getUserName());
                                System.out.println("Name     :"+emp.getName());
                                System.out.println("Age      :"+emp.getAge());
                                System.out.println("Phone    :"+emp.getPhoneNumber());
                                System.out.println("Address  :"+emp.getAddress());
                                System.out.println();
                                break;
                        
                            case 2:
                                System.out.println("");
                                System.out.println("--- Add Item ---");
                                System.out.print("Enter Item Name: ");
                                input.nextLine();
                                String in=input.nextLine();
                               System.out.print("Enter the Description: ");
                                String d=input.nextLine();
                                System.out.print("Enter the Price: ");
                                double p=input.nextDouble();
                                int o=0;
                                Menu menuItem=new Main_menu(p, in,d,o);
                                menu.add(menuItem);
                        System.out.println("");
                                System.out.println("---- Item Added Successfully ----\n");
                                menuItem.display();
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("");
                                System.out.println("\t\t---- items List ---- ");
                                System.out.println( "\tID\t"+ "\tName\t"+ "\t\tPrice\t");
                                for (int i = 0; i < menu.size(); i++) {
                                    System.out.println("\t"+i+"\t\t"+ menu.get(i).getNameOfItem()+"\t\t"+menu.get(i).getPrice()+"\t");
                                  
                                }   
                                System.out.print("Enter ID of item to delete: ");
                                int id=input.nextInt();
                                if(id>=0 && id<menu.size()){
                                    menu.remove(id);
                                    System.out.println("");
                                    System.out.println("The item deleted successfully..");
                                  
                                }else{
                                    System.out.println("Invalid Input!!\n");
                                }   break;
                            case 4:
                                int choiceFromMenu;
                                ArrayList<Menu> menuOrders= new ArrayList();
                               int count=0;
                                do{
 
                                    System.out.println("\t\t---- Menu List ---- ");
                                    System.out.println( "\tID\t"+ "\tName\t"+ "\t\tPrice\t");
 
                                    for (int i = 0; i < menu.size(); i++) {
                                        System.out.println("\t"+(i+1)+"\t\t"+ menu.get(i).getNameOfItem()+"\t\t"+menu.get(i).getPrice()+"\t");
                                    }
                                    System.out.println("");
                                    System.out.print("Select from items list id or press -1 to exit: ");
                                    choiceFromMenu= input.nextInt();
                                    System.out.println("");
 
                                    boolean isItemExit =false;
                                    if(choiceFromMenu != -1 ){
                                        for(int i=0; i< menu.size(); i++){
                                            if(choiceFromMenu == i){
                                                isItemExit=true;
                                                count++;
                                                break;
                                            }
 
                                        }
                                        if(!isItemExit){
                                            System.out.println("Wrong choice ... try again");
                                        }else{
                                            Menu m = menu.get(choiceFromMenu);
                                            menuOrders.add(m);
                                        }
 
                                    }else{
 
                                        if(count>0){
                                            System.out.println("");
                                            System.out.print("What is payment method (cash or credit): ");
                                            String pyment=input.next();
                                            System.out.print("What is discount % copoun (exp: 15 or 20) , (if there's not discount put 0): ");
                                            double percentDiscount=input.nextInt();
                                            countOrder++;
                                            customerId++;
                                            double price = calculateTotalPrice(menuOrders);
                                            Payment payment = new Payment(countOrder, countOrder, pyment );
                                            payment.setPaymentType(pyment);
                                            double totalPrice=payment.calculateTotalPrice(price);
                                            double totalPriceBeforeDis=totalPrice;
                                            totalPrice-= emp.discount(totalPrice, percentDiscount);
                                           int numOfOrders=0;
                                           //double totalprice=0;
                    
                                         Order order = new Order(   menuOrders, orderid, customerId, totalPrice , numOfOrders);
                                         
                                     
                                        orders.add(order);
                                            System.out.println("");
                                            System.out.println("The order added successfully..");
                                            System.out.printf("------------------------------------%n");
                                            System.out.printf("  Bill Info %n "); 
                                            System.out.printf("Welcome! this is invoice your order in Pharmcy%n");
                                            System.out.printf("Order id :%n"+ countOrder);
                                             System.out.println("");
                                            System.out.printf("Customer id :%n"+ customerId);
                                             System.out.println("");
                                            System.out.printf("Payment   :%n"+ pyment);
                                             System.out.println("");
                                            System.out.printf("---------------------------------------%n");
                                            System.out.printf("| %-10s | %-8s | %4s | %n","ID", "Name","Price");
                                             System.out.printf("------------------------------------%n");
                                            for (int i = 0; i < menuOrders.size(); i++) {
                                                System.out.printf("| %-10s | %-8s | %4s | %n",(i+1), menuOrders.get(i).getNameOfItem(),menuOrders.get(i).getPrice()); 
                                                System.out.printf("---------------------------------------%n");       
                                            }
                                            
                                            if(percentDiscount> 0)
                                               System.out.println("Total price before discount: \t" + totalPriceBeforeDis +  " SAR\t" +
                                                       "\nTotal price after discount: \t"+ + totalPrice + " SAR\t"+
                                                      "\nDiscount: \t  " + (int)percentDiscount + "%\t"+ "Date: \t"+ LocalDate.now());
                                            else
                                                System.out.printf("Total price:%n" + totalPrice +  " SAR\t" + "Date:%n"+ LocalDate.now());
                                            System.out.println("");
                                            System.out.println("Thank you .....");
                                            System.out.println("");
                                        }                                   
                                    }
 
                                }while(choiceFromMenu!=-1);
                                break;
   case 5:
    System.out.println("");
    System.out.print("Enter order ID to delete it: ");
    int idDelete = input.nextInt();
    boolean isOrderFound = false;

    // Search for order
    for (int i = 0; i < orders.size(); i++) {
        if (orders.get(i).getOrderId() == idDelete) {
            orders.remove(i);
            System.out.println("");
            System.out.println("Delete order done successfully...");
            System.out.println("");
            isOrderFound = true;
            break;
        }
    }

    // Check if order was found and deleted
    if (!isOrderFound) {
        System.out.println("Order with ID " + idDelete + " not found. Please try again.");
        System.out.println("");
    }
    break;
  


                            case 6:
                                System.out.print("Enter id order to update it: ");
                                int updateID=input.nextInt();
                                System.out.println("");
                                Order temp =null;                       
                                boolean isOrderExit =false;
                                for(int i=0; i<orders.size(); i++){
                                    if(orders.get(i).getOrderId() ==updateID ){
                                        temp=orders.get(i); 
                                        isOrderExit=true;
                                        break;
 
                                    }
                                }
                                 ArrayList<Menu> menuOrdersUpdate =new ArrayList();
                                if(temp!=null){
                                    menuOrdersUpdate= (ArrayList<Menu>) temp.getOrder();
                                }
                                if(!isOrderExit){
                                        System.out.println("Wrong id ... try again");
                                        System.out.println("");
                                        break;
                                }
 
                                System.out.println("What you want to add to this order: ");
                                System.out.println("");
                            
                                do{
 
                                    System.out.println("\t\t---- Items List ---- ");
                                    System.out.println( "\tID\t"+ "\tName\t"+ "\t\tPrice\t");
 
                                    for (int i = 0; i < menu.size(); i++) {
                                        System.out.println("\t"+i+"\t\t"+ menu.get(i).getNameOfItem()+"\t\t"+menu.get(i).getPrice()+"\t");
                                    }
                                    System.out.println("");
                                    System.out.print("Select from item id or press -1 to exit: ");
                                    choiceFromMenu= input.nextInt();
                                    System.out.println("");
 
                                    boolean isorderUpdatExit =false;
                                    if(choiceFromMenu != -1 ){
                                        for(int i=0; i< menu.size(); i++){
                                            if(choiceFromMenu == i){
                                                isorderUpdatExit=true;
                                              
                                                break;
                                            }
 
                                        }
                                         if(!isorderUpdatExit){
                                            System.out.println("Wrong choice ... try again");
                                        }else{
                                            Menu m = menu.get(choiceFromMenu);
                                            menuOrdersUpdate.add(m);
                                             for(int i=0; i<orders.size(); i++){
                                                if(orders.get(i).getOrderId() ==updateID ){
                                                    orders.get(i).setOrder(menuOrdersUpdate); 
                                                }
                                            }
                                        }
 
                                    }
                                    else{
                                      
                                        System.out.println("");
                                        System.out.print("What is payment method (cash or credit): ");
                                        String pyment=input.next();
                                        System.out.print("What is discount % copoun (exp: 15 or 20) , (if there's not discount put 0): ");
                                        double percentDiscount=input.nextInt();
                                        double price = calculateTotalPrice(menuOrdersUpdate);
                                        // update
                                        if(temp!=null)
                                             temp.updateOrder(updateID, price,pyment,menuOrdersUpdate, percentDiscount, emp);   
                                       
                                    }
                                            
                                }while(choiceFromMenu!=-1);
                                System.out.println("");
                                break;
                            case 7:
                                System.out.println("Bye.."+emp.getName()+"\n");
                                break;
                            default:
                                break;
                        }
                    } while (c!=7);
 
              
            }//end of employee
    
               else if(choice.equalsIgnoreCase("x")){
                System.out.println("Bye..Thank you"); 
            break;
               }
              
               else{
                System.out.println("Wrong selection, Please try again!\n");
            }
      }//end of while
    }//end of main
  
     // methods   
public static void display(){//display
        System.out.println("-----------------------------");   
        System.out.println("Welcom to Pharmcy System");   
        System.out.println("-----------------------------"); 
 
        System.out.println("Please,Choose ");
 
        System.out.println("If you are Manager Enter 'M' ");
        System.out.println("If you are Employee Enter 'E' ");
        System.out.println("If you want to Exit Enter 'X'");
        System.out.print("Enter your choice: ");
    }
    
    public static double calculateTotalPrice(ArrayList<Menu> menuOrders){//calculate total price
        double total=0.0;
        
        
        for(int i=0; i< menuOrders.size(); i++){
           total+= menuOrders.get(i).getPrice(); 
           System.out.println("total  :"+total);
        }   
        return total;
        
    }
    
}
                                                
                                

 
    

