package File.File2;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {

        File dir = new File("Capgemini/src/File/File2/fnew");

        if (!dir.exists() && !dir.mkdirs()) {
            throw new IOException("Directory creation failed");
        }else{
            System.out.println("Directory created successfully");
        }

        File f = new File(dir, "emp.txt");
        if (!f.createNewFile()) {
            throw new IOException("File creation failed: file already exists");
        }else{
            System.out.println("File created successfully");
        }
    }
}
