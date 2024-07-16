//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    import java.util.Scanner;

    public class StudentGradeCalc{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt for the number of subjects
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();
            double[] scores = new double[numSubjects];

            // Input scores for each subject
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter score for subject " + (i + 1) + ": ");
                scores[i] = scanner.nextDouble();
            }

            // Calculate total and average score
            double totalScore = 0;
            for (double score : scores) {
                totalScore += score;
            }
            double averageScore = totalScore / numSubjects;

            // Determine the grade
            char grade;
            if (averageScore >= 90) {
                grade = 'A';
            } else if (averageScore >= 80) {
                grade = 'B';
            } else if (averageScore >= 70) {
                grade = 'C';
            } else if (averageScore >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Display the results
            System.out.printf("Total Score: %.2f\n", totalScore);
            System.out.printf("Average Score: %.2f\n", averageScore);
            System.out.println("Grade: " + grade);

            // Close the scanner
            scanner.close();
        }
    }