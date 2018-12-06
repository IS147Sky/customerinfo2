
package com.company;
import java.util.Scanner;
public class Main
{


    public static void print()
    {
        Scanner natInput = new Scanner(System.in);
        System.out.println("Input the nationality");
        String nationality = natInput.nextLine();
        String country = nationality;
        System.out.println("Passenger Information is as follows");
    }

    public static void main(String[] args)

    {


        CustomerInfo bClass1 = new CustomerInfo();
        CustomerInfo bClass2 = new CustomerInfo();
        Scanner natInput = new Scanner(System.in);
        System.out.println("Input the nationality");
        String nationality = natInput.nextLine();
        String country = nationality;

        System.out.println(bClass1.CustomerInfo("Samantha Johnson"));
        System.out.println(bClass1.CustomerInfo(51));
        System.out.println("Their nationality is "+ country);
        System.out.println("The book is US Published: " + bClass2.CustomerInfo(true));



    }

}