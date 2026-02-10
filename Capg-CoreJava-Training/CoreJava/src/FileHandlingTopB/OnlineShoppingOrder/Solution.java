package FileHandlingTopB.OnlineShoppingOrder;

public class Solution{
    public static void main(String[] args) {
        Order o1=new Order("ORD101",201,"Laptop",1,65000);
        Order o2=new Order("ORD102",202,"Mouse",2,1200);
        Order o3=new Order("ORD103",201,"Keyboard",1,2500);

        OrderFileHandler ofh=new OrderFileHandler();

        ofh.saveOrder(o1);
        ofh.saveOrder(o2);
        ofh.saveOrder(o3);

        System.out.println("All Orders:");
        ofh.readAllOrders();

        System.out.println("\nOrders for Customer ID: 201");
        ofh.getOrdersByCustomerId(201);

        System.out.println("\nHigh Value Orders (>5000.0):");
        ofh.getHighValueOrders(5000);

    }
}
