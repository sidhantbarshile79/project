package com.yash.calculator;
import java.util.*;

public class Calculator
{
    public static void main(String[] args) {
        int operator;
        int n1, n2;
        int result=0;
        System.out.println("1. Add \n 2. Sub \n 3. Mul \n 4. Div");
        System.out.println("Choose operator : ");
        Scanner sc=new Scanner(System.in);
        operator= sc.nextInt();
        System.out.println("Enter first number : ");
        n1=sc.nextInt();
        System.out.println("Enter Second number : ");
        n2=sc.nextInt();

        switch (operator)
        {
            case 1:
                result=n1+n2;
                break;
            case 2:
                result=n1-n2;
                break;
            case 3:
                result=n1*n2;
                break;
            case 4:
                result=n1/n2;
                break;

            default:
                System.out.println("Incorrect Entry...");
        }
        System.out.println("Result is : "+ result);
    }
}
