class CouponValidation 
{
	public static void main(String[] args) 
	{
		int currDate = 19;
		int expiryDate = 25;
		System.out.println((currDate < expiryDate) ? "Coupon can be applied" : "Coupon cant be applied");
	}
}

// < is used. Because the coupon expires on the expirydate not after.