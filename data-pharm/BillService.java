/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmcys;

/**
 *
 * @author alish
 */
public class BillService {
    private int numOfOrders;
    public double totalprice;
    private int orderId;
 
    public BillService(){ }
  
      public BillService(int numOfOrders, int orderId ) {
        this.numOfOrders = numOfOrders;
        this.orderId = orderId;
    }
  
    public BillService(int numOfOrders,double totalprice, int orderId ) {
        this.numOfOrders = numOfOrders;
        this.orderId = orderId;
        this.totalprice=totalprice;
    }
 
    public int getNumOfOrders() {
        return numOfOrders;
    }
 
    public void setNumOfOrders(int numOfOrders) {
        this.numOfOrders = numOfOrders;
    }
 
    public double getTotalprice() {
        return totalprice;
    }
 
    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }
 
    public int getOrderId() {
        return orderId;
    }
 
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
  
   
}
