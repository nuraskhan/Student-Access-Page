package studentaccessportal;

import java.io.FileReader;
import java.io.IOException;

public class Employee_Show {
    //Showing details of Employee from local src of text files
    public void viewFile(String ID){
        int a = Integer.parseInt(ID);
        try(FileReader file = new FileReader("file"+ID+".txt");){
            int character;
            while((character=file.read()) != -1){
                System.out.print((char)character);
            }
        }catch (IOException e){
            System.out.println("File not found");;
        }
    }
}
