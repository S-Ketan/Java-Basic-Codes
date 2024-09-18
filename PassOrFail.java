package JavaBasicCodes;
import java.util.*;

//This Programs lets you kno whether student passed of failed
//Passing Condition 1: he/she needs to bring more than 40% overall 
//Passing Condition 2: should have more than 33% in each subject

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println(	"Enter Marks in Maths : ");
            double a = sc.nextDouble();
            System.out.println(	"Enter Marks in English : ");
            double b = sc.nextDouble();
            System.out.println(	"Enter Marks in Java : ");
            double c = sc.nextDouble();
            System.out.println("Maximum marks that can be achieved in each subject : ");
            double d = sc.nextDouble();

            double mathsPercentage = a*100/d;
            System.out.println("Maths Percentage : " + mathsPercentage);
            double englishPercentage = b*100/d;
            System.out.println("English Percentage : " + englishPercentage);
            double javaPercentage = c*100/d;
            System.out.println("Java Percentage : " + javaPercentage);

            double percentage= ((a + b + c) / (d * 3)) * 100;
                System.out.println("The Overall Percentage is "+ percentage);

            if(percentage > 40 && mathsPercentage > 33 && englishPercentage>33 && javaPercentage>33){
                System.out.println("Congrats! , you passed all the exams!");
            }
            else{
                System.out.println("Unfortunately you failed :(");
            } 
    }
}
