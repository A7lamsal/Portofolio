

import java.util.*;
import java.io.*;

public class Data
{
    static ArrayList<Section> sections=new ArrayList<Section>(); //list of sections
    static Scanner input=new Scanner(System.in); // used for the user to input valuses
    
     public static void main(String[] args)
     {
         
         System.out.println("Hello programmer!!");
         Performing(sections);
   }
    
    //The below method helps to save the data in a Text file
    public static void SaveText(ArrayList<Section> sections) 
    {   
        try 
        {
            File f=new File("src\\Data.txt");
            PrintWriter pw= new PrintWriter(f);
            for(Section section: sections)
            {
                pw.println(section);
                
                
            }
            pw.close();
        } 
        catch(Exception e)
        {
            System.out.println("Error"+ e); 
        }
        
    }
    
    /*The below method helps to ask the user about
    the operation he/she wants to use*/
    public static void Performing(ArrayList<Section>sections)
     {
         System.out.println("Which operation would you like to use:"+"\n1-Adding of new Sections\n"
                 +"2-Adding of Students\n"
                 +"3-Removal of Students\n"
                 +"4-The average no.of Students per section\n"
                 +"5-Displaying of all sections\n"
                 +"6-Saving all registration data\n"
                 +"7-Try ready made program\n"
                 +"\nChoose 1 to 7:" );
         int value=input.nextInt();
         switch (value)
                 {
             
                     case 1:
                         System.out.println("-------Adding of new Sections-------\n\n");
                         SectionAffair.addSection(sections);
                         Continue(sections);
                         break;
                     case 2:
                         System.out.println("-------Adding of Students-------\n\n");
                         SectionAffair.SearchSection(sections,"Adding");
                         Continue(sections);
                         break;
                     case 3:
                         System.out.println("-------Removal of Students-------\n\n");
                         SectionAffair.SearchSection(sections, "Remove");
                         Continue(sections);
                         break;
                     case 4:
                         System.out.println("-------The average no.of Students per section-------\n\n");
                         SectionAffair.AverageStudent(sections);
                         Continue(sections);
                         break;
                     case 5: 
                         System.out.println("-------Displaying of all sections-------\n\n");
                         SectionAffair.DisplaySection(sections);
                         Continue(sections);
                         break;
                     case 6:
                         System.out.println("-------Saving all registration data-------\n\n");
                         Data.SaveText(sections);
                         Continue(sections);
                         break;
                     case 7: 
                         Test(sections);
                         Continue(sections);
                         break;
                     default:
                         Continue(sections);
                         break;
                 }
     }
    
    /* The below method helps to ask the user if
    he/she wants to continue the operation*/
    public static void Continue(ArrayList<Section>sections)
     {
         System.out.println("Would you like to continue??"+"\n Enter yes or no:");
         String answer=input.next().toLowerCase();
         if(answer.equals("yes"))
         {
             Performing(sections);
         }
         else if(answer.equals("no"))
         {
             System.out.println("Thank you for trying the program!!");
         }
         else Continue(sections);
         
     }
    
    /* The below method helps to show the 
    program ready made */ 
    public static void Test( ArrayList<Section> sections)
     {
       
       Instructor S=new Instructor("Sally",112233,32,155,"s.almanasra@arabou.edu.sa",true,true);
       Instructor M=new Instructor("Mohammed",445566,34,170,"m.alzahrani@arabou.edu.sa",false,true);
       Instructor T=new Instructor("Turki",778899,35,173,"statmusk@gmail.com",false,true);
      
       Section sec1=new Section(1301,"M251",S,2);
       Section sec2=new Section(1309,"M251",S,3);
       Section sec3=new Section(1303,"M131",M,1);
       Section sec4=new Section(1304,"M132",T,1);
       Section sec5=new Section(1308,"M131",M,1);
       Section sec6=new Section(1305,"M131",M,1);
       Section sec7=new Section(1307,"M131",M,1);
       
       
       Student s1=new Student("Ahlam",10,50,20,2019,true);
       Student s2=new Student("Saleh",14,55,20,2019,false);
       Student s3=new Student("Wafa",17,60,20,2019,true);
       Student s4=new Student("Osama",15,65,20,2019,false);
       Student s5=new Student("Sara",19,62,20,2019,true);
       Student s6=new Student("Turki",20,85,20,2019,false);
       
       System.out.println("\n------Offering a new section------\n");
       SectionAffair.addSection(sections,sec1);
       SectionAffair.addSection(sections,sec2);
       SectionAffair.addSection(sections,sec3);
       SectionAffair.addSection(sections,sec3);
       SectionAffair.addSection(sections,sec4);
       SectionAffair.addSection(sections,sec5);
       SectionAffair.addSection(sections,sec6);
       SectionAffair.addSection(sections,sec7);
       
       System.out.println("\n------Adding a student from a specified section------\n");
       Section.addStudent(sec1, s1);
       Section.addStudent(sec1, s6);
       Section.addStudent(sec1, s2);
       Section.addStudent(sec1, s3);
       Section.addStudent(sec1, s4);
       Section.addStudent(sec1, s5);
       
       
       System.out.println("\n------Adding a student from a specified section------\n");
       Section.addStudent(sec2, s1);
       Section.addStudent(sec2, s6);
       Section.addStudent(sec2, s2);
       Section.addStudent(sec2, s3);
       
       System.out.println("\n------Adding a student from a specified section------\n");
       Section.addStudent(sec3, s4);
       Section.addStudent(sec3, s5);
       Section.addStudent(sec3, s6);
       
       
       
       System.out.println("\n------Adding a student from a specified section------\n");
       Section.addStudent(sec4, s1);
       Section.addStudent(sec4, s6);
       
       
       System.out.println("\n------Adding a student from a specified section------\n");
       Section.addStudent(sec5, s4);
       Section.addStudent(sec5, s5);
       Section.addStudent(sec5, s6);
       Section.addStudent(sec5, s2);
       
       System.out.println("\n------Adding a student from a specified section------\n");
       Section.addStudent(sec6, s1);
       Section.addStudent(sec6, s6);
       Section.addStudent(sec6, s2);
       Section.addStudent(sec6, s3);
       Section.addStudent(sec6, s4);
       
       System.out.println("\n------Removing a student from a specified section------\n");
       SectionAffair.removeStudent(s3, sec1);
       SectionAffair.removeStudent(s1, sec1);
       
       System.out.println("\n------Removing a student from a specified section------\n");
       SectionAffair.removeStudent(s2, sec2);
       
       System.out.println("\n------Removing a student from a specified section------\n");
       SectionAffair.removeStudent(s3, sec3);
       SectionAffair.removeStudent(s1, sec3);
       SectionAffair.removeStudent(s4, sec3);
       
       
       System.out.println("\n------Average number of students per section of a specified course------\n");
       SectionAffair.AverageStudent(sections,"M131");
       
       System.out.println("\n------Displaying all sections offered in the current semester:------\n");
       SectionAffair.DisplaySection(sections);
       
       System.out.println("\n------Saving all the registration data into a text file------\n");
       Data.SaveText(sections);
       
      
      }
    
}
