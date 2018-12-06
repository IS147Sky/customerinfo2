package com.company;

public class CustomerInfo
{
    String Name = "Samantha Johnson";
    private int Age= 0;
    private char Nationality ;
    private boolean informationaccurate = true;

    public static String CustomerInfo(String Name)
    {
        return("The name of passenger " + Name);
    }
    public static String CustomerInfo(int age)
    {
        return("The age of passenger is " + age + " age");
    }
    public static String CustomerInfo(char Nationality)
    {
        return("The nationality of passenger is " +  Nationality);

    }
    public static Boolean CustomerInfo(boolean informationaccurate)
    {
        return informationaccurate;

    }
}
