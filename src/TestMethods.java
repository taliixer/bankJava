public class TestMethods {
    public static void main(String[] args) {
        Account accountDiego = new Account();
        Account accountJaime = new Account();

        accountDiego.balance = 300;
        accountDiego.funding(400);
        accountJaime.funding(1000);

        System.out.println(accountDiego.balance);

        accountDiego.withdrawals(400);

        System.out.println("El saldo de Jaime antes de la transferencia "+ accountJaime.balance);

        accountJaime.exchange(600, accountDiego);
        System.out.println(accountDiego.balance);

        System.out.println("El saldo de Jaime despues de la transferencia "+ accountJaime.balance);
    }
}
