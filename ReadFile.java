import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
/*/****see below code for array storage diagram*****/
public class ReadFile { // class that reads from file into array 
  public static String[][] readClass(){ // reads strings from file into array 
    int class1SizeRowString = 25;  // array size for CIT1325 class size
    int class1SizeColString = 4; // array size for Student Name and Email
    int class1SizeRowInt = 25; // array size for CIT1325 class size
    int class1SizeColInt = 12; // array size for student ID, classRooster, attendance, and grades
    String[][] class1Names = new String[class1SizeRowString][class1SizeColString]; // row holds the class size and column hold each students data. 
    Double[][] class1Nums = new Double[class1SizeRowInt][class1SizeColInt]; // row holds class size, and column holds each students data
    int i;

    try {
      File fileText = new File("CIT1325.txt");  // open file
      Scanner s = new Scanner(fileText); // scanner 

    for (i=0; i<class1SizeRowInt;i++){   // read in file to array
      class1Names[i][0] = s.next();      // firstName
      class1Names[i][1] = s.next();      // lastName
      class1Names[i][2] = s.next();      // middleInt
      class1Nums[i][0] = s.nextDouble();      // studentId
      class1Names[i][3] = s.next();      // email
      class1Nums[i][1] = s.nextDouble();       // class1
      class1Nums[i][2] = s.nextDouble();      // class2
      class1Nums[i][3] = s.nextDouble();      // attendance
      class1Nums[i][4] = s.nextDouble();      // grade 1
      class1Nums[i][5] = s.nextDouble();      // grade 2
      class1Nums[i][6] = s.nextDouble();      // grade 3
      class1Nums[i][7] = s.nextDouble();      // grade 4
      class1Nums[i][8] = s.nextDouble();      // grade 5
      class1Nums[i][9] = s.nextDouble();      // # of classes attended
      class1Nums[i][10] = s.nextDouble();     // # of classes missed
      class1Nums[i][11] = s.nextDouble();     // attendance grade
    }
    s.close();
    } catch(FileNotFoundException ex){} // throws exception if unable to open file 
    return class1Names; // returns class1Names string array 
  }
  public static Double[][] readClassNums(){
    int class1SizeRowString = 25;  // array size for CIT1325 class size
    int class1SizeColString = 4; // array size for Student Name and Email
    int class1SizeRowInt = 25; // array size for CIT1325 class size
    int class1SizeColInt = 12; // array size for student ID, classRooster, attendance, and grades
    String[][] class1Names = new String[class1SizeRowString][class1SizeColString]; // row holds the class size and column hold each students data. 
    Double[][] class1Nums = new Double[class1SizeRowInt][class1SizeColInt]; // row holds class size, and column holds each students data
    int i;

    try {
      File fileText = new File("CIT1325.txt");  // open file
      Scanner s = new Scanner(fileText); // scanner 

    for (i=0; i<class1SizeRowInt;i++){   // read in file to array
      class1Names[i][0] = s.next();      // firstName
      class1Names[i][1] = s.next();      // lastName
      class1Names[i][2] = s.next();      // middleInt
      class1Nums[i][0] = s.nextDouble();      // studentId
      class1Names[i][3] = s.next();      // email
      class1Nums[i][1] = s.nextDouble();       // class1
      class1Nums[i][2] = s.nextDouble();      // class2
      class1Nums[i][3] = s.nextDouble();      // attendance
      class1Nums[i][4] = s.nextDouble();      // grade 1
      class1Nums[i][5] = s.nextDouble();      // grade 2
      class1Nums[i][6] = s.nextDouble();      // grade 3
      class1Nums[i][7] = s.nextDouble();      // grade 4
      class1Nums[i][8] = s.nextDouble();      // grade 5
      class1Nums[i][9] = s.nextDouble();      // # of classes attended
      class1Nums[i][10] = s.nextDouble();     // # of classes missed
      class1Nums[i][11] = s.nextDouble();     // attendance grade 
    }
    s.close();
    } catch(FileNotFoundException ex){} // throws exception if unable to open file 
    return class1Nums; // returns class1Nums doubles from file 
  }

