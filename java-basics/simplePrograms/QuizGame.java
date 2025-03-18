
import java.util.Scanner;

/*
 *  Quiz Program 
 */

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // QUESTIONS []
        String[] questions = { "what is the main function of router?",
                "which part of the computer is considered brain?", "What year was facebook launched?",
                "what was the first programming language?" };

        // OPTIONS ARRAY[][]
        String[][] options = {
                { "1. storing files", "2. Encrypting data", "3. Directing Internet Traffic", "4. Managaing passwords" },
                { "1. CPU", "2. hardrive", "3. RAM", "4. GPU" }, { "1. 2000", "2. 2008", "3. 2004", "4. 2006" },
                { "1. COBOL", "2. Assembly", "3. Fortran", "4. C" }, };

        // DECLARE VARIABLE
        int[] answers = { 3, 1, 3, 3 };
        int score = 0;
        int guess;

        // WELCOME MESSAGE
        System.out.println("*************************");
        System.out.println("Welcome to java quiz game");
        System.out.println("*************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("**********");
                System.out.println("Correct Answer");
                System.out.println("**********");
                score++;
            } else {
                System.out.println("**********");
                System.out.println("WRONG Answer");
                System.out.println("**********");
            }
        }
        System.out.println("--------------------");
        System.out.printf("You guessed %d out of 4 Correctly \n", score);
        System.out.println("--------------------");

        scanner.close();
    }
}
