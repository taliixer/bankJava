//entity account
class Account {
    double balance;
    int agency;
    int number;
    String holder;

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
