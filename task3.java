package codsoft;

import java.util.*;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("the amount you need to draw is bigger than your balance\ninvalid drawing");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public double getBalance() {
        return balance;
    }
}

class ATM {
    private BankAccount bankAccount;
    private Scanner input;

    public ATM(BankAccount bankAccount) {
        this.input = new Scanner(System.in);
        this.bankAccount = bankAccount;

    }

    public void display() {
        System.out.println("1.depositing");
        System.out.println("2.withdraw");
        System.out.println("3.getBalance");
        System.out.println("4.Exit");
    }

    public void depositing() {
        System.out.println("enter amount to deposit:");
        double amount = input.nextDouble();
        bankAccount.deposit(amount);
        System.out.println("depositing successfuly done");
    }

    public void withdraw() {
        System.out.println("enter amount to withdraw:");
        double amount = input.nextDouble();
        boolean check = bankAccount.withdraw(amount);
        if (check) {
            System.out.println("depositing successfuly done");
        }
    }

    public void getBalance() {
        System.out.println("your balance is : " + bankAccount.getBalance());
    }
}

class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter your current balance");
            double balance = input.nextInt();
            BankAccount bankAccount = new BankAccount(balance);
            ATM atm = new ATM(bankAccount);

            boolean running = true;
            while (running) {
                System.out.println("atm displayOptions:");
                atm.display();
                System.out.println("select the number of your choice:");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        atm.depositing();
                        break;
                    case 2:
                        atm.withdraw();
                        break;
                    case 3:
                        atm.getBalance();
                        break;
                    case 4:
                        running = false;
                        break;
                    default:
                        System.out.println("invalid choice!");
                }
            }
        }
    }
}