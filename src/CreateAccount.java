public class CreateAccount {
    public static void main(String[] args) {
        //When I set the word "new" Java initialize the attributes automatic
        // Double, Int, Float = 0
        // String = null

            //Variable       = valor
            //Variable       = 123AFF - The variable is the reference to this place in memory
        //Account davidAccount = new Account(); // I'm creating a new object of type Account
        //davidAccount.balance = 120.000; // I'm initializing the value balance in my object davidAccount
        // davidAccount.country = "Peru"; No compile

        Account bryanAccount = new Account(); // When we use the word new, we say to java, reserve in the memory some space to this object
        //bryanAccount.balance = 250.200;

        //System.out.println(davidAccount.agency);
        //System.out.println(bryanAccount.holder);
    }
}
