package File.File2;

import java.io.File;

public class DelFile {
    public static void main(String[] args) {
        File f=new File("Capgemini/src/File/File2/fnew/f2.txt");
        if(f.delete()){
            System.out.println("File deleted successfully");
        }else{
            System.out.println("File not deleted");
        }
    }
}
