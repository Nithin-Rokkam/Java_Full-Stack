class EmployeeEntry 
{
	public static void main(String[] args) 
	{
		boolean ID=false;
		boolean permanentEmp=true;
		boolean TempEmp_managerApproval=false;
		String res = (ID && (permanentEmp || TempEmp_managerApproval)) ? "Entered":"No Entry";
		System.out.println("Entry Status: "+res);
	}
}
