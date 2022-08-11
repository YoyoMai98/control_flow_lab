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
    }
}