  public static String[][] readClass2(){ // function to read 1350 from file and store in array 
    int class2SizeRowString = 20;  // array size for CIT1350 class size
    int class2SizeColString = 4; // array size for Student Name and Email
    int class2SizeRowInt = 20; // array size for CIT1350 class size
    int class2SizeColInt = 12; // array size for student ID, classRooster, attendance, and grades
    String[][] class2Names = new String[class2SizeRowString][class2SizeColString]; // row holds the class size and column hold each students data. 
    Double[][] class2Nums = new Double[class2SizeRowInt][class2SizeColInt]; // row holds class size, and column holds each students data
    int i; // creates variable for loops 

    try {
      File fileText = new File("CIT1350.txt");  // open file
      Scanner s = new Scanner(fileText); // scanner 

    for (i=0; i<class2SizeRowInt;i++){   // read in file to array
      class2Names[i][0] = s.next();      // firstName
      class2Names[i][1] = s.next();      // lastName
      class2Names[i][2] = s.next();      // middleInt
      class2Nums[i][0] = s.nextDouble();      // studentId
      class2Names[i][3] = s.next();      // email
      class2Nums[i][1] = s.nextDouble();       // class1
      class2Nums[i][2] = s.nextDouble();      // class2
      class2Nums[i][3] = s.nextDouble();      // attendance
      class2Nums[i][4] = s.nextDouble();      // grade 1
      class2Nums[i][5] = s.nextDouble();      // grade 2
      class2Nums[i][6] = s.nextDouble();      // grade 3
      class2Nums[i][7] = s.nextDouble();      // grade 4
      class2Nums[i][8] = s.nextDouble();      // grade 5
      class2Nums[i][9] = s.nextDouble();      // # of classes attended
      class2Nums[i][10] = s.nextDouble();     // # of classes missed
      class2Nums[i][11] = s.nextDouble();     // attendance grade      
    }
    s.close(); 
    } catch(FileNotFoundException ex){} // throws exception if issue with opening file 
    return class2Names; // returns 1350 strings array 
  }

  public static Double[][] readClassNums2(){ // reads in double from file for 1350 
    int class2SizeRowString = 20;  // array size for CIT1350 class size
    int class2SizeColString = 4; // array size for Student Name and Email
    int class2SizeRowInt = 20; // array size for CIT1350 class size
    int class2SizeColInt = 12; // array size for student ID, classRooster, attendance, and grades
    String[][] class2Names = new String[class2SizeRowString][class2SizeColString]; // row holds the class size and column hold each students data. 
    Double[][] class2Nums = new Double[class2SizeRowInt][class2SizeColInt]; // row holds class size, and column holds each students data
    int i; // variable for loops 

    try {
      File fileText = new File("CIT1350.txt");  // open file
      Scanner s = new Scanner(fileText); // scanner 

    for (i=0; i<class2SizeRowInt;i++){   // read in file to array
      class2Names[i][0] = s.next();      // firstName
      class2Names[i][1] = s.next();      // lastName
      class2Names[i][2] = s.next();      // middleInt
      class2Nums[i][0] = s.nextDouble();      // studentId
      class2Names[i][3] = s.next();      // email
      class2Nums[i][1] = s.nextDouble();       // class1
      class2Nums[i][2] = s.nextDouble();      // class2
      class2Nums[i][3] = s.nextDouble();      // attendance
      class2Nums[i][4] = s.nextDouble();      // grade 1
      class2Nums[i][5] = s.nextDouble();      // grade 2
      class2Nums[i][6] = s.nextDouble();      // grade 3
      class2Nums[i][7] = s.nextDouble();      // grade 4
      class2Nums[i][8] = s.nextDouble();      // grade 5
      class2Nums[i][9] = s.nextDouble();      // # of classes attended
      class2Nums[i][10] = s.nextDouble();     // # of classes missed
      class2Nums[i][11] = s.nextDouble();     // attendance grade
    }
    s.close();
    } catch(FileNotFoundException ex){} // throws expection if issue opening file 
    return class2Nums; // returns double array for numbers in file 
  }

