
/**
 * Write a description of class Student here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    //Variables
    private int ID;
    private String Name;
    private int Age;
    private char Sex;
    private String Course;
    private int Year;
    
    //Constructor Default
    public Student(){
        
    }
    
    // W/Parameter Constructor
    
    public Student(int ID, String Name, int Age, char Sex, String Course, int Year){
        
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
        this.Sex = Sex;
        this.Course = Course;
        this.Year = Year;
    
    }
    
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
     public int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    public char getSex(){
        return Sex;
    }
    public void setSex(char Sex){
        this.Sex = Sex;
    }
     public String getCourse(){
        return Course;
    }
    public void setCourse(String Course){
        this.Course = Course;
    }
     public int getYear(){
        return Year;
    }
    public void setYear(int Year){
        this.Year = Year;
    }
     @Override public String toString()
    {
        return "Student {" +  "ID = " + ID + "\n" +
             "Name = " + Name + "\n" +
             "Age = " + Age + "\n" +
             "Sex = " + Sex + "\n" +
             "Course = " + Course + "\n" +
            "Year = " + Year + "\n }";
    }
}

