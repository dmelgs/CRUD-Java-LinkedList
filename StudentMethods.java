
/**
 * Write a description of class StudentMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// Importing required classes
import java.util.LinkedList;
import java.util.Scanner;

public class StudentMethods
{
   //Declare empty linked list 
   LinkedList<Student> list;
   
   //Constructor
    public StudentMethods(){
        list = new LinkedList<>();
    }
    
    //add method
    //adding data into linked list
    public void addStudent(Student student){
        list.add(student);
    }
    
    //search id method
    public boolean findStudent(int ID){
        //iterate list using for loop
        for ( Student s : list){
            
            //check by id
            if(s.getID() == ID){
                System.out.println(s);
                return true;
            }
        }
        return false;
    }
    
    //delete method
    public void delStudent(int ID){
        //temp 
        Student delStudent = null;
        
        for (Student s : list){
             //check by id
            if(s.getID() == ID){
                delStudent = s;    
            }        
        }
        //check if id exists
        if(delStudent == null){    
            //Display message
            System.out.println("ID does not exist");
        }
        else{
            list.remove(delStudent);
            System.out.println("successfully removed!");
        }
    }
    
    //read/search method
    public Student searchStudent(int ID){
        
        for (Student s : list){
            
            if(s.getID() == ID){
                System.out.println(s);
                return s;
            }
        }
        return null;
    }
    
    //update method
    public void updateStudent(int ID){
        Scanner input = new Scanner(System.in);
        if(findStudent(ID)){
            Student stud = searchStudent(ID);
            
             // Display message only
            System.out.print(
                "What is the new Student id Number ? ");
            int student_Id = input.nextInt();
            input.nextLine();
              System.out.print(
                "What is the new Student Age ? ");
            int student_Age = input.nextInt();
            input.nextLine();
              System.out.print(
                "What is the new Student Course ? ");
            String student_Course = input.nextLine();
            System.out.print(
             "What is the new Student Year ? ");
            int student_Year = input.nextInt();
            
            stud.setID(student_Id);
            stud.setAge(student_Age);
            stud.setCourse(student_Course);
            stud.setYear(student_Year);
            System.out.print(
                "Updated!!! ? ");
        }
    }
    public void display(){
        
        if (list.isEmpty()) {
       
            System.out.println("The list has no records\n");
        }
        // Iterating Record list 
         for (Student s : list){
              System.out.println(s.toString());
        }
    }
}
