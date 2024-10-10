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
public class ActivityArray {
    public static void main(String[] args) {
        
        Scanner ayb = new Scanner(System.in);
        
        int[] grade = {75, 86, 84, 90, 87};
        
        System.out.println("Initial Grade: ");
        System.out.println("Subject 1: " + grade[0]);
        System.out.println("Subject 2: " + grade[1]);
        System.out.println("Subject 3: " + grade[2]);
        System.out.println("Subject 4: " + grade[3]);
        System.out.println("Subject 5: " + grade[4]);
        
        System.out.print("Please enter student index: ");
        int si = ayb.nextInt();
        
        System.out.println("Enter student new grade: ");
        int sg = ayb.nextInt();
        
        grade[si] = sg;
        
        System.out.println("Updated Grade: ");
        System.out.println("Subject 1: " + grade[0]);
        System.out.println("Subject 2: " + grade[1]);
        System.out.println("Subject 3: " + grade[2]);
        System.out.println("Subject 4: " + grade[3]);
        System.out.println("Subject 5: " + grade[4]);
        
        System.out.println("Total No. of Subject: " + grade.length);
        
        int totalg = 0;
        
        for (int i = 0; i < grade.length; i++){
            totalg += grade[1];
        }
        
        double ave = (double)totalg / grade.length;
        
        System.out.println("The average grade is: " + ave);
        
        
        
    }
    
}
