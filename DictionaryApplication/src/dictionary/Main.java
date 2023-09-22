package dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, String> dictionary = new HashMap<>();

    public static void main(String[] args) {
        initializeDictionary();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word (or 'exit' to quit): ");
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            String definition = dictionary.get(word);
            if (definition != null) {
                System.out.println("Definition: " + definition);
            } else {
                System.out.println("Word not found in the dictionary.");
            }
        }

        scanner.close();
    }

    private static void initializeDictionary() {
        // Add some sample word definitions
        dictionary.put("apple", "A fruit that grows on trees.");
        dictionary.put("book", "A written or printed work consisting of pages.");
        dictionary.put("computer", "An electronic device that can perform various tasks.");
    }
}

