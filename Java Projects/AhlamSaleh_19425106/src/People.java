


public abstract class People {
    
    // Below are the attributes used in this class
    private String Name; //Name of student
    private int Id; // Id of student
    private int Age; // Age of student
    private boolean isFemale; // gender of student

    People() // default constructor
    {
     
    }

    public People(String Name, int Id, int Age, boolean isFemale) //constructor with values
    {
        this.Name = Name;  
        this.Id = Id; 
        this.Age = Age; 
        this.isFemale = isFemale; 
    }

    public String getName() // getter of name
    {
        return this.Name;
    }

    public void setName(String Name) // setter of name 
    {
        this.Name = Name;
    }

    public int getId() // getter of Id
    {
        return this.Id;
    }

    public void setId(int Id) // setter of Id
    {
        this.Id = Id;
    }

    public int getAge() // getter of Age
    {
        return this.Age;
    }

    public void setAge(int Age) // setter of Age
    {
        this.Age = Age;
    }

    public boolean getgender() //getter of gender
    {
        return this.isFemale;
    }

    public void setgender(boolean isFemale) //setter of gender
    {
        this.isFemale = isFemale;
    }
    
    public abstract String DisplayPeople(); // empty abstract method
    
    //The below method helps to compare between two students
    @Override
    public boolean equals(Object o) {
        if (o instanceof People) {
            People p = (People) o;

            return (p.getId() == this.Id && p.getName().equals(this.Name) && p.getAge() == this.Age );

        }
        return false;
    }

    //toString for student
    @Override
    public String toString() {
        return "Name=" + Name  +  "\tId=" + Id + "\tAge=" + Age + "\tisFemale=" + isFemale ;
    }

}
