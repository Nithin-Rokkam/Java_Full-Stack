package File.File2;

import java.io.File;
import java.io.IOException;

public class RenameFile {
    public static void main(String[] args) throws IOException{
        File f=new File("Capgemini/src/File/File2/fnew/");
        if(!f.exists()){
            throw new IOException("Directory does not exist");
        }else{
            System.out.println("Directory exists");
        }

        if(!f.renameTo(new File("Capgemini/src/File/File2/fnew/"))){
            throw new IOException("Directory not renamed");
        }else{
            System.out.println("Directory renamed successfully");
        }
    }
}
