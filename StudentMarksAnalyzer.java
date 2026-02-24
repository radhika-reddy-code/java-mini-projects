import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] marks = new double[5];
        double sum = 0;

   
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            sum += marks[i];
        }

        // Calculate average
        double average = sum / 5;

        // Determine grade
        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // Display result
        System.out.println("\n----- Result -----");
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}