package com.hibernate.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernate.entity.Address;
import com.hibernate.service.CustomerService;
import com.hibernate.service.LeadService;
import com.hibernate.service.OrderService;
import com.hibernate.service.ProductService;
import com.hibernate.service.ReportService;
import com.hibernate.service.TicketService;

public class CRMApplication {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("crmPU");
        EntityManager em = emf.createEntityManager();

        CustomerService customerService = new CustomerService(em);
        LeadService leadService = new LeadService(em);
        ProductService productService = new ProductService(em);
        OrderService orderService = new OrderService(em);
        TicketService ticketService = new TicketService(em);
        ReportService reportService = new ReportService(em);

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {

            System.out.println("1 Register Customer");
            System.out.println("2 Add Address");
            System.out.println("3 Create Lead");
            System.out.println("4 Assign Lead");
            System.out.println("5 Convert Lead");
            System.out.println("6 Add Product");
            System.out.println("7 Place Order");
            System.out.println("8 Raise Ticket");
            System.out.println("9 Employee Performance");
            System.out.println("10 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    customerService.registerCustomer(name, email, phone);
                    break;

                case 2:
                    System.out.print("Customer ID: ");
                    Long cid = sc.nextLong();
                    sc.nextLine();

                    Address address = new Address();
                    System.out.print("Street: ");
                    address.setStreet(sc.nextLine());
                    System.out.print("City: ");
                    address.setCity(sc.nextLine());
                    System.out.print("State: ");
                    address.setState(sc.nextLine());
                    System.out.print("Zip: ");
                    address.setZipCode(sc.nextLine());

                    customerService.addAddressToCustomer(cid, address);
                    break;

                case 3:
                    System.out.print("Lead Name: ");
                    String lname = sc.nextLine();
                    System.out.print("Source: ");
                    String source = sc.nextLine();
                    System.out.print("Contact Info: ");
                    String contact = sc.nextLine();
                    leadService.createLead(lname, source, contact);
                    break;

                case 4:
                    System.out.print("Lead ID: ");
                    Long leadId = sc.nextLong();
                    System.out.print("Employee ID: ");
                    Long empId = sc.nextLong();
                    sc.nextLine();
                    leadService.assignLeadToEmployee(leadId, empId);
                    break;

                case 5:
                    System.out.print("Lead ID: ");
                    Long lId = sc.nextLong();
                    sc.nextLine();
                    leadService.convertLeadToCustomer(lId);
                    break;

                case 6:
                    System.out.print("Product Name: ");
                    String pname = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    productService.addProduct(pname, price);
                    break;

                case 7:
                    System.out.print("Customer ID: ");
                    Long custId = sc.nextLong();

                    System.out.print("Number of Products: ");
                    int count = sc.nextInt();

                    List<Long> productIds = new ArrayList<>();
                    for (int i = 0; i < count; i++) {
                        System.out.print("Product ID: ");
                        productIds.add(sc.nextLong());
                    }
                    sc.nextLine();
                    orderService.placeOrder(custId, productIds);
                    break;

                case 8:
                    System.out.print("Order ID: ");
                    Long orderId = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Issue Description: ");
                    String issue = sc.nextLine();
                    ticketService.raiseTicket(orderId, issue);
                    break;

                case 9:
                    System.out.print("Employee ID: ");
                    Long eId = sc.nextLong();
                    sc.nextLine();
                    Long performance =
                            reportService.getEmployeePerformance(eId);
                    System.out.println("Total Leads Handled: " + performance);
                    break;

                case 10:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid Option");
            }
        }

        em.close();
        emf.close();
        sc.close();
    }
}