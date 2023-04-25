package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the Fruit : ");
        String fruit = sc.nextLine();


        switch (fruit) {
            case "Mango":
                System.out.println("king of Fruit");
                break;
            case "apple":
                System.out.println("The big red Fruit");
                break;
            case "orange":
                System.out.println("Round Fruit");
                break;
            default:
                System.out.println("Give the valid Input");
                break;
        }
    }

}
