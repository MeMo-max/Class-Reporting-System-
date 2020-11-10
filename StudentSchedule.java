import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class StudentSchedule { // class to print student schedule 
  public static void studentSchedule(){ 
    String[][] classes =  ReadFile.readClasses(); // calls ReadFile readClasses, row holds each class and column holds Rubric Name Instructor Days Time
    int[][] classesInt = ReadFile.readClassesInt(); //calls ReadFile readClasses, row holds class and column holds CRN Section ClassSeats #enrolled Openings 
    String class1Names[][] = ReadFile.readClass(); // calls readfile to store 1325 strings (first name, last name, middle int, and email)
    Double[][] class1Nums = ReadFile.readClassNums(); // calls readfile to store 1325 numbers (student id, enrolled class 1-3, test 1-5, # attended, # missed, attendance grade)
    String class2Names[][] = ReadFile.readClass2();  // calls readfile to store 1350 strings (first name, last name, middle int, and email)
    Double[][] class2Nums = ReadFile.readClassNums2(); // calls readfile to store 1350 numbers (student id, enrolled class 1-3, test 1-5, # attended, # missed, attendance grade)
    Scanner s = new Scanner(System.in);  // scanner 
    int id; // holds users choice 

    System.out.print("Enter student ID to print schedule:"); 
    id = s.nextInt(); // inputs user choice for student id 
    System.out.println
    ("________________________________________________");
    System.out.println
    ("------------------------------------------------" );
    System.out.println
    ("________________________________________________");
    System.out.println
    ("****FIRST****LAST*******ID**********************"); // header for student schedule
    for (int i = 0; i<25;i++){ // for loop for 1325 since size is SET
      if (id == class1Nums[i][0]){ // determines which student user is trying to view 
        System.out.printf("%8s", class1Names[i][0]); // output first name 
        System.out.printf("%10s", class1Names[i][1]); // output last name 
        System.out.printf("%11.0f", class1Nums[i][0]); // output student id 
        System.out.println(); // new line

        double data1 = (class1Nums[i][1] - 1); // determines which class a student is in and stores it 
        double data2 = (class1Nums[i][2] - 1); // determines which class a student is in and stores it
        double data3 = (class1Nums[i][3] - 1); // determines which class a student is in and stores it
        int tempCrn1 = (int)data1; // converts to int
        int tempCrn2 = (int)data2; // converts to int
        int tempCrn3 = (int)data3; // converts to int

    System.out.println
    ("------------------------------------------------" );
    System.out.println
    ("**SUBJ**CRSE********NAME*********DAYS**TIME*****");  // header for classes student is in       
        if ((tempCrn1 >= 1)) { // determins if student is enrolled in a class 
          System.out.printf("%6s",classes[tempCrn1][0]); // ouputs subject
          System.out.printf("%6d",classesInt[tempCrn1][1]); // outputs course number 
          System.out.printf("%18s",classes[tempCrn1][1]); // outputs course name 
          System.out.printf("%6s", classes[tempCrn1][3]); // outputs days
          System.out.printf("%8s", classes[tempCrn1][4]); // outputs time 
          System.out.println(); 
        } 
        if (tempCrn2 >= 1){// determins if student is enrolled in a class
          System.out.printf("%6s", classes[tempCrn2][0]); // ouputs subject
          System.out.printf("%6d", classesInt[tempCrn2][1]); // outputs course number 
          System.out.printf("%18s", classes[tempCrn2][1]);  // outputs course name 
          System.out.printf("%6s", classes[tempCrn2][3]);  // outputs days
          System.out.printf("%8s", classes[tempCrn2][4]); // outputs time
          System.out.println();
        }
        if (tempCrn3 >= 1){ // determins if student is enrolled in a class
          System.out.printf("%6s", classes[tempCrn3][0]); // ouputs subject
          System.out.printf("%6d", classesInt[tempCrn3][1]); // outputs course number 
          System.out.printf("%18s", classes[tempCrn3][1]);  // outputs course name 
          System.out.printf("%6s", classes[tempCrn3][3]); // outputs days
          System.out.printf("%6s", classes[tempCrn3][4]); // outputs time
          System.out.println();
        }
      }
    }

    for (int i = 0; i<20;i++){ // for loop for 1350 since size is SET
      if (id == class2Nums[i][0]){ // determines which student user is trying to view 
        System.out.printf("%8s", class2Names[i][0]);  // output first name 
        System.out.printf("%10s", class2Names[i][1]);  // output last name 
        System.out.printf("%11.0f", class2Nums[i][0]); // output student id
        System.out.println();
        
        double data1 = (class2Nums[i][1]); // determines which class a student is in and stores it
        double data2 = (class2Nums[i][2]); // determines which class a student is in and stores it
        double data3 = (class2Nums[i][3]); // determines which class a student is in and stores it
        int tempCrn1 = (int)data1; // converts to int
        int tempCrn2 = (int)data2; // converts to int
        int tempCrn3 = (int)data3; // converts to int

    System.out.println
    ("------------------------------------------------" );
    System.out.println
    ("**SUBJ**CRSE********NAME*********DAYS**TIME*****"); // header for classes student is in   
        if (tempCrn1 >= 1) {// determins if student is enrolled in a class
          System.out.printf("%6s",classes[tempCrn1][0]);  // ouputs subject
          System.out.printf("%6d",classesInt[tempCrn1][1]); // outputs course number 
          System.out.printf("%18s",classes[tempCrn1][1]); // outputs course name 
          System.out.printf("%6s", classes[tempCrn1][3]); // outputs days
          System.out.printf("%8s", classes[tempCrn1][4]); // outputs time
          System.out.println(); 
        } 
        if (tempCrn2 >= 1){// determins if student is enrolled in a class
          System.out.printf("%6s", classes[tempCrn2][0]);  // ouputs subject
          System.out.printf("%6d", classesInt[tempCrn2][1]); // outputs course number 
          System.out.printf("%18s", classes[tempCrn2][1]); // outputs course name 
          System.out.printf("%6s", classes[tempCrn2][3]); // outputs days
          System.out.printf("%8s", classes[tempCrn2][4]); // outputs time
          System.out.println();
        }
        if (tempCrn3 >= 1){// determins if student is enrolled in a class
          System.out.printf("%6s", classes[tempCrn3][0]);  // ouputs subject
          System.out.printf("%6d", classesInt[tempCrn3][1]); // outputs course number 
          System.out.printf("%18s", classes[tempCrn3][1]); // outputs course name 
          System.out.printf("%6s", classes[tempCrn3][3]);  // outputs days
          System.out.printf("%8s", classes[tempCrn3][4]); // outputs time
          System.out.println();
        }
      }
    }
  }
}