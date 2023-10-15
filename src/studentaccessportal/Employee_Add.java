package studentaccessportal;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee_Add extends EmployeeDetail{
    // scanner for input = 'input'
    Scanner input = new Scanner(System.in);
    // general method from abstract-parent class
    // for entering and filling EmployeeDetail
    public void  employee_detail(){
        // Entering name
        System.out.println("Enter employee's name : ");
        boolean continueInput1 = true;
        do{
            try{
                name = input.next();
                continueInput1 = false;
            }catch(InputMismatchException e){
                System.out.println("Try again. (Incorrect input: a String is required)");
                input.nextLine();
            }
        }while(continueInput1);
        //Entering age
        System.out.println("Enter employee's age : ");
        boolean continueInput2 = true;
        do{
            try{
                age = input.nextInt();
                continueInput2 = false;
            }catch(InputMismatchException e){
                System.out.println("Try again. (Incorrect input: an int is required)");
                input.nextLine();
            }
        }while(continueInput2);
        //Entering ID
        System.out.println("Enter employee's ID : ");
        boolean continueInput3 = true;
        do{
            try{
                ID = input.nextInt();
                continueInput3 = false;
            }catch(InputMismatchException e){
                System.out.println("Try again. (Incorrect input: an int is required)");
                input.nextLine();
            }
        }while(continueInput3);
        //Entering email
        System.out.println("Enter employee's email : ");
        boolean continueInput4 = true;
        do{
            try{
                email = input.next();
                continueInput4 = false;
            }catch(InputMismatchException e){
                System.out.println("Try again. (Incorrect input: a String is required)");
                input.nextLine();
            }
        }while(continueInput4);
        //Entering position
        System.out.println("Enter employee's position :");
        boolean continueInput5 = true;
        do{
            try{
                position = input.nextInt();
                continueInput5 = false;
            }catch(InputMismatchException e){
                System.out.println("Try again. (Incorrect input: an int is required)");
                input.nextLine();
            }
        }while(continueInput5);
        //Entering contact
        System.out.println("Enter employee's contact : ");
        boolean continueInput6 = true;
        do{
            try{
                contact = input.nextLong();
                continueInput6 = false;
            }catch(InputMismatchException e){
                System.out.println("Try again. (Incorrect input: a long is required)");
                input.nextLine();
            }
        }while(continueInput6);
        //Entering salary
        System.out.println("Enter employee's salary : ");
        boolean continueInput7 = true;
        do{
            try{
                salary = input.nextFloat();
                continueInput7 = false;
            }catch(InputMismatchException e){
                System.out.println("Try again. (Incorrect input: a float is required)");
                input.nextLine();
            }
        }while(continueInput7);
        //Enter is finised. Employee added
    }
    // Creating file about EmployeeDetails
    public void createFile() throws IOException {
        File file = new File("file" + ID + ".txt");
        //format of adding file
        String yeah ="Employee name: " + name+
                "\nEmployee age: " + age+
                "\nEmployee ID: " + ID+
                "\nEmployee email: " + email
                +"\nEmployee position: " + position
                +"\nEmployee contact: " + contact+
                "\nEmployee salary: " + salary ;
        FileWriter writer = null;
        try {
            writer = new FileWriter("file" + ID + ".txt");
            for (int i = 0; i < yeah.length(); i++) {
                writer.write(yeah.charAt(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writer.close();
            System.out.println("Employee has been added:)");
        }
    }
}
