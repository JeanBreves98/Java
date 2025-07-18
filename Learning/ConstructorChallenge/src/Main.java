public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Jean", 100000, "JeanBreves1998@gmail.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());
        Customer customer2 = new Customer("Tim", "Tim@gmail.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());
        Customer customer3 = new Customer();
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAddress());

    }
}