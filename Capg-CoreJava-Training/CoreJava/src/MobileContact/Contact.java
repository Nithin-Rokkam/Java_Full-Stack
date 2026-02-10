package MobileContact;

public class Contact {
	String name;
	long number;
	Contact(String name,long number){
		this.name=name;
		this.number=number;
	}
	
	public String toString() {
		return "name"+name+" number"+number;
	}
} 
