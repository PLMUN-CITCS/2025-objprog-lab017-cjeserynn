import java.util.Scanner;

public class GradeCalculator {

    // Method to get the student's score
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1;

        // Validate input
        while (score < 0 || score > 100) {
            System.out.print("Enter your score: ");
            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Please enter a value between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // clear invalid input
            }
        }

        return score;
    }

    // Method to calculate the grade based on the score
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Main method
    public static void main(String[] args) {
        // Get student score
        double score = getStudentScore();

        // Calculate the grade
        String grade = calculateGrade(score);

        // Display the result
        System.out.println("Your Grade is: " + grade);
    }
}
