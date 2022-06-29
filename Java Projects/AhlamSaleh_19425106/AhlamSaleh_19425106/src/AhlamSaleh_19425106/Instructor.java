/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhlamSaleh_19425106;

/**
 *
 * @author AHLAM
 */
public class Instructor extends People
{
    private int height;
    private boolean isEngineer;
    public Instructor()
    {
        
    }
    

    public Instructor(String Name, int Id, int Age, boolean isFemale,int height, boolean isEngineer)
    {
        super(Name,Id,Age,isFemale);
        this.height = height;
        this.isEngineer = isEngineer;
    }
    
    public int getheight()
    {
        return this.height;
    }
    public void setheight(int height)
    {
        this.height=height;
    }  

    public boolean isEngineer() {
        return this.isEngineer;
    }

    public void setIsEngineer(boolean isEngineer) {
        this.isEngineer = isEngineer;
    }
    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Instructor)
        {
            Instructor i=(Instructor)o;
            if(super.equals(i))
            {
                return i.getheight()==this.height && i.isEngineer()==this.isEngineer ;
            }
        }
        return false;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nheight=" + height + "\nisEngineer=" + isEngineer ;
    }
}
