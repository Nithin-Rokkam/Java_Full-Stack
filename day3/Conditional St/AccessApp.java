class AccessApp 
{
	public static void main(String[] args) 
	{
		int age=18;
		boolean uStatus=true;
		String res=(uStatus && age>=18)? "Accessable":"Not-Accessable";
		System.out.println("Application Status : "+res);
	}
}
