package studentdatabaseapp;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // how many new users we want to add
        System.out.print("enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        System.out.println();
        Student[] students = new Student[numOfStudents];

        // create n number of new students
        for(int i = 0; i < numOfStudents; i++){
            students[i] = new Student();                             // you have to make this statement!
            students[i].eroll();
            students[i].payTuition();
        }

        for(int i = 0; i < numOfStudents; i++){
            System.out.println(students[i].toString());
        }


// bellow code is an (non-finished) example of how to make arraylist of Students (in above code array is non-resizable)


        /*ArrayList<Student> array = new ArrayList<>();
        System.out.println("to end filling write quit"+"\n"+"Start filling in Students");
        while (true) {
            Student student = new Student();
            array.add(student);
            if (student.getFirstName().equals("END")) {
                System.out.println("End of array");
                break;
            }
        }
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));          // because we have Overrided toString method get gives us information.
        }*/

    }
}