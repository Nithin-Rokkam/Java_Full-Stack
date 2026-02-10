package FIle.File2;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class EmployeeWrite {
    public static void main(String[] args) {
        File f=new File("Capgemini/src/File/File2/fnew/emp.txt");
        Employee e1=new Employee(101,"Ravi" , "SDE-CG", 10202.1);
        Employee e2=new Employee(102,"Suri" , "CEO   ", 102002.32);
        Employee e3=new Employee(103,"Nani" , "ML-Dev", 104452.82);
        Employee e4=new Employee(104,"Bhai" , "Tester", 12822.62);

        try(BufferedWriter bw=new BufferedWriter(new FileWriter(f))){
            bw.write("ID  Name  Role  Salary");
            bw.newLine();

            bw.write(e1.toString());
            bw.newLine();
            bw.write(e2.toString());
            bw.newLine();
            bw.write(e3.toString());
            bw.newLine();
            bw.write(e4.toString());
            bw.newLine();
            System.out.println("File updated successfully");
            bw.close();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }
        
    }
}
