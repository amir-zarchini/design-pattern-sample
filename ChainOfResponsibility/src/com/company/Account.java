package com.company;

abstract class Account {
    private Account successor;
    protected Integer balance;

    public void setNext(Account account) {
        successor = account;
    }

    public void pay(Integer amountToPay) throws Exception {
        String accountType = this.getClass().getName();
        if (canPay(amountToPay)) {
            System.out.println("Successful payment ($" + amountToPay +") by " + accountType + " account" );
        } else if (this.successor != null) {
            System.out.println("Cannot pay by " + accountType + " account. Proceeding...");
            successor.pay(amountToPay);
        } else {
            throw new Exception("None of the accounts have enough balance");
        }
    }

    private boolean canPay(Integer amount) {
        return balance >= amount;
    }
}
