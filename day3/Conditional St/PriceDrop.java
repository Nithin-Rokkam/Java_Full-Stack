class PriceDrop 
{
	public static void main(String[] args) 
	{
		double lastViewed=400;
		double currPrice=380;
		System.out.println((currPrice<lastViewed) ? "Price Drop Alert" : "No Price Drop");
	}
}

// < is used for better detection.