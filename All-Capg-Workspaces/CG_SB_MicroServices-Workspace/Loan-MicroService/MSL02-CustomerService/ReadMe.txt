DIRECT CUSTOMER SERVICE (Without Gateway)

Base URL
http://localhost:9091/customer

1️⃣ Add Customer
POST
http://localhost:9091/customer/addCustomer

Body:
{
"customerId": 101,
"cname": "Ravi Kumar",
"email": "[ravi@example.com](mailto:ravi@example.com)",
"phone": "9876543210"
}

2️⃣ Get Customer By ID
GET
http://localhost:9091/customer/getCustomer/101

3️⃣ Get All Customers
GET
http://localhost:9091/customer/getallcustomers

4️⃣ Delete Customer
DELETE
http://localhost:9091/customer/deletecustomer/101

---

TEST THROUGH API GATEWAY

Gateway Base URL
http://localhost:9094

1️⃣ Add Customer
POST
http://localhost:9094/customer/addCustomer

Body:
{
"customerId": 101,
"cname": "Ravi Kumar",
"email": "[ravi@example.com](mailto:ravi@example.com)",
"phone": "9876543210"
}

2️⃣ Get Customer By ID
GET
http://localhost:9094/customer/getCustomer/101

3️⃣ Get All Customers
GET
http://localhost:9094/customer/getallcustomers

4️⃣ Delete Customer
DELETE
http://localhost:9094/customer/deletecustomer/101
