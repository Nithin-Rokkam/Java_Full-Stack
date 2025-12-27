class ReturnPolicyCheck 
{
	public static void main(String[] args) 
	{
		int daysAfterDelivery = 6;
		System.out.println((daysAfterDelivery>=0 && daysAfterDelivery<7) ? "Return Accepted" : "Return rejected");
	}
}
