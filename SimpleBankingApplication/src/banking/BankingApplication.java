package banking;

import java.util.Scanner;

public class BankingApplication {
	
	
	public static double Balance = 0;
	
	
	private static void checkBalance() {
		System.out.println("Available balance Rs : "+ Balance);
	}
	
	
	private static void depositBalance(Scanner scanner) {
		System.out.println("Enter the deposit amount : ");
		
		double depositAmount = scanner.nextDouble();
		Balance += depositAmount;
		System.out.println("Amount of "+ depositAmount +"rupees deposited successfully");
	}
	
	
	private static void withdrawAmount(Scanner scanner) {
		System.out.println("Enter withdraw amount : ");
		int amount = scanner.nextInt();
		
		if (amount <= Balance) {
			Balance -= amount;
			System.out.println("Amount of "+ amount +"rupees withdraw successfully");
		}
		else {
			System.out.println("Insufficient balance Rs : "+Balance);
		}
		
	}
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to the Banking Application");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                	System.out.println("=============== Check balance ================\n");
                	checkBalance();
                	System.out.println("\n============================================\n");
                    break;
                case 2:
                	System.out.println("=============Deposit balance =================\n");
                	depositBalance(scanner);
                	System.out.println("\n============================================\n");
                    break;
                case 3:
                	System.out.println("=============Withdraw balance ================\n");
                	withdrawAmount(scanner);
                	System.out.println("\n============================================\n");
                    break;
                case 4:
                    exit = true;
                    System.out.println("============================================\n");
                    System.out.println("Thank you for using the Banking Application ");
                    System.out.println("\n============================================");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
        scanner.close();
    }
}


