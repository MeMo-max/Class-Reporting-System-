# Class-Reporting-System-
Solo Programming Project Specification Class Reporting System C++ Project
Standard Project Requirements:
1. Must use the Project Plan Template for all submissions
2. Program must contain individual Functions and a Main Program.
3. Algorithms must be included for each of the functions, as well as the main program.
4. All data structures (arrays, vectors, tables) must be specified.
5. Using OOP Classes highly encouraged.
6. All Code are required to have headers sections and coding comments throughout.
7. All Programs must be tested and documented for completeness.
8. The Cpp Source (*.cpp/*.h) files must be included with the Code submission.
9. If used all additional input file must be included in the Code Submission. Given input
files are not required.
Class Reporting System – Project Specifications:
1. Create a Class Reporting System that can produce the following reports:
• Class Offerings Report – Report on all class section offered this semester including
CRN, Rubric(COSC, MATH,…), Section, Course-Name, Instructor, Days, Time,
Class Seats, # of students enrolled, Class Openings.
• Class Roster Report – Report of all students enrolled in the class including , LastName, First-Name, Middle-Init, Student-ID, Student-email.
• Class Attendance Report – Report of all students with number of classes attended
and missed and there overall Attendance Grade.
• Class Grade Report – Tabular Report of all students by name with 4 test score and a
final score with student Test Average overall Number Grade and Final Letter Grade.
• (Extra Credit) Student Schedule – Report of all classes with days and time taken by
one student this semester.
• (Extra Credit) Student Grade Report – Report of all Grades in classes taken by
one student this semester
2. Your Class Reporting Systems needs to handle 5-10 classes offered this semester.
3. Each Class can have a minimum of 12 students and a maximum of 30 students.
4. Class Grade Report Requirements:
• Program allows the client to choose a class data text file to read in to create the Class
Grade Report. You can set an existing file as default.
• Program must read Student Grade Data in the data from the text file, which includes:
• Student first name
• Student last name
• Four Test Grades
• Final Test Grade – counts twice towards the grade.
Solo Programming Project Specification Class Reporting System C++ Project
• Two class grade data text files have been attached with this specification. These files
must work with your program. [ CIT1325.txt, CIT1350.txt ].
• The students’ test grades should be kept in an array.
• All the student grade information should be read into the program first, so you must
decide how you will store the information.
• Once you have the data, then calculate each student’s average (4 tests plus Final
counts double).
• Also calculate the student letter grade for the class based on their average.
• The output of this program is a tabular grade report that is written to an output file
(GradeReport.txt).
• The report includes each student’s name 5 test grades, test average and final grade as
a table.
• At the end of the report, print the averages of each Test and overall Test Average, as
well as highest Test Grade of all Tests.
• Also print the student(s) with the highest class grade.
5. How to organize and store the rest of the information is up to you to design. Try to make it
simple on yourself to mimic the Class Grade Report design when appropriate.
Some suggestion for Classes:
1. Classes – data and functions associated with class offering this semester to product the Class
Offerings Report.
2. ClassSection -- data and functions associated with 1 class section to be able to produce
Class Roster, Class Attendance, and Class Grade Report.
3. (Extra Credit) Student -- data and functions associated with each student to be able to
produce Student Schedule, and Student Grade Report.
Some suggestion for Functions:
1. Function to read in class offering information for this semester.
2. Function to read in students registered for a particular class section.
3. Function to read in student grades for a particular class section.
4. Function to calculate one student grade average.
5. Function to calculate letter grade for 1 student
6. Function to calculate the averages of 1 test
7. Function to calculate the overall Test Average
8. Function to find student with highest class grade.
9. Function to output the class grade report to a file.
Solo Programming Project Specification Class Reporting System C++ Project
Required for PP1-Design Submission:
1. Completed Choice and Design in the Project Plan Document
2. All the algorithms must be included in the Project Plan Document and not
separate files.
Required for PP1-Code Submission:
1. Completed Project Plan Document
2. Source Code files (*.cpp / *.h files)
3. Additional Input files
Required for PP1-Git Submission:
1. Create a personal GitHub Account
2. Research how to add your own code and documentation to your account
3. Once you have uploaded your code, then take screen shots of your code on
GitHub and submit the screen-shot for credit for the assignment,
