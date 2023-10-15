import studentaccessportal.*;

import java.io.IOException;
import java.util.Scanner;

class EmployManagementSystem {

    public static void main(String[] args) throws IOException {
        menu();
    }
    public static void menu() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1: Add an Employee Details");
        System.out.println("Press 2: See an Employee Details");
        System.out.println("Press 3: Remove an Employee");
        System.out.println("Press 4: Update Employee Details");
        System.out.println("Press 5: exit the ems portal");
        System.out.println("Please enter choice:");
        while(true){
            int choice = input.nextInt();
            if(choice == 1){
                Employee_Add nur = new Employee_Add();
                nur.employee_detail();
                nur.createFile();
                System.out.println("\n---------------------------------");
                System.out.println("Press 1: Add an Employee Details");
                System.out.println("Press 2: See an Employee Details");
                System.out.println("Press 3: Remove an Employee");
                System.out.println("Press 4: Update Employee Details");
                System.out.println("Press 5: exit the ems portal");
                System.out.println("Please enter choice:");
            }else if(choice == 2){
                System.out.println("Please Enter Employee's ID:");
                int ID = input.nextInt();
                (new Employee_Show()).viewFile(ID+"");
                System.out.println("\n---------------------------------");
                System.out.println("Press 1: Add an Employee Details");
                System.out.println("Press 2: See an Employee Details");
                System.out.println("Press 3: Remove an Employee");
                System.out.println("Press 4: Update Employee Details");
                System.out.println("Press 5: exit the ems portal");
                System.out.println("Please enter choice:");
            }else if(choice == 3) {
                System.out.println("Please Enter Employee's ID:");
                int ID = input.nextInt();
                (new Employee_Remove()).removeFile(ID);
                System.out.println("\n---------------------------------");
                System.out.println("Press 1: Add an Employee Details");
                System.out.println("Press 2: See an Employee Details");
                System.out.println("Press 3: Remove an Employee");
                System.out.println("Press 4: Update Employee Details");
                System.out.println("Press 5: exit the ems portal");
                System.out.println("Please enter choice:");
            }else if(choice == 4){
                System.out.println("Please enter the employee's ID:");
                String a = input.next();
                (new Employee_Show()).viewFile(a);
                System.out.println();
                System.out.println("Please enter the detail you want to Update:");
                System.out.println("For example");
                System.out.println("If you want to change the name, then enter Current name and press enter. Then write the new Name then press enter.It will update name");
                String b = null,c = null;
                (new Employee_Update()).employee_Update(a,b,c);
                System.out.println("\n---------------------------------");
                System.out.println("Press 1: Add an Employee Details");
                System.out.println("Press 2: See an Employee Details");
                System.out.println("Press 3: Remove an Employee");
                System.out.println("Press 4: Update Employee Details");
                System.out.println("Press 5: exit the ems portal");
                System.out.println("Please enter choice:");
            }else if(choice ==5){
                System.out.println("Thank you for sharing details");
                (new CodeExit()).out();
            }
        }
    }
}
