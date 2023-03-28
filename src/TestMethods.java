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

        boolean canTransfer = accountJaime.exchange(600, accountDiego);
        if (canTransfer){
            System.out.println("Transferencia exitosa");
        }else{
            System.out.println("No es posible");
        }

        System.out.println(accountDiego.balance);

        System.out.println("El saldo de Jaime despues de la transferencia "+ accountJaime.balance);
    }
}
