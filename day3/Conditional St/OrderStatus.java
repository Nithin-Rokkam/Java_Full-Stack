class OrderStatus 
{
	public static void main(String[] args) 
	{
		boolean Payment = false;
		boolean Stock = true;
		boolean backOrder = true;
		String res = (Payment && (Stock || backOrder)) ? "Order Confirmed": "Order declined";
		System.out.println("OrderStatus: "+res);
	}
}
