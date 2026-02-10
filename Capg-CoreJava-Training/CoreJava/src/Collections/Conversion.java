package Collections;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=100;
		System.out.println(i);
		Double d=(double)i;
		System.out.println(d); //typecasting
		Double d2=Double.parseDouble(i.toString());//parsing with toString 
		System.out.println(d2);
	}
}
