package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);double cost=0;
        System.out.println("Enter the name of the Item:");
        String name = sc.nextLine();
        System.out.println("Enter the price of the item:");
        double price = sc.nextDouble();
        System.out.println("Enter the number of items for sale:");
        int number = sc.nextInt(); sc.nextLine();
        int[] day = new int[number];
        int rem = number;
        for(int i=0; i<number && rem>0 && i<4; i++) {
            System.out.println("Enter the number of items sold on Day"+(i+1)+":");
            day[i] = sc.nextInt();
            rem = rem-day[i];
        }
        int itemRem = number;
        System.out.println(name+"\nDay No.of items_available Price");
        int i=0;
        while (itemRem>0 && i<4){
            cost = cost + price*day[i];
            System.out.println("Day"+(i+1)+" "+itemRem+" "+Math.round(price));
            price = price*93/100;
            itemRem = itemRem - day[i];
            i++;
        }
        System.out.println("Total amount of Sales = Rs."+Math.round(cost));
    }
}

