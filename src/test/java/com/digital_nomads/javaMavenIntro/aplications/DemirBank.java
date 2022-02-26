package com.digital_nomads.javaMavenIntro.aplications;

public class DemirBank extends BankBase{
    private double balance = 100;


    public DemirBank(long accountNumber, long routingNumber) throws Exception {
        super(accountNumber, routingNumber);
    }

    public DemirBank(Object s, String s1) {
        super();
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) throws Exception {
        if (amount < 0 || amount >20000){
            throw new Exception("Invalid amount");
        }else balance += amount;

    }

    @Override
    public void withDraw(double amount) throws Exception {
        if (amount < 0 || amount >5000){
            throw new Exception("Invalid amount. Cannot be withdrawn");
        }
        else{
            if(balance < amount){
                throw new Exception("Insufficient amount");
            }
            else {
                balance -= amount;
            }
        }

    }

    @Override
    public String toString() {
        return "DemirBamk{" +
                "balance=" + balance +
                '}';
    }
}
