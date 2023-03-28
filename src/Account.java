//entity account
class Account {
    double balance;
    int agency;
    int number;
    String holder;

    public void funding(double value){
        this.balance += value;
    }
}
