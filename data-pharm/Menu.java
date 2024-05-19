/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmcys;

/**
 *
 * @author alish
 */

public class Menu {
  
    public double price;
    public String nameOfItem;
    public String discription;
   public int orderid;
 
  
    public Menu(){
      
    }
 
    public Menu(double price, String nameOfItem, String discription, int orderid) {
        this.price = price;
        this.nameOfItem = nameOfItem;
        this.discription = discription;
       this.orderid = orderid;
    
    }
    
     public void display(){
    
        System.out.println(this.price+ " \t " + "\t "+this.discription + this.nameOfItem + " \t ");
    }
    
    public double getprice() {
        return price;
    }
    
     public String getnameOfItem() {
        return nameOfItem;
    }
    
    public String getdescription() {
        return discription;
    }
    
   public int orderid() {
       return orderid;
   }
    
    public void setprice(double price) {
        this.price = price;
    }
 
    public void setnameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }
 
    public void setdescription(String discription) {
        this.discription = discription;
    }
    
   public void setorderid(int orderid) {
        this.orderid = orderid;
    }

    double getPrice() {
        return price;
    }

    String getNameOfItem() {
        return nameOfItem;
    }

    String getDiscription() {
        return discription;   
    }
}

