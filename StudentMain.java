
/**
 * Write a description of class StudentMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

// Importing required classes
import java.util.Scanner;

public class StudentMain
{
    public static void main(String [] args){
        //create object/instance
        StudentMethods studmeth = new StudentMethods();
        
        Student stud = new Student();
   
        Scanner input = new Scanner(System.in);
        int option = 0;
         // Do - While loop
        do {
            menu();
            option = input.nextInt();
            switch(option){
                
                case 1: 
                        System.out.println("Student ID: ");
                        int student_ID = input.nextInt();
                        input.nextLine();
                        
                        System.out.println("Name: ");
                        String student_Name = input.nextLine();
                        
                        System.out.println("Age: ");
                        int student_Age = input.nextInt();
                        input.nextLine();
                        
                        System.out.println("Sex: ");
                        char student_Sex = input.next().charAt(0);
                        input.nextLine();
                        
                        System.out.println("Course: ");
                        String student_Course = input.nextLine();
                        
                        System.out.println("Year: ");
                        int student_Year = input.nextInt();
                        
                        //create stud obj and pass constructor
                        stud = new Student(student_ID, student_Name,
                        student_Age, student_Sex,student_Course, student_Year);
                        
                        //call addStudent()
                        studmeth.addStudent(stud);
                        System.out.println(stud.toString());
                        
                    break;
                
                case 2:
                        System.out.println("Student id to be deleted: ");
                        int d_ID = input.nextInt();  
                        studmeth.delStudent(d_ID);
                    break;
                    
                case 3:
                        System.out.println("Student id to be updated: ");
                        int u_ID = input.nextInt();
                        studmeth.updateStudent(u_ID);
                    break;
                    
                case 4:
                        System.out.println("Search Student id: ");
                        int s_ID = input.nextInt();
                        
                        if(!studmeth.findStudent(s_ID)){
                            System.out.println("Id does not exist ");
                        }
                    break;
                case 5:
                        studmeth.display();
                    break;
                case 9:
                     System.exit(0);
 
                    break;
                    
                // If none above case executes
                default:
                    // Print statement
                System.out.println("\nInvalid input\n");
                break;
            }
            
        }
        while(option != 9);
        
    } 
    
      public static void menu()
    {
 
        // Printing statements displaying menu on console
        System.out.println("\nMENU");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Update Student");
        System.out.println("4: Search Student");
        System.out.println("5: Display Students");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection : ");
    }
}
