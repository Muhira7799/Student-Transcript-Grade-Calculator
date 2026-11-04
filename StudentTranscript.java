
import java.util.Scanner;

public class StudentTranscript {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter mark for subject " + i + ": ");
            double mark = input.nextDouble();

            total = total + mark;

            if (mark >= 85) {
                System.out.println("Grade A");
            } else if (mark >= 75) {
                System.out.println("Grade B");
            } else if (mark >= 60) {
                System.out.println("Grade C");
            } else {
                System.out.println("Grade D");
            }
        }

        double average = total / 5;

        System.out.println("Total marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 85) {
            System.out.println("Final Grade: A");
        } else if (average >= 75) {
            System.out.println("Final Grade: B");
        } else if (average >= 60) {
            System.out.println("Final Grade: C");
        } else {
            System.out.println("Final Grade: D");
        }

        input.close();
    }
}
