import java.util.Scanner;

import StudentDatabaseApp.Student;

public class StudentDatabaseApp{
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.toString());
        
        //ask how many new users we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[in.nextInt()];
        //create n number of new students
        for(int n = 0; n < students.length; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            
        }
        for(int n = 0; n < students.length; n++){
            System.out.println(students[n].toString());
        }
        
        
    }
    
}
