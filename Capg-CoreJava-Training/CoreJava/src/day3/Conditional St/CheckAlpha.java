class CheckAlpha 
{
	public static void main(String[] args) 
	{
		char ch='3';
		String res=(ch>='A' && ch <= 'Z' || ch>='a' && ch <= 'z')? "alpha":"Not_alpha";
		System.out.println("result="+res);
	}
}
