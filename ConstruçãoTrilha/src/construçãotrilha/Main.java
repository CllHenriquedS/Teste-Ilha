package construçãotrilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Exit");

            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer
                    System.out.print("Enter student course: ");
                    String course = scanner.nextLine();

                    studentManager.addStudent(name, id, age, course);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    studentManager.listStudents();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }

        scanner.close();
    }
}

