import java.util. Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1122,20000);
        Account.setAnnualInterestRate(4.5/100);
        account1.withdraw(2500);
        account1.deposit(3000);
        account1.getDataCreated();
        System.out.println("balance = "+account1.getBalance()+"\n monthly interest = "+account1.getMonthlyInterest()+"\n date: "+account1.getDataCreated());


    }
}