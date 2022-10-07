package com.kodilla.jacoco;

public class Year {
     int inputYear;

    public Year(int inputYear) {
        this.inputYear = inputYear;
    }

    public boolean isLeap() {
        return (this.inputYear % 4 == 0 && this.inputYear % 100 != 0)
                || (this.inputYear % 4 == 0
                    && this.inputYear % 100 == 0
                        && this.inputYear % 400 == 0);
    }
}