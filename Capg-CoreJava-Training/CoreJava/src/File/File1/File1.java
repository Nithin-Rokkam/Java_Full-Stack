package File.File1;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("Capgemini/src/File/File1/testdir");
		if(f1.mkdir()) {
			System.out.println("Directory successfully created");
		} else {
			System.out.println("Directory already exists or creation failed");
		}
	}
}
