class StockAvailability 
{
	public static void main(String[] args) 
	{
		int ProdAvail=10, CustReq=2;
		String res=((ProdAvail>0) && ProdAvail>=CustReq)? "product added":"Not enough products";
		System.out.println("Cart = "+res);
	}
}
// Relational operator is used here to compare the product availability and requirement of the customer
//The product avail should be always be greater then equal to the customer requirement and the product its-self should be greater then 0.