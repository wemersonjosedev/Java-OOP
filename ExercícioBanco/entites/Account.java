package ExercícioBanco.entites;

public class Account {

    protected int accountNumber;
    public String name;
    protected double SaldoInitial;

    public Account(){

    }

    public Account(int account, String name, double depositInitial) {
        this.accountNumber = account;
        this.name = name;
        depositAccount(depositInitial);
    }

    public int getAccount() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldoInitial() {
        return SaldoInitial;
    }

    public void addAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void depositAccount(double deposit){
        SaldoInitial += deposit;
    }

    public void withdrawAccount(double withdraw){
        SaldoInitial -= (withdraw + 5.00);
    }
    
    public String toString(){
        return "Account " 
        + accountNumber 
        + ", Holder: " 
        + name 
        + ", Balance: $ " 
        + String.format("%.2f", SaldoInitial);
    }
}

