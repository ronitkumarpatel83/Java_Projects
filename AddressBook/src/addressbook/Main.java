package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        while (true) {
            System.out.println("Address Book");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search Contact");
            System.out.println("5. View All Contacts");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addContact(contacts, scanner);
                    break;
                case 2:
                    editContact(contacts, scanner);
                    break;
                case 3:
                    deleteContact(contacts, scanner);
                    break;
                case 4:
                    searchContact(contacts, scanner);
                    break;
                case 5:
                    viewAllContacts(contacts);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addContact(ArrayList<Contact> contacts, Scanner scanner) {
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    private static void editContact(ArrayList<Contact> contacts, Scanner scanner) {
        System.out.print("Enter the name to edit: ");
        String nameToEdit = scanner.nextLine();

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(nameToEdit)) {
                System.out.print("Enter the new phone number: ");
                String newPhoneNumber = scanner.nextLine();
                contact.setPhoneNumber(newPhoneNumber);
                System.out.println("Contact edited successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    private static void deleteContact(ArrayList<Contact> contacts, Scanner scanner) {
        System.out.print("Enter the name to delete: ");
        String nameToDelete = scanner.nextLine();

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(nameToDelete)) {
                contacts.remove(contact);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    private static void searchContact(ArrayList<Contact> contacts, Scanner scanner) {
        System.out.print("Enter the name to search: ");
        String nameToSearch = scanner.nextLine();

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(nameToSearch)) {
                System.out.println(contact);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    private static void viewAllContacts(ArrayList<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("All Contacts:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}
