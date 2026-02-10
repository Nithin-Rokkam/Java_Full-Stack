package File.File2;

public class Employee {
    private int id;
    private String name;
    private String role;
    private double salary;
    Employee(int id,String name,String role,double salary){
        this.id=id;
        this.name=name;
        this.role=role;
        this.salary=salary;
    }

    public String toString(){
        return id+" "+name+" "+role+" "+salary;
    }
}
