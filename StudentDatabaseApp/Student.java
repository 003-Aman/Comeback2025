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
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else{
            
                break;
                
            }
        } while(1 != 0);
        System.out.print("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }    
        
            


    
    //view balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    //pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //show status
    public void showInfo(){
        System.out.println("Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance);
    }
    
}

