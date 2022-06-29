
import java.util.Objects;

public class Trainee implements Comparable<Trainee> {

    private String name; //Name of trainee
    private int nationalID; // Id of trainee
    private String branch; //Branch of trainee
    private boolean isFemale;  //gender of trainee
    private String email; // Email Id of trainee

    public Trainee() // default constructor
    {

    }

    public Trainee(String name, int nationalID, String branch, boolean isFemale, String Email) //constructor with values
    {
        this.name = name;
        this.nationalID = nationalID;
        this.branch = branch;
        this.isFemale = isFemale;
        this.email = Email;
    }

    public Trainee(String name, int nationalID, String Email) //constructor with values
    {
        this.name = name;
        this.nationalID = nationalID;
        this.email = Email;
    }

    public String getName() //getter of Name
    {
        return name;
    }

    public void setName(String name) //Setter of name
    {
        this.name = name;
    }

    public int getNationalID() //getter of national ID
    {
        return nationalID;
    }

    public void setNationalID(int nationalID) //setter of national ID
    {
        this.nationalID = nationalID;
    }

    public String getBranch() // getter of branch
    {
        return branch;
    }

    public void setBranch(String branch) //setter of branch 
    {
        this.branch = branch;
    }

    public boolean isFemale() //getter of gender
    {
        return isFemale;
    }

    public void setIsFemale(boolean isFemale) //setter of gender
    {
        this.isFemale = isFemale;
    }

    public String getEmail() //getter of Emial
    {
        return email;
    }

    public void setEmail(String Email) // setter of Email
    {
        this.email = Email;
    }

    //The below method helps to compare between two trainee's ID
    @Override
    public int compareTo(Trainee trainee) {
        return this.nationalID == trainee.getNationalID() ? 0 : 1;
    }
    
    //The below method helps to compare between two trainee's
    @Override
    public boolean equals(Object o) {
        if (o instanceof Trainee) {
            Trainee t = (Trainee) o;

            return (t.getEmail().equals(this.email) && t.getNationalID() == this.nationalID && t.getName().equals(this.name));

        }
        return false;
    }

    //toString for Trainee
    @Override
    public String toString() {
        return "Trainee's name:" + this.getName() + "\t\t National ID:" + this.getNationalID()
                + "\t\t Branch:" + this.getBranch() + "\t\t Gender:" + this.isFemale + "\t\tEmail:" + this.getEmail();
    }

}
