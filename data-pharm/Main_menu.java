/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmcys;

/**
 *
 * @author alish
 */
public class Main_menu extends Menu{
 
  Main_menu(){
   
 
    }
 
 
    public Main_menu(double price, String nameOfItem, String discription, int orderid) {
 
        super(price, nameOfItem, discription, orderid);
 
    }
 
  
 
    @Override
 
    public void display(){
 
        System.out.println("Item Name\t Description \t\t"+" Price\t ");
 
        System.out.println(super.getNameOfItem()+" \t "+super.getDiscription()+" \t "+super.getPrice());
 
        
 
    }
 
}
