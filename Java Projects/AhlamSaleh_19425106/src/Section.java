


import java.util.*;

public class Section 
{
    
    // below are the attributes used in the code.
    private int SectionNo; //Section nummber
    private String CourseCode; // Course code
    private Instructor Inst = new Instructor(); //instructor to teach the course
    private ArrayList<Student> Students = new ArrayList<Student>(); // list of student in the section
    private static final int MAXIMUM= 4; // maximum limit of students per section
    private int LectureTime; // Leture time or period
    private Date Date; // Date of registration in the section  

    Section() // default constructor
    {
        this(0, null, null, 0);

    }

    public Section(int SectionNo, String CourseCode, int LectureTime) //constructor with values
    {
        this(SectionNo, CourseCode, null, LectureTime);

    }

    public Section(int SectionNo, String CourseCode, Instructor Inst, int LectureTime) //constructor with values
    {
        this.SectionNo = SectionNo;
        this.CourseCode = CourseCode;
        this.Inst = Inst;
        this.LectureTime = LectureTime;
        Date = new Date();

    }

    public int getSection() // Getter of Section 
    {
        return this.SectionNo;
    }

    public void setSection(int SectionNo) // setter of Section 
    {
        this.SectionNo = SectionNo;
    }

    public String getCourseCode() // getter of Course code
    {
        return this.CourseCode;
    }

    public void setCourseCode(String CourseCode) // Setter of course code
    {
        this.CourseCode = CourseCode;
    }

    public Instructor getInst() // getter of Instructor
    {
        return this.Inst;
    }

    public void setInst(Instructor Inst)// setter of instructor
    {
        this.Inst = Inst;
    }

    public int getLectureTime() // getter of lecture time
    {
        return LectureTime;
    }

    public void setLectureTime(int LectureTime) // setter of lecture time 
    {
        this.LectureTime = LectureTime;
    }

    public Date getDate() // getter of Date of registration in the section
    {
        return this.Date;
    }

    public ArrayList<Student> getStudents() // getter of students list
    {
        return this.Students;
    }



    //The below method helps to add student in the Students list  
    public static void addStudent(Section section, Student stu)
    {
        boolean Exists = false;
        if (section.getStudents().size() >= MAXIMUM)
        {
            System.out.println("The section is full, can't add students.");

        }
        else 
        {
            for (Student Stud : section.getStudents())
            {
                if (Stud.equals(stu)) {
                    System.out.println("Cannot add students with same Id twice!!");
                    Exists = true;
                    break;
                }
            }
            if (Exists == false) 
            {
                section.getStudents().add(stu);
                System.out.println("Student added successfully");
            }
        }
    }


    /* The below method helps to display 
    the information of the students.*/
    public String DisplayStudents() 
    {
        String DisplayStudent = "";

        for (Student Stud : Students) {
            DisplayStudent += Stud.DisplayPeople();

        }
        return DisplayStudent;
    }

    //The below methods helps to compare between two sections
    @Override
    public boolean equals(Object o)
    {
        if (o instanceof Section) 
        {
            Section sc = (Section) o;

            return sc.getCourseCode().equals(this.CourseCode) && sc.getSection() == this.SectionNo;

        }
        return false;
    }

    //toString for section
    @Override
    public String toString()
    {
        return "\n----------------------------------\n" + "SectionNo=" + this.getSection() + "\tCourseCode=" + this.getCourseCode()
                + "\nLectureTime=" + this.getLectureTime() + "\tDate=" + Date 
                + "\nInstructor:-\n" + getInst() + "\nStudents:-\n" + DisplayStudents()
                +"\n----------------------------------\n";
    }

}
