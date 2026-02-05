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
public class partb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BATCH GRADING SYSTEM - 5 STUDENTS");
        System.out.println("==================================\n");
        int studentCount = 1;
        String[] grades = new String[5];
        String[] remarks = new String[5];
        int[] scores = new int[5];
        while (studentCount <= 5) {
            System.out.println("STUDENT " + studentCount);
            System.out.print("Enter score (0-100): ");
            int score = scanner.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Invalid score! Please enter between 0-100.");
                continue;
            }
            scores[studentCount-1] = score;
            String grade, remark;
            if (score >= 80) {
                grade = "1"; remark = "D1";
            } else if (score >= 75) {
                grade = "2"; remark = "D2";
            } else if (score >= 66) {
                grade = "3"; remark = "C3";
            } else if (score >= 60) {
                grade = "4"; remark = "C4";
            } else if (score >= 50) {
                grade = "5"; remark = "C5";
            } else if (score >= 45) {
                grade = "6"; remark = "C6";
            } else if (score >= 35) {
                grade = "7"; remark = "P7";
            } else if (score >= 30) {
                grade = "8"; remark = "P8";
            } else {
                grade = "9"; remark = "F";
            }
            grades[studentCount-1] = grade;
            remarks[studentCount-1] = remark;
            System.out.println("Result: Score=" + score + ", Grade=" + grade + ", Remark=" + remark);
            System.out.println("--------------------------------\n");
            
            studentCount++;
        }
        System.out.println("\n\nFINAL GRADING SUMMARY");
        System.out.println("=====================");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Student", "Score", "Grade", "Remark");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-10d %-10d %-10s %-10s\n", 
                (i+1), scores[i], grades[i], remarks[i]);
        }
        
        scanner.close();
    }
}

