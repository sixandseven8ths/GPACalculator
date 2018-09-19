/* Jeffrey Herold
 * February 1, 20112
 * Program: GPA calculator
 * Purpose: to calculate GPA for 4 grades
 */
package gpacalculator;

import java.util.Scanner;

public class GPACalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        String strChoice = "y";
        
        while (strChoice.equalsIgnoreCase("y")){
            
            int total = 0;
            
            // get number from user
            System.out.print("Enter first letter grade: ");
            String myGrade1 = kbd.next();
            total += gradePoints(myGrade1);
            
            System.out.print("Enter second letter grade: ");
            String myGrade2 = kbd.next();
            total += gradePoints(myGrade2);
            
            System.out.print("Enter third letter grade: ");
            String myGrade3 = kbd.next();
            total += gradePoints(myGrade3);
            
            System.out.print("Enter fourth letter grade: ");
            String myGrade4 = kbd.next();
            total += gradePoints(myGrade4);
            
            System.out.println("Your GPA is " + (total / 4.0));
            
            // ask user to continue
            System.out.print("\nContinue? (y/n) ");
            strChoice = kbd.next();
    }
   }
    /* This method returns the number of points earned for the letter 
     * grade submitted
     */
    public static int gradePoints(String grade){
        // initialize  the points
        int points = 0;
        // determine letter grade and apply points
        switch (grade){
            case "A":
                points = 4;
                break;
            case "B":
                points = 3;
                break;
            case "C":
                points = 2;
                break;
            case "D":
                points = 1;
                break;
            default:
                points = 0;
        }
            
        // returns point values
        return points;
}
}