
import java.util.ArrayList;
import java.util.TreeMap;

public class Informations {

    public TreeMap<String, ArrayList<String>> courses = new TreeMap<>();

    public static void add(String st, String key, TreeMap<String, ArrayList<String>> _courses) {
        boolean isExist = false;
        for (String nkey : _courses.keySet()) {
            if (nkey.equals(key)) {
                if (_courses.get(nkey).equals(st)) {
                    System.out.println("error");
                }
                isExist = true;
                break;
            }
        }
        if (isExist == false) {
            if (_courses.get(key) != null) {
                _courses.get(key).add(st);
            } else {
                _courses.put(key, new ArrayList<String>());
                _courses.get(key).add(st);

            }
        }
    }

    /*The below method helps to collect the 
    Section's information */
    public static Section SectionInfo() {

        System.out.println("-------Entering all Section's information-------");
        System.out.println("1- Enter Section no:");
        int SectionNo = Data.input.nextInt();
        System.out.println("2- Enter Course Code:");
        String CourseCode = Data.input.next();
        System.out.println("3-Enter lecture time:");
        int LectureTime = Data.input.nextInt();
        Section Info = new Section(SectionNo, CourseCode, LectureTime);
        return Info;
    }

    /*The below method helps to collect the 
    Student's information */
    public static Student StudentInfo(int Section, String Operation) {
        System.out.println("-------Entering all Student's information-------");
        System.out.println("1- Enter Student Name:");
        String Name = Data.input.next();
        System.out.println("2- Enter Student Id:");
        int Id = Data.input.nextInt();
        System.out.println("3-Enter Student age:");
        int Age = Data.input.nextInt();
        if (Operation.equals("Adding")) {
            System.out.println("4-Enter Student weight:");
            int weight = Data.input.nextInt();
            System.out.println("5- Enter Student Year:");
            int year = Data.input.nextInt();
            System.out.println("6-Enter if student is Female");
            boolean isFemale = Data.input.nextBoolean();
            Student stu = new Student(Name, Id, weight, Age, year, isFemale);
            return stu;
        } else {
            return new Student(Name, Id, Age);
        }

    }

    /*The below method helps to collect the 
    Instructor's information */
    public static Instructor InstructorInfo() {
        System.out.println("-------Entering all Instructor's information-------");
        System.out.println("1-Enter instructor's name:");
        String Name = Data.input.next();
        System.out.println("2- Enter instructor's  Id:");
        int Id = Data.input.nextInt();
        System.out.println("3-Enter instructor's age:");
        int Age = Data.input.nextInt();
        System.out.println("4-Enter  instructor's height");
        int height = Data.input.nextInt();
        System.out.println("5-Enter instructor's Email Id:");
        String Email = Data.input.next();
        System.out.println("6-Enter if instructor's isFemale");
        boolean isFemale = Data.input.nextBoolean();
        System.out.println("7-Enter if instructor's isEngineer");
        boolean isEngineer = Data.input.nextBoolean();
        Instructor inst = new Instructor(Name, Id, Age, height, Email, isFemale, isEngineer);
        return inst;

    }

}
