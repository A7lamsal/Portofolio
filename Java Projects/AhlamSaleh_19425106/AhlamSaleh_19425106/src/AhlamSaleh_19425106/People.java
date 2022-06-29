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
public abstract class People {
    private String Name;
    private int Id;
    private int Age;
    private boolean isFemale;

    People() {

    }

    public People(String Name, int Id, int Age, boolean isFemale) {
        this.Name = Name;
        this.Id = Id;
        this.Age = Age;
        this.isFemale = isFemale;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public boolean gender() {
        return this.isFemale;
    }

    public void setgender(boolean isFemale) {
        this.isFemale = isFemale;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof People) {
            People p = (People) o;

            return (p.getId() == this.Id && p.getName().equals(this.Name) && p.getAge() == this.Age && p.gender() == this.gender());

        }
        return false;
    }

    @Override
    public String toString() {
        return "Name=" + Name  +  "\nId=" + Id + "\nAge=" + Age + "\nisFemale=" + isFemale ;
    }

}
