package MobileContact;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.display();
		p.display(2);

	}

}

class Parent {
    public void display() {
        System.out.println("hii");
    }
}

class Child extends Parent {
	public void display(int a) {
		System.out.println("overloaded");
	}
}