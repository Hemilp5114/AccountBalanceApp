AccountBalanceApp

📌 Project Description

AccountBalanceApp is a simple Java console-based application that simulates a banking system with checking and savings accounts. Users can deposit and withdraw money, and the app calculates monthly fees for checking accounts and interest for savings accounts.

🛠 Technologies Used

Java

IntelliJ IDEA (Recommended IDE)

Git/GitHub (for version control)

📂 Project Structure

ASSIGNMENT1JAVA/
│── src/
│   ├── accountapp/
│   │   ├── AccountBalanceApp.java
│   │   ├── CheckingAccount.java
│   │   ├── SavingsAccount.java
│── README.md
│── .gitignore
│── pom.xml (if using Maven)

🚀 How to Run the Project

Step 1: Clone the Repository

git clone https://github.com/your-username/AccountBalanceApp.git
cd AccountBalanceApp

Step 2: Open in IntelliJ IDEA

Open IntelliJ IDEA.

Click on File > Open and select the cloned project folder.

Ensure that JDK 22 is selected (File > Project Structure > SDKs).

Step 3: Compile and Run

Open AccountBalanceApp.java.

Click the Run button (or press Shift + F10).

📌 Sample Output

Welcome to the Account application

Starting Balances
Checking: $1000.00
Savings:  $1000.00

Withdrawal or deposit? (w/d): w
Checking or savings? (c/s): c
Amount?: 500

Continue? (y/n): y

Monthly Payments and Fees
Checking fee:              $1.00
Savings interest payment:  $12.00

Final Balances
Checking: $499.00
Savings:  $1012.00

❌ Handling Invalid Inputs

Withdrawal or deposit? (w/d): X
Invalid input! Please enter 'w' for withdrawal or 'd' for deposit.

📌 How to Contribute

Fork the repository.

Create a new branch: git checkout -b feature-name

Commit changes: git commit -m "Added new feature"

Push to GitHub: git push origin feature-name

Open a Pull Request.

