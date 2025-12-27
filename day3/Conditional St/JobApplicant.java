class JobApplicant 
{
	public static void main(String[] args) 
	{
		int exp = 2;
		boolean projectExp = true;
		boolean Graduation = false;
		String res = (Graduation && (exp>=2 || projectExp))? "Hired":"Regret";
		System.out.println("Application Status : "+res);
	}
}
