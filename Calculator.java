package com.elevatelab.calc;
import java.util.Scanner;

public class Calculator {
    double add(double a,double b){
        return a+b;
    }
    double substraction(double a,double b){
        return a-b;
    }
    double multiplication(double a, double b){
        return a*b;
    }
    double division(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("*****Java Console Calculator*****");
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            if(choice>=1 && choice<=4) {
                System.out.println("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.println("Enter second number: ");
                double num2 = sc.nextDouble();

                switch (choice) {
                    case 1 -> System.out.println("Result of addition is: " + c.add(num1, num2));
                    case 2 -> System.out.println("Result of substraction is: " + c.substraction(num1, num2));
                    case 3 -> System.out.println("Result of multiplication is: " + c.multiplication(num1, num2));
                    case 4 -> System.out.println("Result of division is: " + c.division(num1, num2));
                }
            }else if (choice==5){
                    System.out.println("Exiting... Thankyou");
                }
            else {
                System.out.println("Invalid choice");
            }
        } while(choice!=5);

    }

}
