package entity;
/**
 *
 * @author Gokhan
 */
public class Prospects 
{
    private int ID;
    private String firstName;
    private String lastName;
    private String college;
    private String nhlTeam;
    private String age;
    private String position;
    private String draftSelection;
    //private String position
    
    public Prospects(int ID, String firstName, String lastName, String college, String nhlTeam, String age, String position, String draftSelection)
    {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.college = college;
        this.nhlTeam = nhlTeam;
        this.age = age;
        this.position = position;
        this.draftSelection = draftSelection;
    }

    public int getID() {
        return ID;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getCollege() {
        return college;
    }

    public String getNHLTeam() {
        return nhlTeam;
    }
    
    public String getAge(){
        return age;
    }
    
    public String getPosition(){
        return position;
    }
    
    public String getDraftSelection(){
        return draftSelection;
    }
    
    /*
    public String getPosition(){
    }
    */

    @Override
    public String toString() {
        return "Prospects{" + "ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + ", college=" + college + ", nhlTeam=" + nhlTeam + ", age=" + age + ", position=" + position + ", draftSelection=" + draftSelection +'}';
    }
}
