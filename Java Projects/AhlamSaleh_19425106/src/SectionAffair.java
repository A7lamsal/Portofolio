


import java.util.*;


public class SectionAffair 
{

    //The below method helps to add section in the Sections list 
    public static void addSection(ArrayList<Section> sections)
    {
        Section sec = Informations.SectionInfo();

        boolean Exists = false;

        for (Section section : sections) 
        {
            if (section.equals(sec)) 
            {
                System.out.println("Section already available, Section not added");
                Exists = true;
                break;

            }
        }
        if (Exists == false) 
        {
            Instructor inst = Informations.InstructorInfo();

            sec.setInst(inst);
            sections.add(sec);
            System.out.println("Section is added sucessfully!!");

        }
        
    }
    
    //The below method helps to add section in the Sections list 
    public static void addSection(ArrayList<Section> sections, Section sec)
    {
        

        boolean Exists = false;

        for (Section section : sections) 
        {
            if (section.equals(sec)) 
            {
                System.out.println("Section already available, Section not added");
                Exists = true;
                break;

            }
        }
        if (Exists == false) 
        {
            
            sections.add(sec);
            System.out.println("Section is added sucessfully!!");

        }
        
    }
    
    
    /*The below method helps to Search 
    for a specific section */
    public static void SearchSection(ArrayList<Section> sections, String Operation) 
    {
        Section sec = Informations.SectionInfo();

        boolean SectionNotExist = true;
        for (Section section : sections)
        {
            if (section.equals(sec))
            {
                sec = section;

                if (Operation.equals("Remove"))
                {
                    SectionAffair.removeStudent(Informations.StudentInfo(section.getSection(), "remove"), sec);

                }
                SectionNotExist = false;
            }
        }
        if (Operation.equals("Adding")) 
        {
            if (!SectionNotExist) {

                SectionAffair.addStudentSection(sec);

            } else {

                System.out.println("This section is not available");
            }
        } 
        else if (Operation.equals("Remove") && SectionNotExist) 
        {

            System.out.println("This section is not available");
        }
        
    }
    
    //The below method helps to add student in the Sections list 
    public static void addStudentSection(Section sec ) 
    {
        Student stu = Informations.StudentInfo(sec.getSection(), "Adding");
        sec.addStudent(sec, stu);
        System.out.println(sec);
        
    }

    //The below method helps to remove a specific student from the specific Section 
    public static void removeStudent(Student stu, Section sec) 
    {

        boolean removes = false;
        for (int i = 0; i < sec.getStudents().size(); i++) 
        {
            
            if (sec.getStudents().get(i).equals(stu)) {

                sec.getStudents().remove(i);
                System.out.println("Student removed successfully");
                removes = true;
                break;
            }
        }
        if (removes == false) 
        {
            System.out.println("Student cant be removed, Student not available");
        }
       
    }
    
    /*The below method helps to calculate  the average number 
      of students per section of a specified course */
    public static void AverageStudent(ArrayList<Section> sections,  String CourseCode) 
    {
        int SectionCount = 0;
        double total = 0;
        double av;
        
        
        for (Section section : sections) 
        {
            if (section.getCourseCode().equals(CourseCode))
            {
                
                total += section.getStudents().size();
                
                SectionCount++;
                
            }
        }

        
        if (SectionCount == 0)
            {
                System.out.println("Section is not available and CourseCode produced not available.");
            } 
            else 
            {
                System.out.println("The total number of students are:" + total);System.out.println("The number of sections are:" + SectionCount);
                av = total / SectionCount;
                System.out.println("The Average number of students per section of a specified course " + av);
            }

        
        
    }
    
    /*The below method helps to calculate  the average number 
      of students per section of a specified course */
    public static void AverageStudent(ArrayList<Section> sections)
    {
        System.out.println("Enter Course Code:");
        String CourseCode = Data.input.next();
        AverageStudent(sections,CourseCode);

    }

    /*The below method helps to display all sections 
      offered in the current semester and helps to sort the sections 
    and courses in order.*/
    public static void DisplaySection(ArrayList<Section> sections)
    {
        ArrayList<String> courses = new ArrayList<String>();
        ArrayList<String> section = new ArrayList<String>();
        String c = " ";

        for (Section sec : sections)
        {
            if (!courses.contains(sec.getCourseCode()))
            {
                courses.add(sec.getCourseCode());
            }
        }

        Collections.sort(courses);
        for (String course : courses) 
        {
            section = new ArrayList<String>();
            for (Section sec1 : sections)
            {

                if (sec1.getCourseCode().equals(course))
                {
                    section.add(sec1.getSection() + "");
                }
            }
            Collections.sort(section);
            System.out.println(" The available sections of the course" + " " + course + " are:"  + section);

        }
        

    }

    
}
