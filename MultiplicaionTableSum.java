package JavaBasicCodes;
import java.util.*;

//This program sums up the result of a multiplication table

public class MultiplicaionTableSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();
        int sum=0;
        for(int i =0;i<=10;i++){
            System.out.println(n+" x "+i +" = " +n*i);
            sum+= n*i;
        }
        System.out.println("The sum of the table is : " + sum);
    }
}
