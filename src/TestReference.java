public class TestReference {
    public static void main(String[] args) {

        Account firstAccount = new Account();
        //firstAccount.getBalance = 200.30;
        //System.out.println("First "+ firstAccount.getBalance);

        Account secondAccount = firstAccount;
        System.out.println(firstAccount); //Reference Account@1b6d3586
        System.out.println(secondAccount);//Reference Account@1b6d3586

        //secondAccount.getBalance = 99.8;
        //System.out.println("Second "+ secondAccount.getBalance);

        //secondAccount.getBalance +=400;
        //System.out.println(firstAccount.getBalance);

        System.out.println(firstAccount + " " + secondAccount);
        //Account@1b6d3586 -- object's name and place of the memory

        if (firstAccount == secondAccount){
            System.out.println("It is the same object");
        }else{
            System.out.println("They are different");
        }
    }
}
