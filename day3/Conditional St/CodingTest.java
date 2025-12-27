class CodingTest 
{
	public static void main(String[] args) 
	{
		boolean logic = false;
		boolean coding = true;
		boolean refferal = false;
		String res = ((logic && coding) || refferal)? "Pass":"Fail";
		System.out.println("Coding Status: "+res);
	}
}