  public static String[][] readClasses(){
    int cRowString = 5;  // array size for classes offered 
    int cColString = 5; // array size for Rubric Name Instructor Days Time
    int cRowInt = 5; // array size for classes offered
    int cColInt = 5; // array size for CRN Section ClassSeats #enrolled Openings 
    String[][] classes = new String[cRowString][cColString]; // row holds each class and column holds Rubric Name Instructor Days Time 
    int[][] classesInt = new int[cRowInt][cColInt]; // row holds class and column holds CRN Section ClassSeats #enrolled Openings 
    int i; // variable for loops 

    try {
      File fileText = new File("classes.txt");  // open file to read in classes 
      Scanner s = new Scanner(fileText); // scanner 

    for (i=0; i<cRowString;i++){   // read in file to array classes 
      classesInt[i][0] = s.nextInt(); // reads in crn
      classes[i][0] = s.next(); // reads in rubric 
      classesInt[i][1] = s.nextInt(); // reads in class section 
      classes[i][1] = s.next(); // reads in class name 
      classes[i][2] = s.next(); // reads in class instructor 
      classes[i][3] = s.next(); // read in class days
      classes[i][4] = s.next(); // read in class time 
      classesInt[i][2] = s.nextInt(); // read in total class seats 
      classesInt[i][3] = s.nextInt(); // read in # enrolled in class
      classesInt[i][4] = s.nextInt(); // read in # of class opeings 
    }
    s.close();
    } catch(FileNotFoundException ex){} // throws exception if unable to open file 
    return classes; // reurns string array for classes offered 
  }
  public static int[][] readClassesInt(){ // function to read in class offerings ints 
    int cRowString = 5;  // array size for classes offered 
    int cColString = 5; // array size for Rubric Name Instructor Days Time
    int cRowInt = 5; // array size for classes offered
    int cColInt = 5; // array size for CRN Section ClassSeats #enrolled Openings 
    String[][] classes = new String[cRowString][cColString]; // row holds each class and column holds Rubric Name Instructor Days Time 
    int[][] classesInt = new int[cRowInt][cColInt]; // row holds class and column holds CRN Section ClassSeats #enrolled Openings 
    int i; // variable for for loops 

    try {
      File fileText = new File("classes.txt");  // open file for classes 
      Scanner s = new Scanner(fileText); // scanner 

    for (i=0; i<cRowString;i++){   // read in file to array
      classesInt[i][0] = s.nextInt(); // read in crn
      classes[i][0] = s.next();  // read in rubric 
      classesInt[i][1] = s.nextInt(); // read in section 
      classes[i][1] = s.next(); // read in class name 
      classes[i][2] = s.next(); // read in class instructor
      classes[i][3] = s.next(); // read in days 
      classes[i][4] = s.next(); // read in time 
      classesInt[i][2] = s.nextInt(); // read in class seats available 
      classesInt[i][3] = s.nextInt(); // read in # enrolled 
      classesInt[i][4] = s.nextInt(); // read in # of openings 
    }
    s.close();
    } catch(FileNotFoundException ex){} // throws expection if unable to open file 
    return classesInt; // returns class offerings int array 
}
}

/*/ 
Class1Names[25][4] (string) (same for class 2 but goes to 20 instead of 25) 
            firstName 0 | lastName 1 | middleInt 2 | email 3 | 
student 0  
student 1
.etc to 25
Class1Nums[25][12] (int) (same for class 2 but goes to 20 instead of 25) 
         ID 0 |    class 1 |     class 2 |  class 3 | grade1  4 | grade2 5 | grade3 6 | grade4 7 | grade 5 8 | daysAttended 9 | daysMissed 10 | attendGrade 11 |
student 0  
student 1
.etc to 25
classsString [5][5]
        rubric 0 | name 1 | instrc 2 | days 3 | time 4
class  0
class  1
etc to 4
classNum [5][5]
         crn 0 | section 1 | seats 2 | enrolled 3 | openings 4
class  0
class  1
ets to 4  
/*/

