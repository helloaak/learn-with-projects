package com.company;

import java.util.Scanner;

public class ProjectOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age > 1 && age < 18){
            System.out.println("You are not eligible to vote !");
        }
        else if(age > 18){
            System.out.println("You can vote !");
        }
        else if(age == 0){
            System.out.println("You are not even born !");
        }
    }

}
