import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
//        create the secret number
        System.out.println("What is the secret number?");
        int secretNumber = 23;

        //        collect user input
        Scanner reader = new Scanner(System.in);
        String guessedInput = reader.nextLine();
        int guessedNumber = Integer.parseInt(guessedInput);

//        if the input is smaller, print "guess higher"
//        if the input is larger, print "guess lower"
//        otherwise, print "correct!"
        if(guessedNumber < secretNumber){
            System.out.println("guess higher");
        }else if(guessedNumber > secretNumber){
            System.out.println("guess lower");
        }else{
            System.out.println("correct!");
        }
    }
}
