package studentaccessportal;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee_Update {
    public void employee_Update(String a, String b, String c) throws IOException {
        Scanner input = new Scanner(System.in);
        int i = 0;
        float f=0;
        long l=0;



        File file = new File("file" + a + ".txt");
        boolean continueInput1 = true;
        do{
            try{
                b= input.nextLine();
                continueInput1 = false;
            }catch(InputMismatchException e){
                System.out.println("Try again. (Incorrect input: a String is required)");
                input.nextLine();
            }
        }while(continueInput1);
        System.out.println("Please enter the updated info");


        if (file.exists()) {

//            try (FileReader yep = new FileReader(file);) {
//                int character;
//                while ((character = yep.read()) != -1) {
//                    word.append((char) character);
//                }
//
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

            StringBuilder word = new StringBuilder();

            if (b.equals("Employee name")) {
                boolean continueInput2 = true;
                do{
                    try{
                        c = input.next();
                        continueInput2 = false;
                    }catch(InputMismatchException e){
                        System.out.println("Try again. (Incorrect input: a String is required)");
                        input.nextLine();
                    }
                }while(continueInput2);
                String a1 = "Employee name: "+c;
                try(FileReader fileread = new FileReader(file);
                    BufferedReader buffered = new BufferedReader(fileread)){

                    String line;
                    int lineNumber = 0;
                    while ((line = buffered.readLine()) != null) {
                        lineNumber++;

                        if (lineNumber != 1) {
                            word.append(line);
                            word.append("\n");
                        }else{
                            word.append(a1);
                            word.append("\n");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (b.equals("Employee age")) {
                boolean continueInput2 = true;
                do{
                    try{
                        i = input.nextInt();
                        continueInput2 = false;
                    }catch(InputMismatchException e){
                        System.out.println("Try again. (Incorrect input: an int is required)");
                        input.nextLine();
                    }
                }while(continueInput2);
                String a1 = "Employee age: "+i;
                try(FileReader fileread = new FileReader(file);
                    BufferedReader buffered = new BufferedReader(fileread)){

                    String line;
                    int lineNumber = 0;
                    while ((line = buffered.readLine()) != null) {
                        lineNumber++;
                        if (lineNumber != 2) {
                            word.append(line);
                            word.append("\n");
                        }else{
                            word.append(a1);
                            word.append("\n");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (b.equals("Employee ID")) {
                boolean continueInput2 = true;
                do{
                    try{
                        i = input.nextInt();
                        continueInput2 = false;
                    }catch(InputMismatchException e){
                        System.out.println("Try again. (Incorrect input: an Int is required)");
                        input.nextLine();
                    }
                }while(continueInput2);
                String a1 = "Employee ID: "+i;
                try(FileReader fileread = new FileReader(file);
                    BufferedReader buffered = new BufferedReader(fileread)){

                    String line;
                    int lineNumber = 0;
                    while ((line = buffered.readLine()) != null) {
                        lineNumber++;
                        if (lineNumber != 3) {
                            word.append(line);
                            word.append("\n");
                        }else{
                            word.append(a1);
                            word.append("\n");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (b.equals("Employee email")) {
                boolean continueInput2 = true;
                do{
                    try{
                        c = input.nextLine();
                        continueInput2 = false;
                    }catch(InputMismatchException e){
                        System.out.println("Try again. (Incorrect input: a String is required)");
                        input.nextLine();
                    }
                }while(continueInput2);
                String a1 = "Employee email: "+c;
                try(FileReader fileread = new FileReader(file);
                    BufferedReader buffered = new BufferedReader(fileread)){

                    String line;
                    int lineNumber = 0;
                    while ((line = buffered.readLine()) != null) {
                        lineNumber++;
                        if (lineNumber != 4) {
                            word.append(line);
                            word.append("\n");
                        }else{
                            word.append(a1);
                            word.append("\n");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (b.equals("Employee position")) {
                boolean continueInput2 = true;
                do{
                    try{
                        i = input.nextInt();
                        continueInput2 = false;
                    }catch(InputMismatchException e){
                        System.out.println("Try again. (Incorrect input: an int is required)");
                        input.nextLine();
                    }
                }while(continueInput2);
                String a1 = "Employee position: "+i;
                try(FileReader fileread = new FileReader(file);
                    BufferedReader buffered = new BufferedReader(fileread)){

                    String line;
                    int lineNumber = 0;
                    while ((line = buffered.readLine()) != null) {
                        lineNumber++;
                        if (lineNumber != 5) {
                            word.append(line);
                            word.append("\n");
                        }else{
                            word.append(a1);
                            word.append("\n");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (b.equals("Employee contact")) {
                boolean continueInput2 = true;
                do{
                    try{
                        l = input.nextInt();
                        continueInput2 = false;
                    }catch(InputMismatchException e){
                        System.out.println("Try again. (Incorrect input: a Long is required)");
                        input.nextLine();
                    }
                }while(continueInput2);
                String a1 = "Employee contact: "+l;
                try(FileReader fileread = new FileReader(file);
                    BufferedReader buffered = new BufferedReader(fileread)){

                    String line;
                    int lineNumber = 0;
                    while ((line = buffered.readLine()) != null) {
                        lineNumber++;
                        if (lineNumber != 6) {
                            word.append(line);
                            word.append("\n");
                        }else{
                            word.append(a1);
                            word.append("\n");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (b.equals("Employee salary")) {
                boolean continueInput2 = true;
                do{
                    try{
                        f = input.nextInt();
                        continueInput2 = false;
                    }catch(InputMismatchException e){
                        System.out.println("Try again. (Incorrect input: a float is required)");
                        input.nextLine();
                    }
                }while(continueInput2);
                String a1 = "Employee salary: "+f;
                try(FileReader fileread = new FileReader(file);
                    BufferedReader buffered = new BufferedReader(fileread)){

                    String line;
                    int lineNumber = 0;
                    while ((line = buffered.readLine()) != null) {
                        lineNumber++;
                        if (lineNumber != 7) {
                            word.append(line);
                            word.append("\n");
                        }else{
                            word.append(a1);
                            word.append("\n");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }



            if(b.equals("Employee ID")){
                FileWriter writer1 = null;
                String word1 = "ID was updated to "+i+" ";

                try{
                    writer1 = new FileWriter(file);
                    for(int j = 0; j< word1.length(); j++){
                        writer1.write(word1.charAt(j));
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    writer1.close();
                }

                File fileUpd = new File("file" + i + ".txt");
                FileWriter writer = null;
                try{
                    writer = new FileWriter(fileUpd);
                    for(int j = 0; j< word.length(); j++){
                        writer.write(word.charAt(j));
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    writer.close();
                }



            }else{
                FileWriter writer = null;
                try{
                    writer = new FileWriter(file);
                    for(int j = 0; j< word.length(); j++){
                        writer.write(word.charAt(j));
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    writer.close();
                }
            }






        }else{
            System.out.println("User not found");
        }
    }
}
