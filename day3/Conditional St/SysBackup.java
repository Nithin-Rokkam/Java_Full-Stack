class SysBackup 
{
	public static void main(String[] args) 
	{
		boolean midnight = true;
		String serverLoad = true;
		boolean SysStatus = true;
		String res = (midnight && serverLoad && SysStatus)?"Backup":"No Backup";
		System.out.println("SysBackup: "+res);
	}
}
