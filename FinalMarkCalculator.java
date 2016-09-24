//I am importing the scanner class
import java.util.Scanner;

/**
 * FinalMarkCalculator: This program will calculate the final mark for each student
 *
 * @author William Martins
 * @version 3.0
 *
 * Assignment: #2
 * Course: ADEV-1003
 * Section: 6
 * Date Created: 9.15.2016
 * Last Updated: 9.22.2016
 * 
 */
class FinalMarkCalculator{
    public static void main(String [] args)
    {
        
        //I am declaring all variables below.
        String studentName;//String to store the student's name
        double assignmentMark;//Variable to store the assignment's mark
        double midTermExamMark;//Variable to store the mid-term exam's mark
        double finalExamMark;//Variable to store the final exam's mark
        final int ASSIGNMENT_MAX = 140;//Constant created to store the maximum grade of all assignments
        final int MID_TERM_EXAM_MAX = 60;//Constant created to store the maximum grade of the mid-term exam
        final int FINAL_EXAM_MAX = 85;//Constant created to store the maximum grade of the final exam
        final double ASSIGNMENT_WORTH = 0.15;//Constant created to store how much the assignment worths
        final double MID_TERM_EXAM_WORTH = 0.40;//Constant created to store how much the mid-term exam worths
        final double FINAL_EXAM_WORTH = 0.45;//Constant created to store how much the final exam worths
        double assignmentMarkCalculated;//Variable to store the assignment divided by the assignment's maximun times the assignment's worth times 100
        double midTermExamMarkCalculated;//Variable to store the mid-term exam divided by the mid-term exam's maximun times the mid-term exam's worth times 100
        double finalExamMarkCalculated;//Variable to store the final exam divided by the final exam's maximun times the final exam's worth times 100
        String initialAssignmentMark = "Assignments: ";//String to store the first part of the assignment mark's output
        String finalAssgnmentMark = "/140 worth 15%\n";//String to store the last part of the assignment mark's output
        String initialmidTermExamMark = "Mid-term Exam: ";//String to store the first part of the mid-term exam mark's output
        String finalmidTermExamMark = "/60 worth 40%\n";//String to store the last part of the mid-term exam mark's output
        String initialfinalExamMark = "Final Exam: ";//String to store the first part of the final exam mark's output
        String finalfinalExamMark = "/85 worth 45%\n";//String to store the last part of the final exam mark's output
        double finalMark;//Variable to store the sum of all marks calculated
        String initialFinalMarkString = "\nFinal Mark: ";//String to store the first part of the final mark's output
        String finalFinalMarkString = "%";//String to store the last part of the final mark's output
                
        //The first line is the heading of my program.
        System.out.println("Final Mark Calculator\n");
 
        //I will initialize the class scanner in this line.
        Scanner input= new Scanner (System.in);
                
        //The first line will ask for the name of the student. Then, the student's name typed from the teacher will be stored in the variable studentName.
        System.out.print("Enter the student's name: ");
        studentName=input.nextLine();
        
        //The first line will ask for the assignment's mark of the student. Then, the assignment's mark typed from the teacher will be stored in the variable assignmentMark.
        System.out.print("Enter "+studentName+"'s mark for Assignments (Max. 140): ");
        assignmentMark=Double.parseDouble(input.nextLine());
        
        //The first line will ask for the Mid-term Exam's mark of the student. Then, the Mid-term Exam's mark typed from the teacher will be stored in the variable midTermExamMark.        
        System.out.print("Enter "+studentName+"'s Mid-term Exam mark (Max. 60): ");
        midTermExamMark=Double.parseDouble(input.nextLine());
        
        //The first line will ask for the final exam's mark of the student. Then, the final exam's mark typed from the teacher will be stored in the variable finalExamMark.
        System.out.print("Enter "+studentName+"'s Final Exam mark (Max. 85): ");
        finalExamMark=Double.parseDouble(input.nextLine());
        
        //The next line will add the header of the report.
        System.out.print("\nGrade Report"+"\n------------"+"\nStudent: "+studentName+"\n\n");

        //The next 3 lines, I am calculating each mark for the three marks entered previously.
        assignmentMarkCalculated = (((assignmentMark/ASSIGNMENT_MAX)*ASSIGNMENT_WORTH)*100);
        midTermExamMarkCalculated = (((midTermExamMark/MID_TERM_EXAM_MAX)*MID_TERM_EXAM_WORTH)*100);
        finalExamMarkCalculated = (((finalExamMark/FINAL_EXAM_MAX)*FINAL_EXAM_WORTH)*100);  
        
        //The next 3 lines, I am showing on the screen the results of each mark using the printf. I am using the printf to decide how many decimal numbers it will be possible to show up.
        System.out.printf("%s%.2f%s",initialAssignmentMark,assignmentMark,finalAssgnmentMark);
        System.out.printf("%s%.2f%s",initialmidTermExamMark,midTermExamMark,finalmidTermExamMark);
        System.out.printf("%s%.2f%s",initialfinalExamMark,finalExamMark,finalfinalExamMark);
        
        //The next 2 lines are calculating the final mark, and it is showing the result on the screen. I am using the printf to decide how many decimal numbers it will be possible to show up.
        finalMark = assignmentMarkCalculated +midTermExamMarkCalculated +finalExamMarkCalculated;
        System.out.printf("%s%.2f%s",initialFinalMarkString,finalMark,finalFinalMarkString);
    }

}
