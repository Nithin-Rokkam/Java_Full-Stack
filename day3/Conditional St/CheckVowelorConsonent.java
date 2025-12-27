class CheckVowelorConsonent
{
	public static void main(String[] args) 
	{
		char ch='u';
		String resL=(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')? "LowercaseVowel":"LowerCaseConsonent";
		System.out.println("Result= "+resL);
	}
}
