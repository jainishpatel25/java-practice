package ATM;


import java.util.Scanner;

import java.text.DecimalFormat;



public class Account {

    private double CheckingBalance = 0;
    private double SavingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat =  new DecimalFormat("'$'###,##0.00");

    private int CustomerNumber;
    private int PinNumber;

    public int setCustomerNumber(int customerNumber) {
        this.CustomerNumber=customerNumber;
        return customerNumber;
    }

    public int getCustomerNumber() {
        return CustomerNumber;
    }

    public int setPinNumber(int Pinnumber) {
        this.PinNumber = Pinnumber;
        return Pinnumber;
    }

    public int getPinNumber() {
        return PinNumber;
    }

    public double getCheckingBalance() {
        return CheckingBalance;
    }

    public double getSavingBalance() {
        return SavingBalance;
    }

    public double calcCheckingWithDraw(double amount)
    {
        CheckingBalance=(CheckingBalance-amount);
        return CheckingBalance;
    }

    public double calcSavingWithDraw(double amount)
    {
        SavingBalance=(SavingBalance-amount);
        return SavingBalance;
    }

    public double calcChekingDeposit(double amount) {
        CheckingBalance = (CheckingBalance+amount);
        return CheckingBalance;
    }

    public double calcSavingDeposit(double amount) {
        SavingBalance = (SavingBalance+amount);
        return SavingBalance;
    }

    public void getCheckingWithDrawInput() {
        System.out.println("Checking Account Balance: " +moneyFormat.format(CheckingBalance));
        System.out.println("Amount you want to withdraw from checking Account: ");
        double amount = input.nextDouble();
        if((CheckingBalance - amount )>=0) {
            calcCheckingWithDraw(amount);
            System.out.println("Now checking Account Balance: " +moneyFormat.format(CheckingBalance));
        }else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public void getSavingWithDrawInput() {
        System.out.println("Saving Account Balance: " +moneyFormat.format(SavingBalance));
        System.out.println("Amount you want to withdraw from saving Account: ");
        double amount = input.nextDouble();
        if((SavingBalance - amount )>=0) {
            calcSavingWithDraw(amount);
            System.out.println("Now checking Account Balance: " + SavingBalance + "\n");
        }else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance: " +moneyFormat.format(CheckingBalance));
        System.out.println("Amount you want to deposit from checking Account: ");
        double amount = input.nextDouble();
        if((CheckingBalance + amount ) >= 0) {
            calcChekingDeposit(amount);
            System.out.println("New checking Account Balance: " +moneyFormat.format(CheckingBalance));
        }else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public void getSavingDepositInput() {
        System.out.println("Saving Account Balance: " +moneyFormat.format(SavingBalance));
        System.out.println("Amount you want to deposit from Saving Account: ");
        double amount = input.nextDouble();
        if((SavingBalance + amount ) >= 0) {
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balance: " +moneyFormat.format(SavingBalance));
        }else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }
}
