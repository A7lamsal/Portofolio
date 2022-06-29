

import java.util.*;

public class Student extends People
{
    private int weight; //weight of student
    private Date AdmissionDate; // Admission date of student
    private int Section; //Section nummber
    private int year; // year date of student's admission 
    
    Student() // default constructor
    {
       AdmissionDate= new Date(); 
    }
    Student(String Name, int Id,int Age) //constructor with values
    {
       this(Name,Id,0,Age,0,false);
    }
   
    Student(String Name, int Id, int weight,int Age, int year, boolean isFemale) //constructor with values
    {
        super(Name,Id,Age,isFemale);
        this.weight=weight;
        this.year = year;
        AdmissionDate= new Date();
    }
    
    public int getweight() //getter of weight
    {
        return this.weight;
    }
    public void setweight(int weight) // setter of weight
    {
        this.weight=weight;
    }
    
    public Date getAdmissionDate() // getter of AdmissionDate
    {
        return this.AdmissionDate;
    }

    public int getyear() // getter of year
    {
        return this.year;
    }

    public void setyear(int year) // setter of year
    {
        this.year = year;
    }

    public int getSection() // getter of section
    {
        return Section;
    }

    public void setSection(int Section) // setter of section
    {
        this.Section = Section;
    }
    
    //The below method helps to compare between two students
    @Override
    public boolean equals(Object o) {
        if (o instanceof People) {
            People p = (People) o;

            return (p.getId() == getId());

        }
        return false;
    }
    
    //toString for student
    @Override
   public String  DisplayPeople() {
        return toString();
    }
    
   //toString for student
   @Override
    public String toString() {
        return super.toString()  + "\tweight=" + weight  + "\tAdmissionDate="  + AdmissionDate + "\tyear=" + year + "\n" ;
    }
}
