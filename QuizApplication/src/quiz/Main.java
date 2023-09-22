package quiz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Define quiz questions, options, and correct answers
        String[] questions = {
            "1. What is the capital of France?",
            "2. Which planet is known as the Red Planet?",
            "3. What is the largest mammal on Earth?"
        };

        String[][] options = {
            {"A. Paris", "B. Rome", "C. London", "D. Berlin"},
            {"A. Venus", "B. Mars", "C. Jupiter", "D. Saturn"},
            {"A. Elephant", "B. Blue Whale", "C. Giraffe", "D. Rhinoceros"}
        };

        int[] answers = {0, 1, 1}; // Index of the correct options

        // Display and process the quiz questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your choice (enter the letter): ");
            char userChoice = scanner.next().charAt(0);
            int userAnswer = -1;

            switch (userChoice) {
                case 'A':
                case 'a':
                    userAnswer = 0;
                    break;
                case 'B':
                case 'b':
                    userAnswer = 1;
                    break;
                case 'C':
                case 'c':
                    userAnswer = 2;
                    break;
                case 'D':
                case 'd':
                    userAnswer = 3;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose A, B, C, or D.");
                    i--; // Repeat the same question
            }

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + options[i][answers[i]].substring(3) + ".\n");
            }
        }

        // Display the final score
        System.out.println("Quiz finished! Your score: " + score + "/" + questions.length);
        scanner.close();
    }
}

