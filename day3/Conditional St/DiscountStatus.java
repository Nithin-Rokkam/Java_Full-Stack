class DiscountStatus
{
	public static void main(String[] args) 
	{
		boolean Premium_member= false;
		int Cart_value = 4500;
		String res = (Premium_member || Cart_value>=5000)? "Discount": "No Discount";
		System.out.println("DiscountStatus: "+res);
	}
}
