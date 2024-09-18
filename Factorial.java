package JavaBasicCodes;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();
        for(int i =n-1;i>0;i--){
            System.out.println(n+" x "+i);
            n*=i;
        }
        System.out.println("The factorial of the given number is : " + n);
    }
}
