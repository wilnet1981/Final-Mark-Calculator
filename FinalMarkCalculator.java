//This line will import the class Scanner to my program
import java.util.Scanner;

/**
 * FinalMarkCalculator: This program will calculate the final mark for each student
 *
 * @author William Martins
 * @version 2.0
 *
 * Assignment: #2
 * Course: ADEV-1003
 * Section: 6
 * Date Created: 9.15.2016
 * Last Updated: 9.21.2016
 * 
 */
class FinalMarkCalculator{
    public static void main(String [] args)
    {
        
        //The first to lines are the heading of our program.
        System.out.println("Final Mark Calculator");
        System.out.println("");
 
        //I will initialize the class scanner in this line.
        Scanner input= new Scanner (System.in);
        
        //I will create a variable called studentName to store the student's name.
        String studentName;
                
        //The first line will ask for the name of the student. Then, the student's name typed from the teacher will be stored in the variable.
        System.out.print("Enter the student's name: ");
        studentName=input.nextLine();
        
        /*Now the teacher will input the assignments mark of this student.
         * I will create a variable called assignmentMark to store the student's mark for their assignment.
         */
        double assignmentMark=0;
        System.out.print("Enter "+studentName+"'s mark for Assignments (Max. 140): ");
        
        //The next line will store the student's mark for their assignment.
        assignmentMark=Double.parseDouble(input.nextLine());
        
        /*Now the teacher will input the mid-term exam mark of this student.
         * I will create a variable called midTermExamMark to store the student's mark for their mid-term exam.
         */
        double midTermExamMark=0;
        System.out.print("Enter "+studentName+"'s Mid-term Exam mark (Max. 60): ");
        
        //The next line will store the student's mark for their mid-term exam.
        midTermExamMark=Double.parseDouble(input.nextLine());
        
        /*Now the teacher will input the final exam mark of this student.
         * I will create a variable called finalExamMark to store the student's mark for their final exam.
         */
        double finalExamMark=0;
        System.out.print("Enter "+studentName+"'s Final Exam mark (Max. 85): ");
        
        //The next line will store the student's mark for their final exam.
        finalExamMark=Double.parseDouble(input.nextLine());
        
        //The next line will add the header of the report.
        System.out.print("\nGrade Report"+"\n------------"+"\nStudent: "+studentName+"\n\n");
        
        //In the next lines, I am creating constants for my program.
        final int ASSIGNMENT_MAX = 140;
        final int MID_TERM_EXAM_MAX = 60;
        final int FINAL_EXAM_MAX = 85;
        final double ASSIGNMENT_WORTH = 0.15;
        final double MID_TERM_EXAM_WORTH = 0.40;
        final double FINAL_EXAM_WORTH = 0.45;
        
        //The next 3 lines, I am creating variables that are calculating each mark individually.
        double assignmentMarkCalculated = (((assignmentMark/ASSIGNMENT_MAX)*ASSIGNMENT_WORTH)*100);
        double midTermExamMarkCalculated = (((midTermExamMark/MID_TERM_EXAM_MAX)*MID_TERM_EXAM_WORTH)*100);
        double finalExamMarkCalculated = (((finalExamMark/FINAL_EXAM_MAX)*FINAL_EXAM_WORTH)*100);
        
        //The next 3 lines, I am showing on the screen the results of each mark
        System.out.println("Assignments: "+assignmentMark+"/140 worth 15%");
        System.out.println("Mid-term Exam: "+midTermExamMark+"/140 worth 40");
        System.out.println("Final Exam: "+finalExamMark+"/140 worth 45%");
        
        //The next 2 lines are calculating the final mark, and it is showing the result on the screen.
        double finalMark = assignmentMarkCalculated +midTermExamMarkCalculated +finalExamMarkCalculated;
        System.out.println("\nFinal Mark: "+finalMark);
    }

}
