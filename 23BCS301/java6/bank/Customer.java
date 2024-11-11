package bank;

import java.util.Scanner;

public class Customer {
    String name;
    int accNo;
    int balance;

    public Customer(String name, int accNo) {
        this.name = name;
        this.accNo = accNo;
        this.balance = 0;
    }

    public void creditTransaction(int amount) {
        try {
            if (amount < 0) {
                throw new InvalidCredit();
            } else {
                balance += amount;
                System.out.println("Amount credited: " + amount);
            }
        } catch (InvalidCredit e) {
            System.out.print(e.getMessage());
            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter valid credit amount: ");
            int newAmount = input.nextInt();
            creditTransaction(newAmount);
        }
    }

    public void debitTransaction(int amount) {
        try {
            if (amount > balance) {
                throw new InvalidDebit();
            } else {
                balance -= amount;
                System.out.println("Amount debited: " + amount);
            }
        } catch (InvalidDebit e) {
            System.out.print(e.getMessage());
            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter valid debit amount: ");
            int newAmount = input.nextInt();
            debitTransaction(newAmount);
        }
    }

    public void displayDetails() {
        System.out.println("Customer Details");
        System.out.println("****************");
        System.out.println("Customer Name: " + this.name);
        System.out.println("Customer AccNo: " + this.accNo);
        System.out.println("Customer Current Balance: " + this.balance);
    }
}
