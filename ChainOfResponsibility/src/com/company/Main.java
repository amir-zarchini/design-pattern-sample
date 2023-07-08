package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        // Creating payment accounts
        Bank bank = new Bank(100);      // Bank     balance 100
        Paypal paypal = new Paypal(200);    // Paypal   balance 200
        Bitcoin bitcoin = new Bitcoin(300);   // Bitcoin  balance 300

        // Creating payment chain
        // Bank -> Paypal -> Bitcoin
        bank.setNext(paypal);
        paypal.setNext(bitcoin);

        // Do pay
        bank.pay(259);
        // Cannot pay by Bank account.   Proceeding...
        // Cannot pay by Paypal account. Proceeding...
        // Successful payment ($259) by Bitcoin account!

    }
}

