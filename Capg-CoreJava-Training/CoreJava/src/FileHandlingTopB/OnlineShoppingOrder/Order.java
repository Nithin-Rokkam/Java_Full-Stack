package FileHandlingTopB.OnlineShoppingOrder;

class Order extends Customer{
    String orderId;
    String productName;
    int quantity;
    double totalPrice;


    Order(String orderId,int customerId,String productName,int quantity,double totalPrice){
        super(customerId);
        this.orderId=orderId;
        this.productName=productName;
        this.quantity=quantity;
        this.totalPrice=totalPrice;
    }

    public String toString(){
        return orderId+","+getCustomerId()+","+productName+","+quantity+","+totalPrice;
    }

}
