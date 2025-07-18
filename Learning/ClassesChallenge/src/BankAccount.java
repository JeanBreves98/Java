import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    Scanner scanner = new Scanner(System.in);

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber() {
        System.out.println("Please enter an account number:");
        accountNumber = scanner.nextLine();

    }

    public void setBalance() {
        System.out.println("Please enter a balance:");
        balance = scanner.nextDouble();
        scanner.nextLine();

    }

    public void setCustomerName() {
        System.out.println("Please enter the account holder's name:");
        customerName = scanner.nextLine();

    }

    public void setEmail() {
        System.out.println("Please enter the account holder's email:");
        email = scanner.nextLine();

    }

    public void setPhoneNumber() {
        System.out.println("Please enter the account holder's phone number:");
        phoneNumber = scanner.nextLine();

    }

    public static void depositing(BankAccount account){
        System.out.println("Making a deposit...");
        System.out.println("Please enter the amount to be deposited");
        Scanner scanner = new Scanner(System.in);
        double deposit = scanner.nextDouble();
        scanner.nextLine();

        account.balance = account.balance + deposit;

    }

    public static void withdrawing(BankAccount account){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Making a withdrawal...");
            System.out.println("Please enter the amount to be withdrawn");
            double withdrawal = scanner.nextDouble();
            scanner.nextLine();

            if ((account.balance - withdrawal) < 0) {
                System.out.println("Operation failed!!!");
                System.out.println("Insufficient funds! You only have $" + account.balance + "in your account");
                System.out.println("Please try again");
            } else {
                account.balance = account.balance - withdrawal;
                break;
            }

        }

        System.out.println("Updated balance: " + account.balance);
    }

    public static void describeAccount(BankAccount account) {
        System.out.println("Account number: " + account.accountNumber);
        System.out.println("Balance: " + account.balance);
        System.out.println("Customer name: " + account.customerName);
        System.out.println("E-mail: " + account.email);
        System.out.println("Phone number: " + account.phoneNumber);

        System.out.println("Updated Balance: " + account.balance);
    }

}