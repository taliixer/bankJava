public class TestEncapsulating {
    public static void main(String[] args) {
        Account account = new Account();
        Customer customer = new Customer();

        customer.setName("Bryan");
        customer.setDocument("201234352");

        account.setHolder(customer);
        Customer customer2 = account.getHolder();

        System.out.println(customer);
        System.out.println(account.getHolder());
        System.out.println(customer2);
    }
}
