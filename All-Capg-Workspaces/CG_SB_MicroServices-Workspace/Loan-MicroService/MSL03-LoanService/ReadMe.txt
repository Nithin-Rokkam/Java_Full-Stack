BASE URL (Direct Service)

http://localhost:9092/loan

1️⃣ Apply Loan
Method: POST
URL: http://localhost:9092/loan/apply

Body (JSON):
{
"loanId": 1,
"customerId": 101,
"loanAmount": 500000,
"loanType": "Home Loan",
"loanStatus": "Pending"
}

2️⃣ Get All Loans
Method: GET
URL: http://localhost:9092/loan/get

3️⃣ Get Loan By ID
Method: GET
URL: http://localhost:9092/loan/getloan/1

4️⃣ Get Loans By Customer ID
Method: GET
URL: http://localhost:9092/loan/customer/101

5️⃣ Update Loan Status
Method: PUT
URL: http://localhost:9092/loan/1/status?status=Approved

6️⃣ Delete Loan
Method: DELETE
URL: http://localhost:9092/loan/1

---

IF TESTING THROUGH API GATEWAY

BASE URL:

http://localhost:9094

1️⃣ Apply Loan
POST
http://localhost:9094/loan/apply

Body:
{
"loanId": 1,
"customerId": 101,
"loanAmount": 500000,
"loanType": "Home Loan",
"loanStatus": "Pending"
}

2️⃣ Get All Loans
GET
http://localhost:9094/loan/get

3️⃣ Get Loan By ID
GET
http://localhost:9094/loan/getloan/1

4️⃣ Get Loans By Customer
GET
http://localhost:9094/loan/customer/101

5️⃣ Update Loan Status
PUT
http://localhost:9094/loan/1/status?status=Approved

6️⃣ Delete Loan
DELETE
http://localhost:9094/loan/1
