package com.company.task2.entity;

public class DemandDeposit extends Deposit {
    double surrender;

    public DemandDeposit() {
    }

    public DemandDeposit(double surrender) {
        this.surrender = surrender;
    }

    public DemandDeposit(String bankName, Country country, Depositor depositor, double surrender) {
        super(bankName, country, depositor);
        this.surrender = surrender;
    }

    public double getSurrender() {
        return surrender;
    }

    public void setSurrender(double surrender) {
        this.surrender = surrender;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Demand Deposit").append('\n');
        sb.append(super.toString());
        sb.append("\t\tSurrender: ").append(surrender);
        sb.append("\n\n");
        return sb.toString();
    }
}
