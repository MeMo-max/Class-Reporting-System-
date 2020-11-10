import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class ClassOfferings {
  public static void classOfferings(){
    String[][] classes =  ReadFile.readClasses(); // calls ReadFile readClasses, row holds each class and column holds Rubric Name Instructor Days Time
    int[][] classesInt = ReadFile.readClassesInt(); //calls ReadFile readClasses, row holds class and column holds CRN Section ClassSeats #enrolled Openings 
    System.out.println
    ("___________________________________________________________________________________________________");
    System.out.println
    ("---------------------------------------------------------------------------------------------------" );
    System.out.println
    ("___________________________________________________________________________________________________");
    System.out.println
    ("****************************************CLASS OFFERINGS********************************************");
    System.out.println
    ("**CRN***RUBRIC****SECTION******NAME********INSTRUCTOR***DAYS****TIME***SEATS***ENROLLED***OPENINGS"); //header for class offerings report 
    for(int i=0;i<5;i++){ // outputs each of the 5 classes 
      System.out.printf("%6d", classesInt[i][0]); // outputs crn
      System.out.printf("%6s", classes[i][0]); // outputs rubric 
      System.out.printf("%11d",classesInt[i][1]); // outputs section
      System.out.print("     ");
      System.out.printf("%12s", classes[i][1]); // outputs class name
      System.out.printf("%10s",classes[i][2]); // outputs class Instructor
      System.out.printf("%8s",classes[i][3]); // outputs class Days
      System.out.printf("%10s",classes[i][4]); // outputs class time
      System.out.printf("%5d",classesInt[i][2]); // outputs class seats 
      System.out.printf("%11d",classesInt[i][3]); // outputs # enrolled
      System.out.printf("%11d",classesInt[i][4]); // outputs # openings
      System.out.println();
    }
    System.out.println
    ("*************************************END OF REPORT**************************************************");
    System.out.println
    ("____________________________________________________________________________________________________");
    System.out.println
    ("----------------------------------------------------------------------------------------------------" );
    System.out.println
    ("____________________________________________________________________________________________________"); 
    // footer for end of file 
  }
}
