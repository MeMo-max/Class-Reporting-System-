import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class ClassGrade{ // class that outputs class grade by file 
  public static void classGrade(){
    FileOutputStream fileStream = null; // sets FileOutputStream name fileStream for output to file
    PrintWriter outFS = null; // sets PrintWriter named outFS for output to file
    Scanner scnr = new Scanner(System.in); // scanner 
    String class1Names[][] = ReadFile.readClass(); // calls readfile to store 1325 strings (first name, last name, middle int, and email)
    Double[][] class1Nums = ReadFile.readClassNums(); // calls readfile to store 1325 numbers (student id, enrolled class 1-3, test 1-5, # attended, # missed, attendance grade)
    String class2Names[][] = ReadFile.readClass2(); // calls readfile to store 1350 strings (first name, last name, middle int, and email)
    Double[][] class2Nums = ReadFile.readClassNums2(); // calls readfile to store 1350 numbers (student id, enrolled class 1-3, test 1-5, # attended, # missed, attendance grade)
    int userChoice; // holds user choice for file
    Double testAvg; // holds test average 
    Double finalGrade = 0.0; // holds final grade to output, and set to double 0.0
    char letterGrade; // sets letter grade to output based on final grade
    int size=6; // size of test average array 
    double[] testAvgArray = new double[size]; // holds student test scores averages (test 1-5 and average of all test)
    int topStudent =0; // holds top student location to call at end of report (ex if student i @ 2 has top grade then class1Names[2][1-2] will be output at end)
    double topStudentGrade = 0; // holds top student grade to output at end of report

    System.out.println("Which class would you like to print, 1325 or 1350?");
    userChoice = scnr.nextInt(); 

    try { // uses try & catch for exceptions while file is being created 
      fileStream = new FileOutputStream("GradeReport.txt"); // name of file created
      outFS = new PrintWriter(fileStream); // sets output to outFS
        
      outFS.println("__________________________________________________________________________________________");
      outFS.println    ("------------------------------------------------------------------------------------------" );
      outFS.println    ("__________________________________________________________________________________________");
      outFS.println
      ("***************************************CLASS GRADE****************************************");outFS.println
      ("**FIRST****LAST***TEST1**TEST2**TEST3**TEST4**TEST5**AVERAGE***FINAL GRADE**LETTER GRADE**"); 
      // outputs header for class grade report 
    
      if (userChoice == 1325){ // determines if user entered 1325 to call
        int i;
        for (i = 0;i<25;i++){ // loop to run through the 25 students stored in array 
        outFS.printf("%7s", class1Names[i][0]); // outputs first name
        outFS.print("  ");
        outFS.printf("%7s", class1Names[i][1]); // output last name
        outFS.print("  ");
        outFS.printf("%5.2f", class1Nums[i][4]); // output test 1
        outFS.printf("%7.2f", class1Nums[i][5]); // output test 2
        outFS.printf("%7.2f", class1Nums[i][6]); // output test 3
        outFS.printf("%7.2f", class1Nums[i][7]); // output test 4
        outFS.printf("%7.2f", class1Nums[i][8]); // output test 5
        testAvg = ((class1Nums[i][4] + class1Nums[i][5] + class1Nums[i][6] + class1Nums[i][7] + class1Nums[i][8]) / 5); // determines and sets test average ((t1+t2+t3+t4+t5) / 5)
        outFS.printf("%7.2f", testAvg); // output students test average
        finalGrade= ((class1Nums[i][4] + class1Nums[i][5] + class1Nums[i][6] + class1Nums[i][7] + (class1Nums[i][8]*2)) / 6); // determines and sets final grade ((t1+t2+t3+t4+(t5*2) / 6)
        outFS.printf("%12.2f", finalGrade); // output students final grade 
      
        if (finalGrade >= 89.5){ // sets letter grade for student 
          letterGrade = 'A';
        }
        else if (finalGrade >=79.5){ // sets letter grade for student 
          letterGrade = 'B';
        }
        else if (finalGrade >=69.5){ // sets letter grade for student 
          letterGrade = 'C';
        }
        else {
          letterGrade = 'F'; // sets letter grade for student 
        }
        outFS.printf("%11c", letterGrade); // outputs letter grade 
        outFS.println();
        testAvgArray[0] = testAvgArray[0] + class1Nums[i][4]; // sets the classes test 1 average by adding each one in
        testAvgArray[1] = testAvgArray[1] + class1Nums[i][5]; // sets the classes test 2 average by adding each one in
        testAvgArray[2] = testAvgArray[2] + class1Nums[i][6]; // sets the classes test 3 average by adding each one in
        testAvgArray[3] = testAvgArray[3] + class1Nums[i][7]; // sets the classes test 4 average by adding each one in
        testAvgArray[4] = testAvgArray[4] + class1Nums[i][8]; // sets the classes test 5 average by adding each one in
        testAvgArray[5] = testAvgArray[5] + testAvg; // sets the classes test total average by adding each one in
        
        if (topStudentGrade < finalGrade){ // determines top student 
          topStudentGrade = finalGrade; // if higher then current sets topStudentGrade to that final grade to output later
          topStudent = i; // sets top student to that loops level
        }
        }
        outFS.println
        ("____________________________________TEST AVERAGES_________________________________________");
          outFS.println
        ("***TEST 1***TEST 2***TEST 3***TEST 4***TEST 5***ALL TEST**********************************"); // test average header 
        for (int J=0;J<size;J++){ // determines test average by dividing each by SET class size
          testAvgArray[J] = (testAvgArray[J] /25);
        }
        for (int k=0;k<size;k++) { // outputs test averages for class 
          outFS.printf("%9.2f", testAvgArray[k]);        
        }
        outFS.println(); 
        outFS.println
        ("____________________________________TOP STUDENT_________________________________________");
        outFS.println
        ("***FIRST***LAST****TOP GRADE************************************************************"); // top student header 
        outFS.printf("%8s", class1Names[topStudent][0]); // output top student first name
        outFS.print("  ");
        outFS.printf("%5s", class1Names[topStudent][1]); // output top studnet last name 
        outFS.print("  ");
        outFS.printf("%8.2f", topStudentGrade); // output top student grade 
        outFS.println();

        
        System.out.println("Report printed to file."); // outputs to console that report printed 
      }
      if (userChoice == 1350){ // determines if user entered 1350 to call
        for (int i = 0;i<20;i++){  // loop to run through the 20 students stored in array
          outFS.printf("%7s", class2Names[i][0]); // outputs first name
          outFS.print("  ");
          outFS.printf("%7s", class2Names[i][1]); // outputs last name
          outFS.print("  ");
          outFS.printf("%5.2f", class2Nums[i][4]); // output test 1
          outFS.printf("%7.2f", class2Nums[i][5]); // output test 2
          outFS.printf("%7.2f", class2Nums[i][6]); // output test 3
          outFS.printf("%7.2f", class2Nums[i][7]); // output test 4
          outFS.printf("%7.2f", class2Nums[i][8]); // output test 5
          testAvg = ((class2Nums[i][4] + class2Nums[i][5] + class2Nums[i][6] + class2Nums[i][7] + class2Nums[i][8]) / 5); // determines and sets test average ((t1+t2+t3+t4+t5) / 5)
          outFS.printf("%7.2f", testAvg);  // output students final grade
          finalGrade = ((class2Nums[i][4] + class2Nums[i][5] + class2Nums[i][6] + class2Nums[i][7] + (class2Nums[i][8]*2)) / 6); // determines and sets final grade ((t1+t2+t3+t4+(t5*2) / 6)
          outFS.printf("%12.2f", finalGrade); // output students final grade 
      
          if (finalGrade >= 89.5){ // sets letter grade for student 
            letterGrade = 'A';
          }
          else if (finalGrade >=79.5){ // sets letter grade for student
            letterGrade = 'B';
          }
          else if (finalGrade >=69.5){ // sets letter grade for student
            letterGrade = 'C';
          }
          else {
            letterGrade = 'F'; // sets letter grade for student
          }
          outFS.printf("%11c", letterGrade); // outputs letter grade 
          outFS.println();

          testAvgArray[0] = testAvgArray[0] + class2Nums[i][4]; // sets the classes test 1 average by adding each one in
          testAvgArray[1] = testAvgArray[1] + class2Nums[i][5]; // sets the classes test 2 average by adding each one in
          testAvgArray[2] = testAvgArray[2] + class2Nums[i][6]; // sets the classes test 3 average by adding each one in
          testAvgArray[3] = testAvgArray[3] + class2Nums[i][7]; // sets the classes test 4 average by adding each one in
          testAvgArray[4] = testAvgArray[4] + class2Nums[i][8]; // sets the classes test 5 average by adding each one in
          testAvgArray[5] = testAvgArray[5] + testAvg; // sets the classes test total average by adding each one in
        
          if (topStudentGrade < finalGrade){ // determines top student 
            topStudentGrade = finalGrade; // if higher then current sets topStudentGrade to that final grade to output later
            topStudent = i; // sets top student to that loops level
          }
          }
          outFS.println
          ("____________________________________TEST AVERAGES_________________________________________");
          outFS.println
        ("***TEST 1***TEST 2***TEST 3***TEST 4***TEST 5***ALL TEST**********************************"); // test average header 
          for (int i=0;i<size;i++){ // determines test average by dividing each by SET class size
          testAvgArray[i] = (testAvgArray[i] /25); 
          }
          for (int i=0;i<size;i++) { // outputs test averages for class
          outFS.printf("%9.2f", testAvgArray[i]);        
          }
          outFS.println();
          outFS.println
        ("____________________________________TOP STUDENT_________________________________________");
          outFS.println
        ("***FIRST***LAST****TOP GRADE************************************************************"); // top student header 
          outFS.printf("%8s", class2Names[topStudent][0]); // output top student first name
          outFS.print("  ");
          outFS.printf("%5s", class2Names[topStudent][1]); // output top studnet last name 
          outFS.print("  ");
          outFS.printf("%8.2f", topStudentGrade); // output top student grade 
          outFS.println();
          System.out.println("Report printed to file."); // outputs to console that report printed 
      }
          outFS.println
        ("*************************************END OF REPORT****************************************");
          outFS.println
        ("__________________________________________________________________________________________");
        outFS.println
        ("------------------------------------------------------------------------------------------" );
        outFS.println
        ("__________________________________________________________________________________________"); // footer for end of reports for both files 
        outFS.close(); // closes file
        fileStream.close(); // closes fileStream
       } catch (IOException ex) {} // throws exception if issue creating file 
    }

}
