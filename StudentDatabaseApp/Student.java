package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;
    private static int id = 1000;
    //constructor prompts user to enter student's name and year
    public Student(){
        System.out.println("Enter student first name: ");
        Scanner in = new Scanner(System.in);
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear+ " " + studentID);
        
        
        
    }
    //generate an ID

    private void setStudentID(){
        //grade level + ID
        id++;
        
        this.studentID= gradeYear + "" + id;
    }
    //enroll in courses
    public void enroll(){
        //get inside a loop, user hits 0
        do{
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else{
                System.out.println("BREAK!");
                break;
                
            }
        } while(1 != 0);
        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }    
        
            


    
    //view balance
    //pay tuition
    //show status
    
}

