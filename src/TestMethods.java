public class TestMethods {
    public static void main(String[] args) {
        Account accountDiego = new Account();

        accountDiego.balance = 300;
        accountDiego.funding(400);

        System.out.println(accountDiego.balance);
    }
}
