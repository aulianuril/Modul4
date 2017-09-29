/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author Lely
 */
public abstract class Vehicle {
    public void function(){
        System.out.println("Transportation Tools");
    }
    public void fuel(){
        System.out.println("Fuel");
    }
    public abstract void walk();
}
