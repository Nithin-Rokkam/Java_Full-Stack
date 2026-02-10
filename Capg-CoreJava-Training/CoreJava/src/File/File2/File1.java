package File.File2;

import java.io.*;

public class File1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("Capgemini/src/File/File2/f1");
            File f2 = new File("Capgemini/src/File/File2/f2/f3/f4");
            
            if(f1.mkdirs()){
                System.out.println("f1 directory created successfully");
            }else{
                System.out.println("Failed to create f1 directory");
            }
            
            if(f2.mkdirs()){
                System.out.println("f2 directory created successfully");
            }else{
                System.out.println("Failed to create f2 directory");
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
