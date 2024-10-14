package JavaBasicCodes;

import java.util.Scanner;

public class Fibonacci {
  //This program prints the Fibonacci sequence using recursive and non recursive method both
  // 0,1,1,2,3,5,8,13...
  public static void main(String[] args) {

    // Non-recursive method

    int n1 = 0;
    int n2 = 1;
    int n3;
    Scanner sc = new Scanner(System.in);
    System.out.println("Fibonaaci using non-recursive method : ");
    int n = sc.nextInt();
    System.out.println(n1);
    for (int i = 1; i < n; i++) {
      System.out.println(n2);
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
    }

    // Recursive method

    System.out.println("Fibonaaci using recursive method : ");
    int number = sc.nextInt();

    for (int i = 0; i < number; i++) {
      System.out.println(fSeries(i));
    }

  }

  static int fSeries(int n) {
    return switch (n) {
      case 0 -> 0;
      case 1 -> 1;
      default -> fSeries(n - 1) + fSeries(n - 2);
    };

  }
}
