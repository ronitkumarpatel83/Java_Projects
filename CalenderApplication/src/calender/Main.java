package calender;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 2023; // You can set the initial year
        int month = 1;  // You can set the initial month (January)

        String[][] calendar = new String[31][];
        
        while (true) {
            System.out.println("Calendar Application");
            System.out.println("1. View Calendar");
            System.out.println("2. Add Event");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            
            switch (choice) {
                case 1:
                    viewCalendar(calendar, year, month);
                    break;
                case 2:
                    addEvent(calendar, scanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    
    // Function to view the calendar for the given month
    private static void viewCalendar(String[][] calendar, int year, int month) {
        int daysInMonth = 31; // Assume all months have 31 days for simplicity
        
        System.out.println("Calendar for " + year + "/" + month);
        System.out.println("Day\tEvents");
        
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.print(day + "\t");
            
            if (calendar[day - 1] != null) {
                for (String event : calendar[day - 1]) {
                    System.out.print(event + ", ");
                }
            }
            
            System.out.println();
        }
    }
    
    // Function to add an event to a specific day
    private static void addEvent(String[][] calendar, Scanner scanner) {
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        if (day < 1 || day > calendar.length) {
            System.out.println("Invalid day.");
            return;
        }
        
        System.out.print("Enter event: ");
        String event = scanner.nextLine();
        
        if (calendar[day - 1] == null) {
            calendar[day - 1] = new String[]{event};
        } else {
            // If there are existing events, add the new event to the array
            String[] events = calendar[day - 1];
            String[] newEvents = new String[events.length + 1];
            System.arraycopy(events, 0, newEvents, 0, events.length);
            newEvents[events.length] = event;
            calendar[day - 1] = newEvents;
        }
        
        System.out.println("Event added successfully.");
    }
}

