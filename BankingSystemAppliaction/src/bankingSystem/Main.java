package bankingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        while (true) {
            System.out.println("Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    createAccount(accounts, scanner);
                    break;
                case 2:
                    performDeposit(accounts, scanner);
                    break;
                case 3:
                    performWithdrawal(accounts, scanner);
                    break;
                case 4:
                    checkBalance(accounts, scanner);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createAccount(ArrayList<BankAccount> accounts, Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();
        BankAccount account = new BankAccount(accountNumber, accountHolder);
        accounts.add(account);
        System.out.println("Account created successfully.");
    }

    private static void performDeposit(ArrayList<BankAccount> accounts, Scanner scanner) {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found. Create an account first.");
            return;
        }

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
                System.out.print("Enter deposit amount: $");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    private static void performWithdrawal(ArrayList<BankAccount> accounts, Scanner scanner) {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found. Create an account first.");
            return;
        }

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
                System.out.print("Enter withdrawal amount: $");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    private static void checkBalance(ArrayList<BankAccount> accounts, Scanner scanner) {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found. Create an account first.");
            return;
        }

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
                account.displayAccountInfo();
                return;
            }
        }
        System.out.println("Account not found.");
    }
}