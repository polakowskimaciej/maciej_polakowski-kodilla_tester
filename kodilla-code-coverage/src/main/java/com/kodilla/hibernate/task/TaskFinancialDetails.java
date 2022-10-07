package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "TASKFINANCIALDETAILS")
public class TaskFinancialDetails {
    private int id;
    BigDecimal price;
    boolean paid;

    public TaskFinancialDetails(){}

    public TaskFinancialDetails(int id, BigDecimal price, boolean paid) {
        this.id = id;
        this.price = price;
        this.paid = paid;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId(){return id;}

    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {return price;}

    @NotNull
    @Column(name = "PAID")
    public boolean isPaid(){ return paid;}

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
