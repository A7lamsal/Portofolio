
package AhlamSaleh_19425106;
import java.util.*;

public class Section 
{
   // below are the attributes used in the code.
    private int SectionNo;
    private String CourseCode;
    private Instructor Inst = new Instructor();
    private ArrayList<Student> Students = new ArrayList<Student>();
    private static final int maximum = 4;
    private int LectureTime;
    private Date Date;

    // 2 attributes
    Section() 
    {
        this(0,null,null,0);

    }
     public Section(int SectionNo, String CourseCode, int LectureTime)
     {
        this(SectionNo,CourseCode,null,LectureTime);
         
     }

    public Section(int SectionNo, String CourseCode, Instructor Inst, int LectureTime) {
        this.SectionNo = SectionNo;
        this.CourseCode = CourseCode;
        this.Inst = Inst;
        this.LectureTime = LectureTime;
        Date = new Date();
        

    }

    public int getSection() {
        return this.SectionNo;
    }

    public void setSection(int SectionNo) {
        this.SectionNo = SectionNo;
    }

    public String getCourseCode() {
        return this.CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public Instructor getInst() {
        return this.Inst;
    }

    public void setInst(Instructor Inst) {
        this.Inst = Inst;
    }

    public int getLectureTime() {
        return LectureTime;
    }

    public void setLectureTime(int LectureTime) {
        this.LectureTime = LectureTime;
    }

    public Date getDate() {
        return this.Date;
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }

    //The below method helps to add section in the Sections list 
    public static void addSection(ArrayList<Section> sections) 
    {
        System.out.println("1- Enter Section no:");
        int SectionNo = Data.input.nextInt();
        System.out.println("2- Enter Course Code:");
        String CourseCode = Data.input.nextLine();
        CourseCode = Data.input.nextLine();
        System.out.println("3-Enter lecture time:");
        int LectureTime=Data.input.nextInt();
        
        Section sec = new Section(SectionNo,CourseCode,LectureTime);
        boolean Exists=false;

        for (Section section : sections) {
            if (section.equals(sec)) {
                System.out.println("Section already available, Section not added");
                Exists=true;
                break;
                
            }
        }
        if(Exists==false)
        {
            sections.add(sec);
            System.out.println("Section is added");
        }

    }
    //The below method helps to add student in the Students list 
    public void addStudent(Student stu) {
        boolean Exists = false;
        if (Students.size() > maximum) {
            System.out.println("The section is full, can't add student.");

        } else {

            for (Student Stud : Students) {
                if (Stud.equals(stu)) {
                    System.out.println("Student is not added successfully");
                    Exists = true;
                    break;
                }

            }
            if (Exists == false) {
                Students.add(stu);
                System.out.println("Student added successfully");
            }

        }
    }
    //The below method helps to add student in the Sections list 
    public static void addStudentSection(Section sec) {
        
        System.out.println("1- Enter Student Name:");
        String Name = Data.input.nextLine();
        Name = Data.input.nextLine();
        System.out.println("2- Enter Student Id:");
        int Id = Data.input.nextInt();
        System.out.println("3- Enter Student Section:");
        int Section = Data.input.nextInt();
        System.out.println("4-Enter Student weight:");
        int weight= Data.input.nextInt();
        System.out.println("5-Enter Student age:");
        int Age= Data.input.nextInt();
        System.out.println("6-Enter if student is Female");
        boolean isFemale=Data.input.nextBoolean();
        System.out.println("7- Enter Student Year:");
        int year = Data.input.nextInt();
        Student stu = new Student(Name, Id,Section,  weight, Age, isFemale, year);
        sec.addStudent(stu);
     }
    
    //The below method helps to remove a specific student from the specific Section 
    public static void removeStudent(Student stu, Section sec) 
    {
        // for (Student Stu : sec.getStudents()) {
        //if (Stu.equals(Stu)) {
        boolean removes=false;
        for (int i = 0; i < sec.getStudents().size(); i++) 
        {
            if (sec.getStudents().get(i).equals(stu)) 
            {
                
                sec.getStudents().remove(i);
                System.out.println("Student removed successfully");
                removes=true;
                break;
            } 
        } if (removes==false) 
            {
                System.out.println("Student cant be removed, Student not available");
            }
    }
    
    /*The below method helps to calculate  the average number 
      of students per section of a specified course */ 
    public static void AverageStudent(ArrayList<Section> sections ,String CourseCode,int SectionNo)
    {
        
        int StudentCount=0;
        double total=0;
        double av;
        boolean Exists=false;
        for (Section section : sections)
        {
            if(section.getCourseCode().equals(CourseCode))
            {
               total+= section.getStudents().size();
               Exists=true;
               if(section.getSection()==SectionNo)
               {
                   StudentCount+=section.getStudents().size();
               }
            }
            
        } if(Exists==false)
        {
            System.out.println("CourseCode produced not available"); 
        }
        else 
        {
            if(StudentCount==0)
            {
                System.out.println("Section is not available or there is no student in the specfied section.");
            }
            else
            {
               av=total/StudentCount;
               System.out.println(" The Average number of students per section of a specified course " + av); 
            }
            

        }
    }
    
    //The below method helps to display all sections offered in the current semester 
    public static void DisplaySection(ArrayList<Section> sections ) 
    {
      ArrayList<String>courses= new ArrayList<String>();
      ArrayList<String>section= new ArrayList<String>();
      String c=" ";
      
      for(Section sec: sections)
      {
          if(!courses.contains(sec.getCourseCode()))
          {
              courses.add(sec.getCourseCode());
          }
          
      }
      Collections.sort(courses);
      for(String course: courses)
      {
          
          section= new ArrayList<String>();
          for(Section sec1: sections)
          {
              
              if(sec1.getCourseCode().equals(course))
              {
                 section.add(sec1.getSection()+ "");
              }
          }
          Collections.sort(section);
          System.out.println(course +" " + section ); 
       
      }
      
    }
    
    
    

    @Override
    public boolean equals(Object o) {
        if (o instanceof Section) {
            Section sc = (Section) o;

            return sc.getCourseCode().equals(this.CourseCode) && sc.getSection() == this.SectionNo && sc.getLectureTime()==this.LectureTime ;

        }
        return false;
    }

    @Override
    public String toString() {
        return "SectionNo=" + this.getSection()  + "\nCourseCode=" + this.getCourseCode()  + 
                "\nInst:-\n" + getInst()  + "\nStudents:-\n" + getStudents(); //   +
                //"\nLectureTime=" + this.getLectureTime()  +  "\nDate=" + Date ;
    }
 
}
