// These import statements are used to import classes from the `java.time` package, which provides
// classes for working with dates and times in Java.
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
   // The lines `public String name;` and `public String dob;` are declaring two instance variables in
   // the `Student` class.
    public String name;
    public String dob;

   /**
    * The function "displayName" prints the name of a student.
    */
    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    // The `displayAge` method takes a string parameter `dob`, which represents the date of birth of a
    // student.
    public void displayAge(String dob) {
        // This code block is calculating the age of a student based on their date of birth (dob).
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age +"years");
    }
    // The `public static void main(String[] args)` method is the entry point of a Java program. It is
    // the method that is executed when the program starts running.
    public static void main(String[] args) {
       // In the given code snippet, `Courses s = new Courses();` creates a new object of the `Courses`
       // class and assigns it to the variable `s`.
        Courses s = new Courses();
        s.name = "Radha Harshitha";
        s.displayName();
        s.displayAge("24-07-2004");
        s.displayStudentMarks();
}
}
