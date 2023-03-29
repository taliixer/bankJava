//entity account
class Account {
    double balance;
    int agency;
    int number;
    Customer holder = new Customer(); //Cada Vez que se cree un objeto cuenta tambien se va a crear un objeto cliente


    public void funding(double value){
        this.balance += value;
    }
    public boolean withdrawals(double value){
        if (this.balance >= value){
            this.balance -= value;
            return true;
        }else{
            return false;
        }
    }

    public boolean exchange(double value, Account account){
        if (this.balance >= value){
            this.balance -= value;

            account.funding(value);
            return true;
        }
        return false;
    }
}
