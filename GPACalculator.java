/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionlab;

/**
 *
 * @author Ykimmel
 */
//Part B 
import java.util.Scanner;

public class GPACalculator {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scnr = new Scanner(System.in);
        char letterGrade;    // User defined letter grade 
        int creditHours;     // User defined number of credit hours
        char quitCmd;        // Indicates quit/continue

        quitCmd = 'a';

        double qualityPoints = 0;
        int totalCreditHrs = 0;

        while (quitCmd != 'q') {

            // Get user data
            System.out.print("Enter letter grade: ");
            letterGrade = scnr.nextLine().charAt(0);
            if(getLetterGradeValue(letterGrade)<=-1){
                System.out.print("Invalid letter grade. Try Again");
            }
            else{
            System.out.print("Enter number of credit hours: ");
            creditHours = scnr.nextInt();
            if(creditHours<0){
            totalCreditHrs += creditHours;
            System.out.println("Invalid number of credit hours." + " Try again!");
            } else{
                totalCreditHrs += creditHours;
            }
            
            qualityPoints += getLetterGradeValue(letterGrade) * creditHours;
            System.out.print("\nEnter any key to continue entering grade or 'q' to quit: ");
            quitCmd = scnr.next().charAt(0);
            
            scnr.nextLine();
        }
        }

        // cacluate GPA - Divide the total quality points by the total credit hours.
        double gpa = computeIntGPA(qualityPoints, totalCreditHrs);

        //Print user GPA info
        System.out.println("GPA: " + gpa);

    }

    private static int getLetterGradeValue(char letterGrade) {
        if (letterGrade == 'a' || letterGrade == 'A') {
            return 4;
        }
        if (letterGrade == 'b' || letterGrade == 'B') {
            return 3;
        }
        if (letterGrade == 'c' || letterGrade == 'C') {
            return 2;
        }
        if (letterGrade == 'd' || letterGrade == 'D') {
            return 1;
        } 
        if (letterGrade == 'f' || letterGrade == 'F') {
            return 0;
        } else {
            return -1;
        }
    }

    private static double computeIntGPA(double qualityPoints, int ceditHours) {
        return qualityPoints / ceditHours;
    }

    @SuppressWarnings("unused")
    private static double computeGPA(int qualityPoints, int ceditHours) {
        return ((double) qualityPoints) / ceditHours;
    }
}
