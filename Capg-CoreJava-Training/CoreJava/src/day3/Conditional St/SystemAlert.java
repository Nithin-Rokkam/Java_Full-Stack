class  SystemAlert
{
	public static void main(String[] args) 
	{
		boolean accountStatus = true;
		int loginAttempts = 4;
		String res = (accountStatus && loginAttempts>3)? "Alert":"No Alert";
		System.out.println("SystemAlert: "+res);
	}
}
