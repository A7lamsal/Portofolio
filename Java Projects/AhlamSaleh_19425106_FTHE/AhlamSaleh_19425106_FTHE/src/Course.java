
//import static Testing.courses;
import java.util.ArrayList;
import java.util.TreeMap;

public class Course {

    private String courseName; // course name 
    private ArrayList<Trainee> trainees = new ArrayList<Trainee>(); // list of courses

    public String getCourseName() //getter of course name
    {
        return courseName;
    }

    public void setCourseName(String courseName) //setter of course name
    {
        this.courseName = courseName;
    }

    public ArrayList<Trainee> getTrainee() // getter of trainee's list
    {
        return trainees;
    }

    /*The below method helps to add trainee in the trainee's list  
     *using their identities and uses national ID to  differentaite between 2 
     *trainee's so that we dont add same Id twice
     */
    public static String addTrainee(Trainee trainee, String key, TreeMap<String, ArrayList<Trainee>> courses) {
        boolean Exists = false;
        for (String nkey : courses.keySet()) {
            if (nkey.equals(key)) {
                for (int i = 0; i < courses.get(key).size(); i++) {
                    if (courses.get(key).get(i).compareTo(trainee) == 0) {
                        Exists = true;
                        if (!courses.get(key).get(i).equals(trainee)) {
                            return ("Cannot add trainee with same ID twice!!");

                        } else {
                            return ("Cannot add trainee  twice!!");

                        }

                    }
                }
            }
        }
        if (Exists == false) {
            if (courses.get(key) != null) {
                courses.get(key).add(trainee);
                return ("Trainee is added successfully");
            } else {
                courses.put(key, new ArrayList<Trainee>());
                courses.get(key).add(trainee);
                return ("Trainee is added successfully");
            }
        }
        return "";
    }

    /*The below method helps to remove a specific trainee 
     *using their national ID to  differentaite between 2 
     *trainee's
     */
    public static String removeTrainee(Trainee trainee, String key, TreeMap<String, ArrayList<Trainee>> courses) {

        boolean removes = false;
        for (String nkey : courses.keySet()) {
            if (nkey.equals(key)) {
                for (int i = 0; i < courses.get(key).size(); i++) {
                    if (courses.get(key).get(i).compareTo(trainee) == 0) {
                        removes = true;
                        System.out.println(courses.get(key).remove(i));
                        return ("Trainee is removed successfully");
                    }
                }

            }
        }
        if (removes == false) {
            return ("Trainee cant be removed, Trainee not available");
        }
        return "";
    }
    
    /*the below method helps to display
     *all the trainee in the specified course  
     */
    public static String displayCourses() {
        String display = "";
        for (String courseName : Testing.courses.keySet()) {
            
            display += "\nCourse Name: " + courseName + "\n";
            for (int i = 0; i < Testing.courses.get(courseName).size(); i++) {
                display += (Testing.courses.get(courseName).get(i) + "\n");
            }
        }
        return display;
    }



    //toString for Course
    @Override
    public String toString() {
        return "Course{" + "courseName=" + courseName + ", trainees=" + trainees + '}';
    }

}
