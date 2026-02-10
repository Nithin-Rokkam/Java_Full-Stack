import java.util.*;
class SelShapes 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		while(flag){
			System.out.println("Enter shape choice:\n1.Square\n2.Rectangle\n3.Circle\n4.Triangle");
			String choice = sc.next();
			System.out.println("Choice: ");
			switch(choice){
			case "Square":
				double SquareArea=square();
				System.out.println("The area of Square: "+SquareArea);
				break;
			case "Rectangle":
				double RectangleArea=rectangle();
				System.out.println("The area of Rectangle: "+RectangleArea);
				break;
			case "Circle":
				double CircleArea=circle();
				System.out.println("The area of Circle: "+CircleArea);
				break;
			case "Triangle":
				double TriangleArea=triangle();
				System.out.println("The area of Triangle: "+TriangleArea);
				break;
			default:
				System.out.print("Invalid Option");
			}
			System.out.print("Calculate again: ");
			String st=sc.next();
			if(st.equals("no")){
				flag=false;
			}
		}
		
	}
	
	public static double square(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side=sc.nextDouble();
		double area=side*side;
		return area;
	}
	
	public static double rectangle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		double length=sc.nextDouble();
		System.out.print("Enter the breadth: ");
		double breadth=sc.nextDouble();
		double area=length*breadth;
		return area;
	}
	
	public static double circle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius=sc.nextDouble();
		double area=3.14*(radius*radius);
		return area;
	}
	
	public static double triangle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height: ");
		double height=sc.nextDouble();
		System.out.print("Enter the breadth: ");
		double breadth=sc.nextDouble();
		double area=0.5 * height * breadth;
		return area;
	}
}
