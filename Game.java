package com.mycompany.game;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player hero = new Player();
        Player enemy = new Player();

        hero.name = "Ahmad Basikal";
        hero.speed = 60;
        hero.healthPoin = 100;
        hero.armor = 15;
        hero.damage = 20;

        enemy.name = "Bayu Kokonut";
        enemy.speed = 60;
        enemy.healthPoin = 100;
        enemy.armor = 10;
        enemy.damage = 25;

        hero.stats();
        enemy.stats();

        for (int i = 0; i < 16; i++) {
            System.out.println("Attack, yes or no ?");
            String start = input.next();
            if (start.equalsIgnoreCase("yes")) {
                System.out.println(hero.name + " is Attacking");
                enemy.attack();
                System.out.println("");
                if (enemy.isDead()) {
                    System.out.println("You Win!!");
                    break;  // Exit the loop if the enemy is dead
                }
            } else {
                System.out.println(enemy.name + " is Attacking");
                hero.attack();
                System.out.println(hero.name + " HP now is " + hero.healthPoin);
                System.out.println("");
                if (hero.isDead()) {
                    System.out.println("You Lose!!");
                    break;  // Exit the loop if the hero is dead
                }
            }

            System.out.println(enemy.name + " is Attacking");
            System.out.println("Defend, yes or no?");
            String kedua = input.next();
            if (kedua.equalsIgnoreCase("yes")) {
                hero.defend();
                System.out.println("");
            } else {
                hero.attack();
                System.out.println(hero.name + " HP now is " + hero.healthPoin);
                i -= 1;
                if (hero.isDead()) {
                    System.out.println("You Lose!!");
                    break;  // Exit the loop if the hero is dead
                }
            }
        }
    }
}
