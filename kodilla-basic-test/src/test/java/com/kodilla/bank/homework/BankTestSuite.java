package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

@Test
public void shouldAddTransaction() {
    Bank bank = new Bank();
    bank.cashMashines[0].addTransaction(5);
    assertEquals(1,bank.cashMashines[0].getSize());
}
    @Test
    public void shouldGetHowManyIncomeTotal() {
        Bank bank = new Bank();
        bank.cashMashines[0].addTransaction(5);
        bank.cashMashines[0].addTransaction(-10);
        bank.cashMashines[0].addTransaction(-5);
        bank.cashMashines[0].addTransaction(10);
        bank.cashMashines[1].addTransaction(5);
        bank.cashMashines[1].addTransaction(-10);
        bank.cashMashines[1].addTransaction(-5);
        bank.cashMashines[1].addTransaction(10);
        bank.cashMashines[2].addTransaction(5);
        bank.cashMashines[2].addTransaction(-10);
        bank.cashMashines[2].addTransaction(-5);
        bank.cashMashines[2].addTransaction(10);
        assertEquals(6,bank.getHowManyIncomeTransactionsTotal());

    }
    @Test
    public void shouldGetHowManyWithdrawalTotal() {
        Bank bank = new Bank();
        bank.cashMashines[0].addTransaction(5);
        bank.cashMashines[0].addTransaction(-10);
        bank.cashMashines[0].addTransaction(-5);
        bank.cashMashines[0].addTransaction(10);
        bank.cashMashines[1].addTransaction(5);
        bank.cashMashines[1].addTransaction(-10);
        bank.cashMashines[1].addTransaction(-5);
        bank.cashMashines[1].addTransaction(10);
        bank.cashMashines[2].addTransaction(5);
        bank.cashMashines[2].addTransaction(-10);
        bank.cashMashines[2].addTransaction(-5);
        bank.cashMashines[2].addTransaction(10);
        assertEquals(6,bank.getHowManyWithdrawalTransactionsTotal());

    }
    @Test
    public void shouldGetTotalBalance() {
        Bank bank = new Bank();
        bank.cashMashines[0].addTransaction(5);
        bank.cashMashines[0].addTransaction(-10);
        bank.cashMashines[0].addTransaction(-5);
        bank.cashMashines[0].addTransaction(10);
        bank.cashMashines[1].addTransaction(5);
        bank.cashMashines[1].addTransaction(-10);
        bank.cashMashines[1].addTransaction(-5);
        bank.cashMashines[1].addTransaction(10);
        bank.cashMashines[2].addTransaction(5);
        bank.cashMashines[2].addTransaction(-10);
        bank.cashMashines[2].addTransaction(-5);
        bank.cashMashines[2].addTransaction(10);
        assertEquals(0,bank.getTotalBalance());
    }
    @Test
    public void shouldGetAverageOfWithdravalTransactionsTotal() {
        Bank bank = new Bank();
        bank.cashMashines[0].addTransaction(5);
        bank.cashMashines[0].addTransaction(-10);
        bank.cashMashines[0].addTransaction(-5);
        bank.cashMashines[0].addTransaction(10);
        bank.cashMashines[1].addTransaction(5);
        bank.cashMashines[1].addTransaction(-10);
        bank.cashMashines[1].addTransaction(-5);
        bank.cashMashines[1].addTransaction(10);
        bank.cashMashines[2].addTransaction(5);
        bank.cashMashines[2].addTransaction(-10);
        bank.cashMashines[2].addTransaction(-5);
        bank.cashMashines[2].addTransaction(10);
        assertEquals(7.50,bank.getAverageOfWithdravalTransactionsTotal(), 0.0001);

    }
    @Test
    public void shouldGetAverageOfIncomeTransactionsTotal() {
        Bank bank = new Bank();
        bank.cashMashines[0].addTransaction(5);
        bank.cashMashines[0].addTransaction(-10);
        bank.cashMashines[0].addTransaction(-5);
        bank.cashMashines[0].addTransaction(10);
        bank.cashMashines[1].addTransaction(5);
        bank.cashMashines[1].addTransaction(-10);
        bank.cashMashines[1].addTransaction(-5);
        bank.cashMashines[1].addTransaction(10);
        bank.cashMashines[2].addTransaction(5);
        bank.cashMashines[2].addTransaction(-10);
        bank.cashMashines[2].addTransaction(-5);
        bank.cashMashines[2].addTransaction(10);
        assertEquals(7.5,bank.getAverageOfIncomeTransactionsTotal(), 0.0001);

    }
}
