class ServerStatus 
{
	public static void main(String[] args) 
	{
		int CpuStatus = 87;
		int memoryUsage = 97;
		boolean maintainence = true;
		String res = (maintainence && (CpuStatus>=85 && memoryUsage>=90))? "Running Well":"Unstable";
		System.out.println("Server Status : "+res);
	}
}
