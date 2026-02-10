package encapsulation;

import java.util.Scanner;

abstract class GoodsTransport {

    protected String transportId;
    protected String transportDate;
    protected int transportRating;

    public GoodsTransport(String transportId, String transportDate, int transportRating) {
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }

    public String getTransportId() {
        return transportId;
    }

    public String getTransportDate() {
        return transportDate;
    }

    public int getTransportRating() {
        return transportRating;
    }

    public abstract String vehicleSelection();
    public abstract float calculateTotalCharge();
}

class BrickTransport extends GoodsTransport {

    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String id, String date, int rating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(id, date, rating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    public int getBrickQuantity() {
        return brickQuantity;
    }

    public float getBrickPrice() {
        return brickPrice;
    }

    public String vehicleSelection() {
        if (brickQuantity < 300)
            return "Truck";
        else if (brickQuantity <= 500)
            return "Lorry";
        else
            return "MonsterLorry";
    }

    public float calculateTotalCharge() {

        float price = brickPrice * brickQuantity;
        float tax = price * 0.3f;

        float discount = 0;
        if (transportRating == 5)
            discount = price * 0.20f;
        else if (transportRating == 3 || transportRating == 4)
            discount = price * 0.10f;

        float vehicleCost = getVehiclePrice(vehicleSelection());

        return (price + tax + vehicleCost) - discount;
    }

    private float getVehiclePrice(String v) {
        if (v.equalsIgnoreCase("Truck"))
            return 1000;
        if (v.equalsIgnoreCase("Lorry"))
            return 1700;
        return 3000;
    }
}

class TimberTransport extends GoodsTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String id, String date, int rating,
                           float length, float radius, String type, float price) {
        super(id, date, rating);
        this.timberLength = length;
        this.timberRadius = radius;
        this.timberType = type;
        this.timberPrice = price;
    }

    public String getTimberType() {
        return timberType;
    }

    public float getTimberPrice() {
        return timberPrice;
    }

    public String vehicleSelection() {

        float area = 2 * 3.147f * timberRadius * timberLength;

        if (area < 250)
            return "Truck";
        else if (area <= 400)
            return "Lorry";
        else
            return "MonsterLorry";
    }

    public float calculateTotalCharge() {

        float volume = 3.147f * timberRadius * timberRadius * timberLength;

        float rate = timberType.equalsIgnoreCase("Premium") ? 0.25f : 0.15f;

        float price = volume * timberPrice * rate;

        float tax = price * 0.3f;

        float discount = 0;
        if (transportRating == 5)
            discount = price * 0.20f;
        else if (transportRating == 3 || transportRating == 4)
            discount = price * 0.10f;

        float vehicleCost = getVehiclePrice(vehicleSelection());

        return (price + tax + vehicleCost) - discount;
    }

    private float getVehiclePrice(String v) {
        if (v.equalsIgnoreCase("Truck"))
            return 1000;
        if (v.equalsIgnoreCase("Lorry"))
            return 1700;
        return 3000;
    }
}

class Utility {

    public GoodsTransport parseDetails(String input) {

        String[] d = input.split(":");

        String id = d[0];
        String date = d[1];
        int rating = Integer.parseInt(d[2]);
        String type = d[3];

        if (type.equalsIgnoreCase("BrickTransport")) {

            float size = Float.parseFloat(d[4]);
            int qty = Integer.parseInt(d[5]);
            float price = Float.parseFloat(d[6]);

            return new BrickTransport(id, date, rating, size, qty, price);
        }

        if (type.equalsIgnoreCase("TimberTransport")) {

            float length = Float.parseFloat(d[4]);
            float radius = Float.parseFloat(d[5]);
            String timberType = d[6];
            float price = Float.parseFloat(d[7]);

            return new TimberTransport(id, date, rating, length, radius, timberType, price);
        }

        return null;
    }

    public boolean validateTransportId(String id) {

        if (id.matches("RTS[0-9]{3}[A-Z]"))
            return true;

        System.out.println("Transport id " + id + " is invalid");
        return false;
    }

    public String findObjectType(GoodsTransport g) {

        if (g instanceof TimberTransport)
            return "TimberTransport";

        if (g instanceof BrickTransport)
            return "BrickTransport";

        return "";
    }
}

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Utility util = new Utility();

        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        String id = input.split(":")[0];

        if (!util.validateTransportId(id)) {
            System.out.println("Please provide a valid record");
            return;
        }

        GoodsTransport gt = util.parseDetails(input);

        System.out.println("Transporter id : " + gt.getTransportId());
        System.out.println("Date of transport : " + gt.getTransportDate());
        System.out.println("Rating of the transport : " + gt.getTransportRating());

        if (gt instanceof BrickTransport) {
            BrickTransport b = (BrickTransport) gt;
            System.out.println("Quantity of bricks : " + b.getBrickQuantity());
            System.out.println("Brick price : " + b.getBrickPrice());
        }

        if (gt instanceof TimberTransport) {
            TimberTransport t = (TimberTransport) gt;
            System.out.println("Type of the timber : " + t.getTimberType());
            System.out.println("Timber price per kilo : " + t.getTimberPrice());
        }

        System.out.println("Vehicle for transport : " + gt.vehicleSelection());
        System.out.println("Total charge : " + gt.calculateTotalCharge());
    }
}
