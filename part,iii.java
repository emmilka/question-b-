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
public class partiii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║    UGANDA O-LEVEL GRADING AUTOMATION SYSTEM  ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.print("\nEnter student's score (0-100): ");
        int studentScore = input.nextInt();
        System.out.println();
        if (studentScore < 0 || studentScore > 100) {
            System.out.println("✗ ERROR: Invalid input!");
            System.out.println("  Score must be between 0 and 100.");
            input.close();
            return;
        }
        String grade;
        String remark;
        if (studentScore >= 80) {
            grade = "1";
            remark = "DISTINCTION 1";
        } else if (studentScore >= 75) {
            grade = "2";
            remark = "DISTINCTION 2";
        } else if (studentScore >= 66) {
            grade = "3";
            remark = "CREDIT 3";
        } else if (studentScore >= 60) {
            grade = "4";
            remark = "CREDIT 4";
        } else if (studentScore >= 50) {
            grade = "5";
            remark = "CREDIT 5";
        } else if (studentScore >= 45) {
            grade = "6";
            remark = "CREDIT 6";
        } else if (studentScore >= 35) {
            grade = "7";
            remark = "PASS 7";
        } else if (studentScore >= 30) {
            grade = "8";
            remark = "PASS 8";
        } else {
            grade = "9";
            remark = "FAIL";
        }
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║               STUDENT REPORT                 ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.printf("║ %-20s: %3d / 100          ║\n", "SCORE", studentScore);
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.printf("║ %-20s: %-3s                   ║\n", "GRADE", grade);
        System.out.printf("║ %-20s: %-20s ║\n", "REMARK", remark);
        String performance;
        if (grade.equals("1") || grade.equals("2")) {
            performance = "EXCELLENT PERFORMANCE";
        } else if (grade.equals("3") || grade.equals("4") || grade.equals("5") || grade.equals("6")) {
            performance = "GOOD PERFORMANCE";
        } else if (grade.equals("7") || grade.equals("8")) {
            performance = "PASS";
        } else {
            performance = "NEEDS IMPROVEMENT";
        }
        System.out.printf("║ %-20s: %-20s ║\n", "PERFORMANCE", performance);
        System.out.println("╚══════════════════════════════════════════════╝");
        
        input.close();
    }
}

