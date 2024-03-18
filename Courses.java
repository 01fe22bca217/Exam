public class Courses extends Student {
    // The code `private String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "MP" };` declares and
    // initializes an array of strings named `courseCodes`. The array contains the course codes for
    // different courses, namely "C#", "ST", "ML", "DEVOPS", and "MP".
     private String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "MP" };
     private int[] marks = { 85, 92, 89, 88, 95 };
 
     // The `displayStudentMarks()` method is a public method that does not return any value (`void`).
     // It is used to display the course codes and marks obtained by a student.
     public void displayStudentMarks() {
        // The line `System.out.println("Course Codes \t Marks Obtained");` is used to print a header
        // for the table that will display the course codes and marks obtained by a student. The `\t` is
        // an escape sequence that represents a tab character, which is used to create a tabular format
        // for the output.
         System.out.println("Course Codes \t Marks Obtained");
 // The code snippet is a for loop that iterates over the `courseCodes` array and `marks` array
 // simultaneously.
 
         for (int i = 0; i < courseCodes.length; i++) {
             System.out.println(courseCodes[i] + "\t\t\t" + marks[i]);
         }
         }
     }