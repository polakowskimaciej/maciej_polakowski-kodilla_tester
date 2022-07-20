package com.kodilla.bank.homework;

public class CashMashine {
    //potrzebne tablice do zapisywania transakcji
    private int[] transactions;
    private int size;
    private int count;

    // pewnie to tablice double bo grosze też są w obiegu
    // ale zrobimy tablice int bo łatwiej
    // konstruktor bankomatu
    public CashMashine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    // metoda na dodanie transakcji
    public void addTransaction(int transaction) {
        if (transaction == 0) {
            return;
        }
        this.size++;
        int[] newTransaction = new int[this.size];
        System.arraycopy(transactions, 0, newTransaction, 0, transactions.length);
        newTransaction[this.size - 1] = transaction;
        this.transactions = newTransaction;
        //tutaj jakieś zabezpieczenie, że nie można dodać zera jako transakcji
    }

    public int[] getTransactions() {
        return transactions;
    }

    // metoda zawierając saldo
    public int getBalance() {
        int balance = 0;
        for (int transaction : this.transactions) {
            balance += transaction;
        }
        return balance;
    }

    // metoda liczba wykonanych transakcji - counter był gdzieś
// ale rozmiar tablicy to ilość wykonywanych transakcji, nie?
    // ok, ale może counter osobno, bo size jest do czego innego
    public int getCount() {
        return size;
    }

    public void incrementCount() {
        this.size++;
    }

    public int getSize() {
        return size;
    }

    //metoda na ile jest transakcji dodatnich
    public int getHowManyIncomeTransactions() {
        int countIncomeTransactions = 0;
        for (int transaction : this.transactions)
            if (transaction > 0) {
                countIncomeTransactions++;
            }
        return countIncomeTransactions;
    }

    public int getHowManyWithdrawalTransactions() {
        int countWithdrawalTransactions = 0;
        for (int transaction : this.transactions)
            if (transaction < 0) {
                countWithdrawalTransactions++;
            }
        return countWithdrawalTransactions;
    }

    //zlicz wartość wszystkich transakcji
    public int getValueOfWithdravalTransactions() {
        int valueOfTransactions = 0;
        for (int transaction : this.transactions)
            if (transaction < 0) {
                valueOfTransactions += -transaction;
            }
        return valueOfTransactions;
    }
    public int getValueOfIncomeTransactions() {
        int valueOfTransactions = 0;
        for (int transaction : this.transactions)
            if (transaction > 0) {
                valueOfTransactions += transaction;
            }
        return valueOfTransactions;
    }
}
