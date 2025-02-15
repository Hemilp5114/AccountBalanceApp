package accountapp;

import java.util.Scanner;

public class AccountBalanceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CheckingAccount checking = new CheckingAccount(1000.00, 1.00);
        SavingsAccount savings = new SavingsAccount(1000.00, 0.012);

        System.out.println("Welcome to the Account application");
        System.out.println("\nStarting Balances");
        System.out.printf("Checking: $%.2f\n", checking.getBalance());
        System.out.printf("Savings:  $%.2f\n", savings.getBalance());

        boolean continueTransactions = true;
        while (continueTransactions) {
            System.out.print("\nWithdrawal or deposit? (w/d): ");
            String transactionType = scanner.next().toLowerCase();

            System.out.print("Checking or savings? (c/s): ");
            String accountType = scanner.next().toLowerCase();

            System.out.print("Amount?: ");
            double amount = scanner.nextDouble();

            if (accountType.equals("c")) {
                if (transactionType.equals("w")) {
                    checking.withdraw(amount);
                } else if (transactionType.equals("d")) {
                    checking.deposit(amount);
                }
            } else if (accountType.equals("s")) {
                if (transactionType.equals("w")) {
                    savings.withdraw(amount);
                } else if (transactionType.equals("d")) {
                    savings.deposit(amount);
                }
            }

            System.out.print("\nContinue? (y/n): ");
            String response = scanner.next().toLowerCase();
            continueTransactions = response.equals("y");
        }

        checking.subtractMonthlyFee();
        savings.applyMonthlyInterest();

        System.out.println("\nMonthly Payments and Fees");
        System.out.printf("Checking fee:              $%.2f\n", checking.getMonthlyFee());
        System.out.printf("Savings interest payment:  $%.2f\n", savings.getMonthlyInterestPayment());

        System.out.println("\nFinal Balances");
        System.out.printf("Checking: $%.2f\n", checking.getBalance());
        System.out.printf("Savings:  $%.2f\n", savings.getBalance());

        scanner.close();
    }
}
