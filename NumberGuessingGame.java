package JavaBasicCodes;
    import java.util.*;

    //This is a game where the user is required to guess a number and the Computer will let you know 
    //whether the number you've entered is higher or lower than the generated number.
    //The no. of attempts it takes for you to guess the number is your score.
    public class NumberGuessingGame {  
    
        static class game{
            int noOfGuesses=0;
            int randomNumber;
            public game(){
                 randomNumber= (int)(Math.random()*100)+1;
            }
            
            public int takeUserInput(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your Guess : ");
                int n=sc.nextInt();
                return n;
            }
          
            public boolean isCorrectNumber(int userGuess){
                noOfGuesses++;
                if (userGuess>randomNumber) {
                    System.out.println("The number is lower than - "+userGuess);
                    return false;
                }
                else if (userGuess<randomNumber) {
                    System.out.println("The number is greater than - "+userGuess);
                    return false;
                }
                else{
                    System.out.println("Congrats! You guesses the right number!!!");
                    System.out.println("It is - "+userGuess);
                    System.out.println("Your score is : "+noOfGuesses);
                    return true;
                }
            }
            
        }

        public static void main(String[] args) {
            game G= new game();
            boolean correctGuess= false;

            while (!correctGuess) { 
                int userGuess=G.takeUserInput();
                correctGuess=G.isCorrectNumber(userGuess);
            }
        }
    }
