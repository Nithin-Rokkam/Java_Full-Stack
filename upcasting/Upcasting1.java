package upcasting;

public class Upcasting1 {
	
	public static void main(String[] args) {
		
		Google obj1 = new Instagram("kalyan_appari","1234");
		if(obj1.vaildateCredientials("kalyan_appari","1234")) {
			System.out.println("Successfully Logged In");
		}
		else {
			System.out.println("Loggin Failed!");
		}
		Google obj2 = new YouTube("kalyan_appari","1234");
		if(obj2.vaildateCredientials("kalyan_appari","1234")) {
			System.out.println("Successfully Logged In");
		}
		else {
			System.out.println("Loggin Failed!");
		}
	
	}
}
class Google{
	
	private String username;
	private String password;
	
	Google(String username,String password){
		
		this.username = username;
		this.password = password;
		
	}
	
	public boolean vaildateCredientials(String user,String pass) {
		
		return username.equals(user) && password.equals(pass);
		
	}
}
class Instagram extends Google{
	
	Instagram(String username,String password){
		super(username,password);
	}
	
}
class YouTube extends Google{
	
	YouTube(String username,String password){
		super(username,password);
	}
}
class FaceBook extends Google{
	
	FaceBook(String username,String password){
		super(username,password);
	}
}