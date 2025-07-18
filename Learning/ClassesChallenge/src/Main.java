public class Main {
    public static void main(String[] args) {

        BankAccount firstAccount = new BankAccount();
        firstAccount.setAccountNumber();
        firstAccount.setBalance();
        firstAccount.setCustomerName();
        firstAccount.setEmail();
        firstAccount.setPhoneNumber();
        firstAccount.depositing(firstAccount);
        BankAccount.withdrawing(firstAccount);

        BankAccount secondAccount = new BankAccount();
        secondAccount.setAccountNumber();
        secondAccount.setBalance();
        secondAccount.setCustomerName();
        secondAccount.setEmail();
        secondAccount.setPhoneNumber();
        BankAccount.depositing(secondAccount);
        BankAccount.withdrawing(secondAccount);

        BankAccount.describeAccount(firstAccount);
        BankAccount.describeAccount(secondAccount);

    }
}