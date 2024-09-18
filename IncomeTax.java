package JavaBasicCodes;
import java.util.*;

//This program calculates income tax paid 
//Condition 1 : if income is less than 2.5LPA, no tax
//Condition 2 : if income is between 2.5 and 5LPA, 5% tax
//Condition 2 : if income is between 5 and 10LPA, 20% tax
//Condition 1 : if income is more than 10LPA, 30% tax
public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Income per Annum in Lakhs : ");
            double income = sc.nextDouble();
            double tax;
                        if(income<2.5){
                            System.out.println("No need to pay anything");
                        }
                        else if(income >= 2.5 && income < 5.0){
                            tax = (5.0/100.0)*income *100000;
                            System.out.println("You need to pay : "+tax +" Rupees");
                        }
                        else if(income >= 5.0 && income < 10.0){
                            tax = (20.0/100.0)*income *100000;
                            System.out.println("You need to pay : "+tax +" Rupees");
                        }
                        else{
                            tax =(30.0/100.0)*income*100000;
                            System.out.println("You need to pay : "+tax +" Rupees");
                        }
    }
}
