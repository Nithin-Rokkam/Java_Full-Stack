package ObjectClass;

public class Tostring {
	public static void main(String[] args) {
		Details d=new Details("Nithin",21,1234566789);
		System.out.println(d);
		Details1 d1=new Details1("nani",20,1234566789);
		System.out.println(d1);	
	}
}

class Details{
	String name;
	int age;
	long num;
	
	public Details(String name,int age,long num) {
		this.name=name;
		this.age=age;
		this.num=num;
	}
	
	@Override
	public  String toString() {
		return "Details [name: "+name+" age= "+age+" number: "+num+"]";
	}
}

class Details1{
	String name;
	int age;
	long num;
	
	public Details1(String name,int age,long num) {
		this.name=name;
		this.age=age;
		this.num=num;
	}
	
	@Override
	public  String toString() {
		System.out.println("Details [name: "+name+" age= "+age+" number: "+num+"]");
		return " ";
	}
}

