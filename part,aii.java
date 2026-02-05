/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mywork.gradingystem;

import java.util.Scanner;

/**
 *
 * @author ARNOLD
 */
public class partbii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("     UGANDA O-LEVEL GRADING SYSTEM");
        System.out.println("         with Grade Distribution Summary");
        System.out.println("================================================\n");
        int grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0;
        int grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
        int studentNumber = 1;
        final int TOTAL_STUDENTS = 5;
        while (studentNumber <= TOTAL_STUDENTS) {
            System.out.println("\n--- Student " + studentNumber + " of " + TOTAL_STUDENTS + " ---");
            System.out.print("Enter score (0-100): ");
            int score = input.nextInt();
            // Input validation
            if (score < 0 || score > 100) {
                System.out.println("Invalid score! Please try again.");
                continue;
            }
            // Determine grade and update counters
            String grade;
            
            if (score >= 80) {
                grade = "1";
                grade1++;
            } else if (score >= 75) {
                grade = "2";
                grade2++;
            } else if (score >= 66) {
                grade = "3";
                grade3++;
            } else if (score >= 60) {
                grade = "4";
                grade4++;
            } else if (score >= 50) {
                grade = "5";
                grade5++;
            } else if (score >= 45) {
                grade = "6";
                grade6++;
            } else if (score >= 35) {
                grade = "7";
                grade7++;
            } else if (score >= 30) {
                grade = "8";
                grade8++;
            } else {
                grade = "9";
                grade9++;
            }
            System.out.println("Student " + studentNumber + " - Score: " + score + ", Grade: " + grade);
            studentNumber++;
        }
        System.out.println("\n\n" + "=".repeat(50));
        System.out.println("           GRADE DISTRIBUTION SUMMARY");
        System.out.println("=".repeat(50));
        System.out.println("\nNumber of students for each grade:");
        System.out.println("-----------------------------------");
        System.out.printf("Grade 1 (D1): %d student(s)\n", grade1);
        System.out.printf("Grade 2 (D2): %d student(s)\n", grade2);
        System.out.printf("Grade 3 (C3): %d student(s)\n", grade3);
        System.out.printf("Grade 4 (C4): %d student(s)\n", grade4);
        System.out.printf("Grade 5 (C5): %d student(s)\n", grade5);
        System.out.printf("Grade 6 (C6): %d student(s)\n", grade6);
        System.out.printf("Grade 7 (P7): %d student(s)\n", grade7);
        System.out.printf("Grade 8 (P8): %d student(s)\n", grade8);
        System.out.printf("Grade 9 (F) : %d student(s)\n", grade9);
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Summary Table:");
        System.out.println("=".repeat(50));
        System.out.printf("%-10s %-15s %-15s\n", "Grade", "Count", "Percentage");
        System.out.println("-".repeat(40));
        
        int totalStudents = grade1 + grade2 + grade3 + grade4 + grade5 + 
                           grade6 + grade7 + grade8 + grade9;
        
        String[] gradeLabels = {"1 (D1)", "2 (D2)", "3 (C3)", "4 (C4)", "5 (C5)", 
                               "6 (C6)", "7 (P7)", "8 (P8)", "9 (F)"};
        int[] gradeCounts = {grade1, grade2, grade3, grade4, grade5, grade6, grade7, grade8, grade9};
        
        for (int i = 0; i < 9; i++) {
            double percentage = (gradeCounts[i] * 100.0) / totalStudents;
            System.out.printf("%-10s %-15d %-15.1f%%\n", 
                gradeLabels[i], gradeCounts[i], percentage);
        }
        
        System.out.println("-".repeat(40));
        System.out.printf("%-10s %-15d %-15s\n", "Total", totalStudents, "100%");
        
        input.close();
    }
}

