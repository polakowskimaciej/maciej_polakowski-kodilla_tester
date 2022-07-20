package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMashineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMashine cashMashine = new CashMashine();
        int[] transactions = cashMashine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTransaction() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(10);
        int[] trasactions = cashMashine.getTransactions();
        assertEquals(1, trasactions.length);
        assertEquals(10, trasactions[0]);
    }

    @Test
    public void shouldNotAddZeroAsTransaction() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(0);
        assertEquals(0, cashMashine.getCount());
    }

    @Test
    public void shouldGetBalance() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(5);
        assertEquals(25, cashMashine.getBalance());
    }

    @Test
    public void shouldCountTransactions() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(10);
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(10);
        cashMashine.addTransaction(5);
        assertEquals(5, cashMashine.getCount());
    }

    @Test
    public void shouldGetHowManyIncomeTransactions() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(-10);
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(10);
        cashMashine.addTransaction(-5);
        assertEquals(3, cashMashine.getHowManyIncomeTransactions());
    }

    @Test
    public void shouldGetHowManyWithdrawalTransactions() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(-10);
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(10);
        cashMashine.addTransaction(-5);
        assertEquals(2, cashMashine.getHowManyWithdrawalTransactions());
    }
    @Test
    public void shouldGetValueOfIncomeTransactions() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(-10);
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(10);
        cashMashine.addTransaction(-5);
        assertEquals(20,cashMashine.getValueOfIncomeTransactions());
    }
    @Test
    public void shouldGetValueOfWithdrawalTransactions() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(-10);
        cashMashine.addTransaction(5);
        cashMashine.addTransaction(10);
        cashMashine.addTransaction(-5);
        assertEquals(15,cashMashine.getValueOfWithdravalTransactions());
    }
}
