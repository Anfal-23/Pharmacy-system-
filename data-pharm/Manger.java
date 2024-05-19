/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmcys;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author alish
 */
public class Manger extends User{
 
    public Manger() {
    }
 
    public Manger(int ID, int password, String userName, String name, int age, String phoneNumber, String address) {
        super(ID, password, userName, name, age, phoneNumber, address);
    }
   
public void delete(int id, Queue<Employee> employees) {
    Queue<Employee> tempQueue = new LinkedList<>();
    boolean isFound = false;
    Employee emp = null;

    // Dequeue employees and check their IDs
    while (!employees.isEmpty()) {
        emp = employees.poll();

        if (emp.getID() == id) {
            // If the ID matches, do not add it back to the queue
            System.out.println("\n-- " + emp.getName() + ", Deleted Successfully...");
            isFound = true;
        } else {
            // Enqueue the employee to the temporary queue
            tempQueue.offer(emp);
        }
    }

    // Move all employees back to the original queue
    while (!tempQueue.isEmpty()) {
        employees.offer(tempQueue.poll());
    }

    if (!isFound) {
        System.out.println("-- Employee didn't exist --");
    }
}
public void addNew(Employee e, Queue<User> employees){
        employees.add(e);
    }
}
