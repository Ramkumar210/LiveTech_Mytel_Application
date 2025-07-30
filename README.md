**Mytel Application (Core Java)**

  Welcome to Mytel, a console-based telecom service simulator built in Java. This application mimics a real-world mobile service provider, offering prepaid and postpaid functionalities through a modular and object-oriented design.

==================================================================================
Requirements :
          Mytel application: 
  Welcome to Mytel  : 
  Enter option 1 for mobile recharge 
  Enter option 2 for pay bills 
  Enter option 3 to convert prepaid to postpaid / postpaid to prepaid  
  Enter option 4 to know the balance 
  Enter option 5 for profile details 
  Enter 0 to exit  
  
Mobile recharge module: 
  Enter Prepaid number: 8765432567 
  Packages: 
    package 1 
    Amount   200 
    Validity 30 days 
    Data 3GB/day 
  package 2 
    Amount   300 
    Validity 30 days 
    Data 6GB/day 
Enter the appropriate package number to proceed further 
  Enter payment details: 
  Enter debit card/credit card number:898765432 
  Enter Expiry date:12/04/2024 
  Enter CVV number:123 
  Congratulations..your recharge is successful.. 

  Bill pay module: 
    Enter Post paid number: 8765432567 
    Bill due amount is  600 INR 
    Enter payment details: 
    Enter debit card/credit card number:898765432 
    Enter Expiry date:12/04/2024 
    Enter CVV number:123 
  Congratulations..your bill amount is paid successful.. 

  Convertion module: 
    Enter mobile number: 8765432567 
    Enter  option a to convert prepaid to post 
    Enter option b to convert post to prepaid 
    Congrats!!your request is received. You new SIM will be delivered within 2 days to your address 
 
  Balance module: 
    Enter Mobile number: 8765432567 
    Balance: 
    SMS : 30 
    Talktime : unlimited 
    Data  :  1.GB 

  Profile details module: 
    Enter mobile number: 8765432567 
    Name:rahul 
    Address: Ameerpet, Hyderabad
==================================================================================
Features
  - Mobile Recharge (Prepaid users only)
  - Bill Payment (Postpaid users only)
  - SIM Conversion (Prepaid ↔ Postpaid)
  - Balance Inquiry
  - Profile Registration
  - Interactive Menu
==================================================================================

Recharge Packages

| Package No | Amount (INR) | Validity (days) | Data/day |
|------------|--------------|------------------|----------|
| Package 1  | ₹200         | 28               | 1 GB     |
| Package 2  | ₹300         | 30               | 2 GB     |

==================================================================================
 Tech Stack
  - Language: Java
  - Architecture: Modular OOP
  - Core Concepts: Classes, inheritance, ArrayList, conditional logic, encapsulation
  - User Interaction: Java Scanner
  - Enivironment : Eclipse IDE
==================================================================================
Project Structure
Mytel/
├── main/
│   └── MytelApplication.java         # Entry point of the program
│
├── service/                          # Business logic layer
│   ├── RechargeService.java
│   ├── BillPaymentService.java
│   ├── ConversionService.java
│   ├── BalanceService.java
│   └── ProfileService.java
│
├── user/                             # User models and interaction
│   ├── MytelUser.java                # POJO for user data
│   └── UserImpl.java                 # CLI menu and logic
│
├── utils/                            # Utility classes
│   └── PackageConstants.java         # Recharge package definitions
│
├── README.md                         # Project documentation
====================================================================================
