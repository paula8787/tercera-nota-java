package unidad1.practicas.semana01;

public class Ejercicio1 {
    public static class BankAccount  {

        String accountNumber ;
        String owner;
        double balance;

        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposito: " + amount + "| nuevo balance: " + balance);
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Retiro: " + amount + "| nuevo balance: " + balance);
            } else {
                System.out.println("Fondos insuficientes para retirar: " + amount);
            }
        }
        
        void showBalance () {
            System.out.println(owner + ", su balance actual: " + balance);
        }
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.accountNumber = "6115998854";
        account1.balance = 8000;
        account1.owner = "Paula Echavez";

        System.out.println("Account Number: " + account1.accountNumber);
        System.out.println("Owner: " + account1.owner);
        System.out.println("Balance: " + account1.balance);

        account1.deposit(1500);
        account1.withdraw(2000); 
        account1.showBalance();
    }
}
