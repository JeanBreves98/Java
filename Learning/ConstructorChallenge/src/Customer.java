public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() { // Chains an empty constructor into a 2 parameters constructor
        this("Nobody", "Nobody@nowhere.com");
    }

    public Customer(String name, String emailAddress) { // Chains a 2 parameters constructor into a 3 parameters constructor
        this(name, 0, emailAddress);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
