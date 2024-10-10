/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalterm;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ActivityForLoop {
    
    public static void main(String[] args) {
        
        Scanner ayb = new Scanner(System.in);
        
        double[] grades = new double [5];
        String[] subjects = {"\nMath","Science","History","Programming"};
        
        System.out.print("Please enter the grades of the following subjects: ");
        
        for(int i = 0; i < subjects.length; i++){
            System.out.print(subjects[i] + ": ");
            grades[i] = ayb.nextDouble();
            double grade;
            do {
                System.out.print(subjects[i] + ": ");
                while (!ayb.hasNextDouble()) {
                    System.out.println("Invalid Input. Please enter a numeric value.");
                    ayb.next();
                }
                grade = ayb.nextDouble();
                if(grade < 65 || grade > 100) {
                    System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                }
            }while(grade < 65 || grade > 100);
            grades[i] = grade;
        }
        
        System.out.println("\nGrades of the subject: ");
        
        for(int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + grades[i]); 
            
        }
        
        System.out.println("Total No. of Subject: " + subjects.length);
        
        int totalg = 0;
        
        for (int i = 0; i < subjects.length; i++){
            totalg += grades[i];
        }
        
        double ave = (double)totalg / subjects.length;
        
        System.out.println("The average grade is: " + ave);
        for(int i = 0; i < grades.length; i++) {
            char gradeClassification;
            if (grades[i] >= 90) {
                gradeClassification = 'A';
            }else if(grades[i] >= 80) {
                gradeClassification = 'B';
            }else if(grades[i] >= 70) {
                gradeClassification = 'C';
            }else if(grades[i] >= 60) {
                gradeClassification = 'D';
            }else {
                gradeClassification = 'F';
            }
            System.out.println(subjects[i] + ": " + grades[i] + "-> " + gradeClassification);
        }
        ayb.close();
    }
}
