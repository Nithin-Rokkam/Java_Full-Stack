DIRECT DEMAT SERVICE (Without Gateway)

Base URL
http://localhost:9093/demat

1️⃣ Create Demat Account
Method: POST
URL: http://localhost:9093/demat/addaccount

Body (JSON):
{
"accountId": 1,
"customerId": 101,
"accountNumber": "DM12345678",
"brokerName": "Zerodha",
"status": "ACTIVE"
}

2️⃣ Get All Demat Accounts
Method: GET
URL: http://localhost:9093/demat/getallaccounts

3️⃣ Get Demat Account By ID
Method: GET
URL: http://localhost:9093/demat/getaccount/1

4️⃣ Get Demat Accounts By Customer ID
Method: GET
URL: http://localhost:9093/demat/customer/101

5️⃣ Update Account Status
Method: PUT
URL: http://localhost:9093/demat/1/status?status=INACTIVE

6️⃣ Delete Demat Account
Method: DELETE
URL: http://localhost:9093/demat/1

---

TEST THROUGH API GATEWAY

Gateway Base URL
http://localhost:9094

1️⃣ Create Demat Account
POST
http://localhost:9094/demat/addaccount

Body:
{
"accountId": 1,
"customerId": 101,
"accountNumber": "DM12345678",
"brokerName": "Zerodha",
"status": "ACTIVE"
}

2️⃣ Get All Demat Accounts
GET
http://localhost:9094/demat/getallaccounts

3️⃣ Get Demat Account By ID
GET
http://localhost:9094/demat/getaccount/1

4️⃣ Get Accounts By Customer
GET
http://localhost:9094/demat/customer/101

5️⃣ Update Account Status
PUT
http://localhost:9094/demat/1/status?status=INACTIVE

6️⃣ Delete Demat Account
DELETE
http://localhost:9094/demat/1
