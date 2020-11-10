import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int userChoice = 0; // holds menu choice

    while (userChoice != 6) { // displays menu options until user wants to Quit
      System.out.println("Please choose:"); 
      System.out.println("1 Class Offerings Report");  
      System.out.println("2 Class Roster Report");  
      System.out.println("3 Class Attendance Report");
      System.out.println("4 Class Grade Report");
      System.out.println("5 Student Schedule");
      System.out.println("6 Quit");
      userChoice = scnr.nextInt();  

      switch (userChoice) {  // if user choices 1-5 will run that report
        case 1:
          ClassOfferings.classOfferings(); // user choice 1 runs Class offerings report
          break;
        case 2:
          ClassRoster.classRoster();  // user choice 2 runs Class roster report               
          break;
        case 3:
          ClassAttendance.classAttendance(); // user choice 3 runs Class attendance report
          break;
        case 4:
          ClassGrade.classGrade(); // user choice 4 runs Class grade report
          break;
        case 5:
          StudentSchedule.studentSchedule(); // user choice 5 runs student schedule 
          break;
      }
    } 
  }
}