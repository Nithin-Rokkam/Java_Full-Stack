class ValStudentExam
{
	public static void main(String[] args) 
	{
		String Fee = "notpaid";
		int Attendance = 76;
		String medical = "yes";
		
		boolean ExamStatus = (Attendance>=75 || medical=="yes")? true: false;
		boolean Fstatus = (Fee=="paid")?true:false;
		
		String res = (ExamStatus && Fstatus)? "Allowed":"Not Allowed";
		System.out.println("Exam : "+res);
	}
}
