

import java.util.Scanner;

public class inheritance {
    private String name, address, accountType;
    private int pincode, phone, balance;
    private final int minBalance = 5000; // Minimum balance for Current Account
    private final double savingsInterest = 5.0; // 5% for Savings
    private final double fdInterest = 7.0; // 7% for FD
    Scanner sc = new Scanner(System.in);

    // Constructor
    public inheritance(String accountType) {
        this.accountType = accountType;
        System.out.println("\n🏦 Welcome to Priti's Bank");
    }

    // Account Creation
    public void createAccount() {
        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.print("Enter your address: ");
        address = sc.next();
        System.out.print("Enter your phone number: ");
        phone = sc.nextInt();
        System.out.print("Enter your pincode: ");
        pincode = sc.nextInt();
        System.out.print("Enter initial deposit amount: ");
        balance = sc.nextInt();
        System.out.println("✅ Account successfully created!\n");
    }

    // Deposit Money
    public void deposit() {
        System.out.print("Enter deposit amount: ");
        int amount = sc.nextInt();
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ ₹" + amount + " deposited successfully.");
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }

    // Withdraw Money
    public void withdraw() {
        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ ₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    // Display User Details
    public void userDetails() {
        System.out.println("\n📋 Customer Details:");
        System.out.println("👤 Name: " + name);
        System.out.println("📞 Phone: " + phone);
        System.out.println("🏠 Address: " + address);
        System.out.println("📌 Pincode: " + pincode);
        System.out.println("💰 Account Type: " + accountType);
        System.out.println("💵 Current Balance: ₹" + balance);
    }

    // Check Minimum Balance for Current Account
    public void checkMinimumBalance() {
        if (accountType.equals("Current") && balance < minBalance) {
            System.out.println("⚠ Warning: Your balance is below the minimum ₹" + minBalance);
        } else {
            System.out.println("✅ Your balance meets the minimum requirement.");
        }
    }

    // Calculate Savings Interest
    public void calculateSavingsInterest() {
        if (accountType.equals("Savings")) {
            double interest = (balance * savingsInterest) / 100;
            System.out.println("💰 Interest earned: ₹" + interest);
        } else {
            System.out.println("❌ Interest calculation not applicable for this account.");
        }
    }

    // Calculate FD Interest
    public void calculateFDInterest() {
        if (accountType.equals("Fixed Deposit")) {
            System.out.print("Enter the number of years: ");
            int years = sc.nextInt();
            double interest = (balance * fdInterest * years) / 100;
            System.out.println("💰 Total interest after " + years + " years: ₹" + interest);
        } else {
            System.out.println("❌ FD Interest calculation not applicable for this account.");
        }
    }

    // Main Menu for User Actions
    public void menu() {
        while (true) {
            System.out.println("\n🏦 BANK MENU:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Account Details");
            if (accountType.equals("Savings")) {
                System.out.println("4. Calculate Savings Interest");
            } else if (accountType.equals("Current")) {
                System.out.println("4. Check Minimum Balance");
            } else if (accountType.equals("Fixed Deposit")) {
                System.out.println("4. Calculate FD Interest");
            }
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    userDetails();
                    break;
                case 4:
                    if (accountType.equals("Savings")) {
                        calculateSavingsInterest();
                    } else if (accountType.equals("Current")) {
                        checkMinimumBalance();
                    } else if (accountType.equals("Fixed Deposit")) {
                        calculateFDInterest();
                    }
                    break;
                case 5:
                    System.out.println("🙏 Thank you for banking with us! 😊");
                    return;
                default:
                    System.out.println("❌ Invalid option. Try again.");
            }
        }
    }

    // Main Method for Execution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🏦 Welcome to Priti's Bank");
        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("3. Fixed Deposit Account");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        String accountType = switch (choice) {
            case 1 -> "Savings";
            case 2 -> "Current";
            case 3 -> "Fixed Deposit";
            default -> {
                System.out.println("❌ Invalid choice! Exiting.");
                yield null;
            }
        };

        if (accountType != null) {
            inheritance account = new inheritance(accountType);
            account.createAccount();
            account.menu();
        }
        sc.close();
    }
}
