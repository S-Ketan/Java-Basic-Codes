package JavaBasicCodes;


import java.util.*;

//This code is a basic calculator made for the prupose of learning Java Methods

public class Calculator {
    static class Mathutils{
       public static int add(int a, int b){
           return a+b;
       }
       public static int sub(int a, int b){
           return a-b;
       }
       public static int multiply(int a, int b){
           return a*b;
       }
       public static int divide(int a, int b){
           return a/b;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int a = sc.nextInt();
       
        System.out.println("Enter the Second Number : ");
        int b = sc.nextInt();

        sc.nextLine(); 
        
        System.out.println("Which operation would you like to perform? (*,/,+,-)");
        String operation =sc.nextLine();
        int result = 0;

        switch (operation) {
            case "+" -> result=Mathutils.add(a, b);
            case "-" -> result=Mathutils.sub(a, b);
            case "*" -> result=Mathutils.multiply(a, b);
            case "/" -> {
                if (b != 0) {
                    result = Mathutils.divide(a, b);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            }
            default -> { System.out.println("Enter a Valid opeartion please!");
            }
        }
        System.out.println("The result is: " + result);
}}
