package com.mycompany.game;
import java.util.Scanner;

public class Player {
    String name;
    int speed, healthPoin, damage,armor;
    Scanner input = new Scanner(System.in);
    
    void run(){
        System.out.println(name+" is Running...");
        System.out.println("Speed : "+speed);
    }
    
    boolean attack(){
        healthPoin-=damage;
        System.out.println(name+" HP is now "+healthPoin);
        return false;
    }
    
    boolean defend(){
        armor-=1;
        System.out.println(name+" is Defending");
        System.out.println("Your Armour now is "+armor);
        return false;
    }
    
    boolean isDead(){
        if(healthPoin <=0) return true;
            return false;
    }
    
    void stats(){
        System.out.println("==Chara Stats==");
        System.out.println("Name: "+name);
        System.out.println("HP: "+healthPoin);
        System.out.println("Armor : "+armor);
        System.out.println("Speed: "+speed);
        System.out.println("Damage"+damage);
        System.out.println("");
    }
}

