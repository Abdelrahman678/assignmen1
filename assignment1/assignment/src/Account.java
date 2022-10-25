import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dataCreated ;
    public Account(){

    }
    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDataCreated() {
        return dataCreated;
    }
    public double getMonthlyInterestRate(){
        return (annualInterestRate/12);
    }
    public double getMonthlyInterest(){
        return (balance*getMonthlyInterestRate())*100;
    }
    public void withdraw(double a){
        balance -= a;

    }
    public void deposit(double a){
        balance += a;
    }


}

