import java.util.Scanner;

public class StudentExpenseCalculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for personal information
        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your middle name: ");
        String midName = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        input.nextLine(); // Consume the leftover newline character

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        // Prompt user for financial details
        System.out.print("Enter daily transport cost (GMD): ");
        double pass = input.nextDouble();

        System.out.print("Enter daily food cost (GMD): ");
        double lunch = input.nextDouble();

        System.out.print("Enter the number of semesters: ");
        int numberOfSemester = input.nextInt();

        // Constants
        int schoolDaysPerWeek = 4;
        int weeksPerSemester = 16;

        // Calculate weekly, monthly, and semester expenses
        double dailyTotal = pass + lunch;
        double weeklyTotal = dailyTotal * schoolDaysPerWeek;
        double monthlyTotal = weeklyTotal * 4;
        double semesterTotal = monthlyTotal * 4;
        double totalExpense = semesterTotal * numberOfSemester;

        // Display results
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + firstName + " " + midName + " " + lastName);
        System.out.println("Address: " + address);
        System.out.println("\nExpense Summary:");
        System.out.println("Weekly Expense: GMD " + weeklyTotal);
        System.out.println("Monthly Expense: GMD " + monthlyTotal);
        System.out.println("Semester Expense: GMD " + semesterTotal);
        System.out.println("Total Expense for " + numberOfSemester + " semester(s): GMD " + totalExpense);

        // Close scanner
        input.close();
    }
}
