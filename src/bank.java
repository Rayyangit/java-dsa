import java.util.Scanner;

class Banking {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private double loanAmount;
    private double fixedDepositAmount;

    public Banking(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.loanAmount = 0;
        this.fixedDepositAmount = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully. New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully. New Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void applyLoan(double amount) {
        if (amount > 0) {
            loanAmount += amount;
            System.out.println("Loan of ₹" + amount + " approved. Total Loan Amount: ₹" + loanAmount);
        } else {
            System.out.println("Invalid loan amount.");
        }
    }

    public void fixedDeposit(double amount) {
        if (amount > 0 && amount <= balance) {
            fixedDepositAmount += amount;
            balance -= amount;
            System.out.println("₹" + amount + " transferred to Fixed Deposit. New Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void printPassbook() {
        System.out.println("\n---- Passbook ----");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Fixed Deposit: ₹" + fixedDepositAmount);
        System.out.println("Loan Amount: ₹" + loanAmount);
        System.out.println("------------------\n");
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banking account = null;

        while (true) {
            System.out.println("1. Open New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Apply for Loan");
            System.out.println("5. Fixed Deposit");
            System.out.println("6. Print Passbook");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Account Number: ");
                    String accNumber = scanner.nextLine();
                    account = new Banking(name, accNumber);
                    System.out.println("Account created successfully!\n");
                    break;

                case 2:
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Please open an account first.");
                    }
                    break;

                case 3:
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Please open an account first.");
                    }
                    break;

                case 4:
                    if (account != null) {
                        System.out.print("Enter loan amount: ");
                        double loanAmount = scanner.nextDouble();
                        account.applyLoan(loanAmount);
                    } else {
                        System.out.println("Please open an account first.");
                    }
                    break;

                case 5:
                    if (account != null) {
                        System.out.print("Enter fixed deposit amount: ");
                        double fdAmount = scanner.nextDouble();
                        account.fixedDeposit(fdAmount);
                    } else {
                        System.out.println("Please open an account first.");
                    }
                    break;

                case 6:
                    if (account != null) {
                        account.printPassbook();
                    } else {
                        System.out.println("Please open an account first.");
                    }
                    break;

                case 7:
                    System.out.println("Thank you for using the bank application!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
