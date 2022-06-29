/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhlamSaleh_19425106;
import java.util.*;
/**
 *
 * @author AHLAM
 */
public class Student extends People
{
    private int weight;
    private Date AdmissionDate;
    private int year;
    private int Section;
    Student()
    {
       AdmissionDate= new Date(); 
    }
   
    Student(String Name, int Id, int Section,  int weight,int Age,boolean isFemale, int year)
    {
        
        super(Name,Id,Age,isFemale);
        this.weight=weight;
        this.year = year;
        this.Section=Section;
        AdmissionDate= new Date();
        

    }
    
    public int getweight()
    {
        return this.weight;
    }
    public void setweight(int weight)
    {
        this.weight=weight;
    }
    
    public Date getAdmissionDate()
    {
        return this.AdmissionDate;
    }

    public int getyear() {
        return this.year;
    }

    public void setyear(int year) {
        this.year = year;
    }

    public int getSection() {
        return Section;
    }

    public void setSection(int Section) {
        this.Section = Section;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Student)
        {
            Student s=(Student)o;
            /* if(super.equals(s)) */
            {
                return s.getweight() == this.weight && s.getAdmissionDate().equals(this.AdmissionDate)&&  s.getyear()==(this.year);
            }
        }
        return false;
    } 
    
    @Override
    public String toString() {
        return super.toString()  + "\nweight=" + weight  + "\nAdmissionDate="  + AdmissionDate + "\nyear=" + year ;
    }
}
