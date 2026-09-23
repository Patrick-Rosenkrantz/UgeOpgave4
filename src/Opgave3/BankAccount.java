package Opgave3;

import java.util.ArrayList;

public class BankAccount {
    String owner;
    double balance;

    ArrayList<Transaction> transactions;

    public BankAccount(String owner, double startBalance) {
        this.owner = owner;
        this.balance = startBalance;
        this.transactions = new ArrayList<>();
        transactions.add(new Transaction("Deposit", startBalance));
    }

    public void deposit(double amount){
        if (amount> 0 ){
            balance = balance + amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Deposited " + amount+ " dollars");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance = balance - amount;
            transactions.add(new Transaction("Withdrawel", amount));
            System.out.println("withdrew "+ amount+ " dollars");
        } else if (amount > balance) {
            System.out.println("Not enough money");
        }
    }

    public void printTransactionsHistory(){
        System.out.println("Transition history for "+owner);
                for (Transaction t : transactions){
                    System.out.println(t);
                }
    }

    public  double getBalance(){
        return balance;
    }



}

