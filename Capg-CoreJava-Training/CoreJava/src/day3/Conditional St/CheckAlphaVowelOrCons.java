class CheckAlphaVowelOrCons 
{
	public static void main(String[] args) 
	{
		char ch='b';
		String res=(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U')? "Is alpha vowel":"Is alpha consonent";
		System.out.println("result= "+res);
	}
}
