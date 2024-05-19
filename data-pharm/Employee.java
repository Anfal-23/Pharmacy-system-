/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmcys;

/**
 *
 * @author alish
 */
public class Employee extends User{
 
 
    public Employee() { }
 
    public Employee(int ID, int password, String userName, String name, int age, String phoneNumber, String address) {
 
        super(ID, password, userName, name, age, phoneNumber, address);
 
    }
 
  
 
 
    public void update (int ID,String phoneNumber, int age,String name, String address) {
 
        super.setID(ID);
 
        super.setName(name);
 
        super.setAge(age);
 
        super.setPhoneNumber(phoneNumber);
 
        super.setAddress(address);
 
    }
 
  
 
    public double discount(double totalPrice , double percent){
 
        return totalPrice*(percent/100.0);
 
    }
 
}
