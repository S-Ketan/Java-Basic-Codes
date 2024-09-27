package JavaBasicCodes;
import java.util.*;

//This code takes 2 Matrices of Size 2x3 and adds or subtracts them according to user's choice

public class MatrixAddOrSubtract {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];
        int[][] arr3 = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Matrix 1 :Enter a number for the row [%d] and column [%d] \n", i, j);
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Matrix 2 :Enter a number for the row [%d] and column [%d] \n", i, j);
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1 is : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2 is : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("Enter '+' for addition and '-' for subtraction:");
        char operation = sc.next().charAt(0);

        if (operation == '+') {
            System.out.println("The sum of the given 2 matrices is : ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        } else if (operation == '-') {
            System.out.println("The result of the given 2 matrices is : ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    arr3[i][j] = arr1[i][j] - arr2[i][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();

        }
        sc.close();
    }
}
