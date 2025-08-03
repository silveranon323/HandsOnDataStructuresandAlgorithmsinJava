package Arrays;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // consume newline
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter grade for " + names[i] + ": ");
            grades[i] = sc.nextInt();
        }

        System.out.println("\nStudent Grades:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }
    }
}
