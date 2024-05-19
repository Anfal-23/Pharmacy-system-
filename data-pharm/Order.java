/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmcys;

/**
 *
 * @author alish
 */


import java.time.LocalDate;
import java.util.ArrayList;
 
 
public class Order extends BillService{
 
 
    private ArrayList<Menu> order; 
 
    private int customerId;
 
 
    public Order(ArrayList<Menu> order,int orderId, int customerId, double totalprice,int numOfOrders) {
 
        super(numOfOrders, totalprice,orderId );
 
        this.order = order;
 
        this.customerId = customerId;
 
  
 
    }
 
 
    public ArrayList<Menu> getOrder() {
 
        return order;
 
    }
 
 
    public void setOrder(ArrayList<Menu> order) {
 
        this.order = order;
 
    }
 
 
    public int getCustomerId() {
 
        return customerId;
 
    }
 
 
    public void setCustomerId(int customerId) {
 
        this.customerId = customerId;
 
    }
 
 
    public void addOrder(Menu item){
 
        order.add(item);
 
    }
 
    public void deleteOrder(int orderId){
 
        order.remove(orderId);
 
    }
 
    public void updateOrder(int orderId, double price, String pyment, ArrayList<Menu> menuOrdersUpdate, double percentDiscount, Employee emp){
 
    
 
        Payment p = new Payment();
 
        p.setPaymentType(pyment);
 
        double totalPrice=p.calculateTotalPrice(price); 
 
        double totalPriceBeforeDis= totalPrice;
 
        totalPrice-= emp.discount(totalPrice, percentDiscount);
 
        this.setOrder(menuOrdersUpdate);
 
        this.setTotalprice(totalPrice);
 
        System.out.println("");
 
        System.out.println("The order update successfully..");
 
        System.out.println("");
 
        System.out.println("\t\t -- Bill Info -- "); 
 
        System.out.println("Order id :\t"+ orderId);
 
        System.out.println("Customer id :\t"+ customerId);
 
        System.out.println("Payment     :\t"+ pyment);
 
        System.out.println("");
 
        System.out.println( "\tID\t"+ "\tName\t"+ "\t\tPrice\t");
 
        for (int i = 0; i < order.size(); i++) {
 
            System.out.print("\t"+i+"\t\t" +order.get(i).getNameOfItem()+"\t\t"+
 
                    order.get(i).getPrice()+"\t");
 
        }
 
        System.out.println("");
 
        if(percentDiscount> 0)
 
            System.out.println("Total price before discount:\t" + totalPriceBeforeDis +  " SAR\t" +
 
                    "\nTotal price after discount:\t"+ + totalPrice + " SAR\t"+
 
                   "\nDiscount: " + (int)percentDiscount + "%\t"+ "Date:\t"+ LocalDate.now());
 
        else
 
            System.out.println("Total price:\t" + totalPrice +  " SAR\t" + "Date:\t"+ LocalDate.now());
 
      
 
        System.out.println("");
 
        System.out.println("Thank you .....");
 
        System.out.println("");
 
      
 
    }

  
    }
