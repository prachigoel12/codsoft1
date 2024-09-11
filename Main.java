import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Subjects: ");
        int n = sc.nextInt();

        System.out.println("Enter the Total marks per subject: ");
        int total_marks = sc.nextInt();

        int[] marks = new int[n];
        int sum = 0;

        System.out.println("Enter the marks for each subject:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        System.out.println("Total marks obtained: " + sum);

        float marks_percentage = ((float) sum / total_marks) * 100;
        System.out.println("Percentage of marks: " + marks_percentage + "%");

        if (marks_percentage > 90 && marks_percentage <= 100) {
            System.out.println("Grade A");
        } else if (marks_percentage > 80 && marks_percentage <= 90) {
            System.out.println("Grade B");
        } else if (marks_percentage > 70 && marks_percentage <= 80) {
            System.out.println("Grade C");
        } else if (marks_percentage > 60 && marks_percentage <= 70) {
            System.out.println("Grade D");
        } else if (marks_percentage >= 50 && marks_percentage <= 60) {
            System.out.println("Grade E");
        } else if (marks_percentage < 50) {
            System.out.println("Grade F");
        } else {
            System.out.println("Invalid Marks");
        }

        sc.close();
    }
}
