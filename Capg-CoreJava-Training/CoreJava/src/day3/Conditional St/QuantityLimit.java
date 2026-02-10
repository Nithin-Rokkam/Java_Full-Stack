class QuantityLimit 
{
	public static void main(String[] args) 
	{
		int req=7;
		String res=(req<=5)? "item-added successfully":"Item-limit exceeded";
		System.out.println("result = "+res);
	}
}
//the <= operater is used heer to confirm that the item is added is within the limit else give a limit exceed message.