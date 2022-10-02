import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class GuessingGame {
    public static void FortuneRoll() {
        String horribleFortuneMessage = "Horrible fortune!";
        String okayFortuneMessage = "Okay fortune!";
        String greatFortuneMessage = "Great fortune!";
        String invalidFortuneMessage = "Invalid fortune!";
        String fortuneOpeningMessage = "Choose your fortune! ";

        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.print(fortuneOpeningMessage);

        try {
            int userInput = s.nextInt();
            if (userInput == 1 || userInput == 2 || userInput == 3) {
                System.out.println(horribleFortuneMessage);
            } else if (userInput == 4 || userInput == 5 || userInput == 6) {
                System.out.println(okayFortuneMessage);
            } else if (userInput == 7 || userInput == 8 || userInput == 9 || userInput == 10) {
                System.out.println(greatFortuneMessage);
            } else {
                System.out.println(invalidFortuneMessage);
            }
        } catch (InputMismatchException e) {
            System.out.println(invalidFortuneMessage);
        }

        System.out.print("Do you wish to re-roll your fortune? (Yes / No): ");

        String continueMessage = s2.nextLine();

        if (Objects.equals(continueMessage, "Yes") || Objects.equals(continueMessage, "yes")) {
            FortuneRoll();
        } else if (Objects.equals(continueMessage, "No") || Objects.equals(continueMessage, "no")) {
            System.out.println("Ok, cya later");
        } else {
            System.out.println("I'll take that as a no");
        }
    }

    public static void main(String[] args) {
        FortuneRoll();
    }
}