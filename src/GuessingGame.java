import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int) (Math.random() * 100) + 1;
        System.out.println("I'm thinking of a number from 1 to 100.");
        boolean notGuessed = true;
        String userChoice;
        int userNum;
        while (notGuessed) {
            System.out.print("What's your guess: ");
            userChoice = scan.nextLine();
            userNum = Integer.parseInt(userChoice);
            if (userNum == num) {
                System.out.println("You got it! The number is " + num);
                notGuessed = false;
            }
            else if (userNum < num) {
                System.out.println("Too low. Guess higher!");
            }
            else if (userNum > num) {
                System.out.println("Too high. Guess lower.");
            }
        }
    }
}
