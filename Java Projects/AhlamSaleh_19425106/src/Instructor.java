


public class Instructor extends People
{
    // Below are the attributes used in this class
    private int height; // height of instructor
    private String Email; // Email Id of instructor 
    private boolean isEngineer; // if instructor isEngineer
    
    
    public Instructor() //default constructor 
    {
        
    }
    
    public Instructor(String Name, int Id, int Age, int height, String Email, boolean isFemale, boolean isEngineer) //constructor with values
    {
        super(Name,Id,Age,isFemale);
        this.height = height;
        this.Email=Email;
        this.isEngineer = isEngineer;
    }
    
    public int getheight() //getter of height
    {
        return this.height;
    }
    public void setheight(int height) //setter of height
    {
        this.height=height;
    }  

    public boolean isEngineer() // getter of isEngineer
    {
        return this.isEngineer;
    }

    public void setIsEngineer(boolean isEngineer) // setter of isEngineeer
    {
        this.isEngineer = isEngineer;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    //toString for instructor
    @Override
   public String  DisplayPeople()
    {
        return toString();
    }
   
    //The below methods helps to compare between two instructor's
    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Instructor)
        {
            Instructor i=(Instructor)o;
            if(super.equals(i))
            {
                return i.getheight()==this.height && i.isEngineer()==this.isEngineer && i.getEmail().equals(this.Email);
            }
        }
        return false;
    }
  
   //toString for instructor 
   @Override
    public String toString()
    {
        return super.toString() + "\theight=" + height + "\tEmail="+ Email + "\tisEngineer=" + isEngineer  ;
    }
}
