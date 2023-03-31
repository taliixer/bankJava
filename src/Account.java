//entity account
class Account {
    private double balance;
    private int agency;
    private int number;
    private Customer holder = new Customer(); //Cada Vez que se cree un objeto cuenta tambien se va a crear un objeto cliente


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

    public double getBalance(){
        return balance;
    }

    public void setAgency(int newAgency){
        if (newAgency > 0){
            this.agency = newAgency;
        }else {
            System.out.println("El valor de la agencia debe ser mayor a cero");
        }
    }
    public int getAgency() {
        return agency;
    }

    public Customer getHolder(){
        return holder;
    }
    public void setHolder(Customer holder) {
        this.holder = holder;
    }


}
