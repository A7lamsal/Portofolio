
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Testing {

    public static TreeMap<String, ArrayList<Trainee>> courses = new TreeMap<>(); // list of courses

    public static void main(String[] args) {
        testMethod();
    }
    public static void testMethod() {
        Courses();
        Trainee t = new Trainee("Ahlam", 11000, "Jeddah", true, "Ahlam@email.com");
        Trainee t2 = new Trainee("Saleh", 12000, "Jeddah", false, "Saleh@email.com");
        Trainee t3 = new Trainee("Wafa", 14000, "Jeddah", true, "Ahlam@email.com");
        Trainee t4 = new Trainee("Osama", 15000, "Jeddah", false, "Saleh@email.com");
        Trainee t5 = new Trainee("Sara", 16000, "Jeddah", true, "Saleh@email.com");
        Trainee t6 = new Trainee("Turki", 16000, "Jeddah", false, "Saleh@email.com");

        System.out.println("\n**************Adding**************\n");
        System.out.println(Course.addTrainee(t, "MT132", courses));
        System.out.println(Course.addTrainee(t2, "MT132", courses));
        System.out.println(Course.addTrainee(t3, "MT132", courses));
        System.out.println(Course.addTrainee(t4, "MT132", courses));
        System.out.println(Course.addTrainee(t6, "MT132", courses));
        System.out.println(Course.addTrainee(t5, "MT132", courses));
        System.out.println("\n");
        
        System.out.println(Course.addTrainee(t6, "TM112", courses));
        System.out.println(Course.addTrainee(t2, "TM112", courses));
        System.out.println(Course.addTrainee(t6, "TM112", courses));
        System.out.println(Course.addTrainee(t, "TM112", courses));
        System.out.println(Course.addTrainee(t3, "TM112", courses));


        System.out.println("\n**************Removing**************\n");
        System.out.println(Course.removeTrainee(t, "MT132", courses));
        System.out.println(Course.removeTrainee(t, "MT132", courses));
        System.out.println(Course.removeTrainee(t5, "MT132", courses));

        System.out.println("\n");
        System.out.println(Course.removeTrainee(t5, "MT132", courses));
        System.out.println(Course.removeTrainee(t4, "MT132", courses));


        System.out.println(Course.displayCourses());
    }
    
    /*the below method helps to include
     *the names of all available courses 
     *in a text file 
     */
    public static void Courses() {
        try {
            File f = new File("src/Courses.txt");
            Scanner read = new Scanner(f);
            while (read.hasNext()) {
                courses.put(read.nextLine(), new ArrayList<Trainee>());
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        } 

    }
}
