public class AccesTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.funding(400);
        account.withdrawals(300);

        account.setAgency(-22);

        System.out.println(account.getBalance());
        System.out.println(account.getAgency());
    }
}
