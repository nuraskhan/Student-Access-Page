package studentaccessportal;

import java.io.File;

public class Employee_Remove implements Remove{
    //Removing file of saved employee
    public void removeFile(int ID){
        File rem = new File("file"+ID+".txt");
        if(rem.exists()){
            if(rem.delete()==true){
                System.out.println("\nEmployee has been removed Successfully");
            }else{
                System.out.println("\nProblems with deleting");
            }
        }else{
            System.out.println("\nEmployee does not exists :( ");
        }
    }
}
