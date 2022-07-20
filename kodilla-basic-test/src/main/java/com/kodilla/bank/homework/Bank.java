package com.kodilla.bank.homework;

public class Bank {
    // tablica bankomatów
    CashMashine[] cashMashines = new CashMashine[3];

    public void fillArrays() {
        for(int i=0; i<cashMashines.length; i++)
            cashMashines[i] =new CashMashine();
    }

    public CashMashine[] getCashMashines() {
        return cashMashines;
    }
    //metoda całkowity bilans ze wszystkich bankomatów,
    public int getTotalBalance() {
        int totalBalance = 0;
        for (CashMashine cashMashine : this.cashMashines) {
            totalBalance += cashMashine.getBalance();
        }
        return totalBalance;
    }

    // metoda liczbę transakcji związanych z wypłatą,
    public int getHowManyIncomeTransactionsTotal() {
        // zmienna - ilość transakcji dodatnich
        int countIncomeOfTransactionsTotal = 0;
        // pętla - zrób metodę dla każdego bankomatu
        // może w klasie CashMashine policzyć wszystkie transakcjie wpłat i tutaj
        //dodać to już policzone?
        for (CashMashine cashMashine : this.cashMashines) {
            //pobierz transakcj
            //mam teraz tablicę intów, muszę sprawdzić każdy element tablicy
            //czy jest większy od zera

            //pętla - jeśli obiekt w tablicy - transakcja - większy od zera to dodaj jeden
            // dodaj zliczanie transakcji ze wszystkich bankomatów
            countIncomeOfTransactionsTotal += cashMashine.getHowManyIncomeTransactions();
            // metoda liczbę transakcji związaną z wpłatą pieniędzy,

        }
        return countIncomeOfTransactionsTotal;
    }

    public int getHowManyWithdrawalTransactionsTotal() {
        int countWithdrawalTransactionsTotal = 0;
        for (CashMashine cashMashine : this.cashMashines)
            countWithdrawalTransactionsTotal += cashMashine.getHowManyWithdrawalTransactions();
        return countWithdrawalTransactionsTotal;
    }

    // metoda średnią wartość wypłaty,
    // to tak jak wyżej z tym liczeniem - najpierw metoda na wartość wszystkich transakcji w cashMashine
    public double getAverageOfWithdravalTransactionsTotal() {
        double average;
        double totalWtihdrawalValue = 0;
        double totalWithdrawalCount = 0;
        for (CashMashine cashMashine : this.cashMashines)
            totalWtihdrawalValue += cashMashine.getValueOfWithdravalTransactions();
        for (CashMashine cashMashine : this.cashMashines)
            totalWithdrawalCount += cashMashine.getHowManyWithdrawalTransactions();
        average = totalWtihdrawalValue / totalWithdrawalCount;
        return average;
    }

    // metoda średnią wartość wpłaty
    public double getAverageOfIncomeTransactionsTotal() {
        double average;
        double totalIncomeValue = 0;
        for (CashMashine cashMashine : this.cashMashines)
            totalIncomeValue += cashMashine.getValueOfIncomeTransactions();
        double totalIncomeCount = 0;
        for (CashMashine cashMashine : this.cashMashines)
            totalIncomeCount += cashMashine.getHowManyIncomeTransactions();
        average = totalIncomeValue / totalIncomeCount;
        return average;
    }
}
