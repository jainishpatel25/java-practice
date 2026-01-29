package ATM;

//
//import java.io.IOException;
//import java.security.KeyStore.Entry;
//import java.text.DecimalFormat;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.InputMismatchException;
//import java.util.Iterator;
//
//public class OptionMenu extends Account{
//    Scanner menuInput = new Scanner(System.in);
//    DecimalFormat moneyFormat =  new DecimalFormat("'$'###,##0.00");
//    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
//    int selection;
//    public void getLogin() throws IOException{
//        int x =1;
//        do {
//            try {
//                data.put(85111322, 9409);
//                data.put(85111323, 9410);
//                System.out.println("Welcome to the ATM Project!");
//                System.out.print("Enter Your Customber Number: ");
//                setCustomerNumber(menuInput.nextInt());
//                System.out.print("Enter Your Pin Number: ");
//                setPinNumber(menuInput.nextInt());
//            }catch(Exception e) {
//                System.out.println("\n" + "Invalid Charcter(s).Only numbers." + "\n");
//                x=2;
//            }
//            for(Map.Entry<Integer,Integer> entry : data.entrySet()) {
//                if(entry.getKey().equals(getCustomerNumber()) && entry.getValue().equals(getPinNumber())) {
//                    getAccoutType();
//                }
//            }
//            System.out.println("\n" + "Wrong Customber Number or Pin Number." + "\n");
//        }while(x==1);
//    }
//
//    public void getAccoutType() {
//        System.out.println("Select The Account Youwant to access: ");
//        System.out.println("Type 1 - Checking Account");
//        System.out.println("Type 2 - Saving Account");
//        System.out.println("Type 3 - Exit");
//        System.out.println("Choice");
//
//        selection = menuInput.nextInt();
//
//        switch (selection) {
//            case 1:
//                getChecking();
//                break;
//            case 2:
//                getSaving();
//                break;
//            case 3:
//                System.out.println("Thank You");
//                break;
//
//            default:
//                System.out.println("\n" + "Invalid Choice: " + "\n");
//                getAccoutType();
//        }
//    }
//
//
//    public void getChecking() {
//        System.out.println("Checking Account: ");
//        System.out.println("Type 1-View Balance");
//        System.out.println("Type 2-Withdraw Funds");
//        System.out.println("Type 3-Deposit Funds");
//        System.out.println("Type 4-Exit");
//        System.out.println("Choice: ");
//
//        selection = menuInput.nextInt();
//
//        switch (selection) {
//            case 1:
//                System.out.println("Checking Account Balance: " +moneyFormat.format(getCheckingBalance()));
//                getAccoutType();
//                break;
//            case 2:
//                getCheckingWithDrawInput();
//                getAccountType();
//                break;
//            case 3:
//                getCheckingDepositInput();
//                getAccoutType();
//                break;
//            case 4:
//                System.out.println("Thank you for using this ATM ");
//                break;
//            default:
//                System.out.println("\n" + "Invalid Choice: " + "\n");
//                getChecking();
//        }
//    }
//
//    public void getSaving() {
//        System.out.println("Saving Account: ");
//        System.out.println("Type 1-View Balance");
//        System.out.println("Type 2-Withdraw FUnds");
//        System.out.println("Type 3-Deposit Funds");
//        System.out.println("Type 4-Exit");
//        System.out.print("Choice: ");
//        switch (selection) {
//            case 1:
//                System.out.println("Saving Account Balance: " +moneyFormat.format(getSavingBalance()));
//                getAccoutType();
//                break;
//            case 2:
//                getSavingWithDrawInput();
//                getAccoutType();
//                break;
//            case 3:
//                getSavingDepositInput();
//                getAccoutType();
//                break;
//            case 4:
//                System.out.println("Thank you for using this ATM ");
//                break;
//            default:
//                System.out.println("\n" + "Invalid Choice: " + "\n");
//                getSaving();
//        }
//    }
//    public void getAccountType() {
//    }
//}


import java.util.Scanner;

public class OptionMenu extends ATMOperations {

    private Account account;
    private Scanner input = new Scanner(System.in);

    public OptionMenu(Account account) {
        this.account = account;
    }

    public boolean login() {
        System.out.print("Enter Customer Number: ");
        int custNum = input.nextInt();
        System.out.print("Enter PIN Number: ");
        int pin = input.nextInt();
        if (custNum == account.getCustomerNumber() && pin == account.getPinNumber()) {
            System.out.println("Login Successful!\n");
            return true;
        } else {
            System.out.println("Invalid Customer Number or PIN. Try again.\n");
            return false;
        }
    }

    @Override
    public void withdraw(double amount , int accountType) {

        if (accountType == 1) {
            if(account.withdrawCurrent(amount)) {
                System.out.println("Successfully Withdraw in Current Account");
            }} else if (accountType == 2) {
            if(account.withdrawSaving(amount)) {
                System.out.println("Successfully Withdraw in Saving Account");
            }
        }
        else {
            System.out.println("Invalid choice!");
        }
    }

    @Override
    public void deposit(double amount , int accountType) {
        if (accountType == 1) {
            account.depositCurrent(amount);
            System.out.println("Successfully Deposit in Current Account");
        } else if (accountType == 2) {
            account.depositSaving(amount);
            System.out.println("Successfully Deposit in Saving Account");
        } else {
            System.out.println("Invalid choice!");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + account.getCurrentBalance());
        System.out.println("Saving Balance: " + account.getSavingBalance());
    }

    public void showMenu() {
        super.welcomeMessage();
        int option;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            option = input.nextInt();
            switch (option) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.println("Choose Account: 1.Current  2.Saving");
                    int choice = input.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = input.nextDouble();
                    deposit(depAmount,choice);
                    break;

                case 3:
                    System.out.println("Choose Account: 1.Current  2.Saving");
                    int wchoice = input.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double withAmount = input.nextDouble();
                    withdraw(withAmount,wchoice);
                    break;

                case 4:
                    System.out.println("Thank you for using " + bank + " ATM!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (option != 4);
    }
}