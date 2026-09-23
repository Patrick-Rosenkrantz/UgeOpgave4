package Opgave3;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Anna", 1000);

        account.deposit(500);
        account.withdraw(200);
        account.deposit(1000);
        account.withdraw(300);
        account.withdraw(5000);  // Fejler

        account.printTransactionsHistory();

        System.out.println("\nNuværende saldo: " + account.getBalance() + " kr");
    }
}