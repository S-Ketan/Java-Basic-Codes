package JavaBasicCodes;

import java.util.*;
public class RPS {
    public static void main(String[] args) {
        System.out.println("Instructions");
        System.out.println("1-->Rock");
        System.out.println("2-->Paper");
        System.out.println("3-->Scissors");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your move : ");
        int humanMove=sc.nextInt();
        switch(humanMove){
            case 1 -> System.out.println("You chose Rock!");
            case 2 -> System.out.println("You chose Paper!");
            case 3 -> System.out.println("You chose Scissors!");
            default-> System.out.println("Make a valid move please!");
        }
        int computerMove = (int)(Math.random()*3)+1;
        System.out.println(computerMove);
        switch(computerMove){ 
            case 1 -> System.out.println("Computer chose Rock!");
            case 2 -> System.out.println("Computer chose Paper!");
            case 3 -> System.out.println("Computer chose Scissors!");
            default-> System.out.println("Make a valid move please!");
        }
        if (humanMove == computerMove){
            System.out.println("Match tie.");
        }
        else if((humanMove == 1 && computerMove == 2)||(humanMove == 2 && computerMove == 3)||(humanMove == 3 && computerMove == 1)){
            System.out.println("Computer won!");
        }
        else if((humanMove == 1 && computerMove == 3)||(humanMove == 2 && computerMove == 1)||(humanMove == 3 && computerMove == 2)) {
            System.out.println("Congratulations! You won the game!");
        }
        else if(humanMove >= 4){
            System.out.println("Match cannot be played");
            }

    }
}

