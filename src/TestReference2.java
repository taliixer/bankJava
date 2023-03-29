import com.sun.security.ntlm.Client;

public class TestReference2 {
    public static void main(String[] args) {
        Customer diego = new Customer();
        diego.name = "Diego";
        diego.document = "1035971273";
        diego.numberCellphone = "3112535030";

        Account diegoAccount = new Account();
        diegoAccount.agency = 1;
        diegoAccount.holder = diego;

        System.out.println(diegoAccount.holder.document);
        System.out.println(diegoAccount.holder);
        System.out.println(diego);
    }
}
