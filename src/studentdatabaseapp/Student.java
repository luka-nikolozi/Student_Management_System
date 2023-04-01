package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter student's name and year
    public Student (){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        firstName = in.next();

        System.out.print("Enter student last name: ");
        lastName = in.next();

        System.out.print("Enter student grade year (0 < grade < 5): ");
        gradeYear = in.nextInt();

        setStudentID();
    }

    // Generate an ID
    private void setStudentID(){
        id++; // when we make new object of Student class id rise with 1. and for any student (id will be same)
        this.studentID = this.gradeYear + "" + id;
        System.out.println("your id: "+studentID);
    }

    // Enroll in courses

    public void eroll() {
        // get inside a loop, user hits 0 when he is done enrolling
        System.out.println("Enter course to enroll Q to quit");
        do {
            Scanner scan = new Scanner(System.in);
            String course = scan.next();
            if (!course.equals("Q")) {
                courses = courses + " " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else break;
        } while (true);

                            // we also could do like this

        /*System.out.println("Enter course to enroll, Q to quit");
        System.out.println();
        System.out.println("H. History 101");
        System.out.println("M. Mathematics 101");
        System.out.println("E. English 101");
        System.out.println("C. Chemistry 101");
        System.out.println("CS. Computer Science 101");
        System.out.println("Q. Quit");
        String course ="";
        do {
            Scanner scan = new Scanner(System.in);
            course = scan.next();

            switch (course){
                case "H":
                    courses +=  "History 101   ";
                    tuitionBalance = tuitionBalance + costOfCourse;
                    break;
                case "M":
                    courses +=  "Mathematics 101   ";
                    tuitionBalance = tuitionBalance + costOfCourse;
                    break;
                case "E":
                    courses +=  "English 101   ";
                    tuitionBalance = tuitionBalance + costOfCourse;
                    break;
                case "C":
                    courses +=  "Chemistry 101   ";
                    tuitionBalance = tuitionBalance + costOfCourse;
                    break;
                case "CS":
                    courses +=  "Computer Science 101   ";
                    tuitionBalance = tuitionBalance + costOfCourse;
                    break;
                default: break;
            }

        } while (!course.equals("Q"));*/

    }

    // View balance
    private void viewBalance(){
        System.out.println("Your balance is: $"+tuitionBalance);
    }

    // Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        tuitionBalance = tuitionBalance - payment;
        viewBalance();
    }

    // Show status
    @Override
    public String toString(){
        return "\n"+"information:" +"\n" + "name: "+ firstName + " " +lastName+"\n"+ "grade: "+ gradeYear + "\n" +"courses: "+courses+"\n"+"balance: $"+tuitionBalance;
    }

    /*public String getFirstName() {
        return firstName;
    }*/
}
