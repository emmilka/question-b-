/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mywork.gradingystem;

import java.util.Scanner;

/**
 *
 * @author ARNOLD
 */
public class Gradingystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's score out of 100: ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Error: Score must be between 0 and 100.");
            return;
        }
        String grade;
        String remark;
        if (score >= 80 && score <= 100) {
            grade = "1";
            remark = "D1";
        } else if (score >= 75 && score <= 79) {
            grade = "2";
            remark = "D2";
        } else if (score >= 66 && score <= 74) {
            grade = "3";
            remark = "C3";
        } else if (score >= 60 && score <= 65) {
            grade = "4";
            remark = "C4";
        } else if (score >= 50 && score <= 59) {
            grade = "5";
            remark = "C5";
        } else if (score >= 45 && score <= 49) {
            grade = "6";
            remark = "C6";
        } else if (score >= 35 && score <= 44) {
            grade = "7";
            remark = "P7";
        } else if (score >= 30 && score <= 34) {
            grade = "8";
            remark = "P8";
        } else {
            grade = "9";
            remark = "F";
        }
        System.out.println("\n========== GRADING RESULTS ==========");
        System.out.println("Score: " + score + "/100");
        System.out.println("Grade: " + grade);
        System.out.println("Remark: " + remark);
        System.out.println("=====================================");
        
        scanner.close();
    }
}
    

