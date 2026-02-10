package File.File2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        File f=new File("Capgemini/src/File/File2/fnew/f.txt");
        
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(f))){
            bw.write("Hello World");
            System.out.println("File written successfully");
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
