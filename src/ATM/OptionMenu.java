package ATM;


import java.io.IOException;
import java.security.KeyStore.Entry;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Iterator;

public class OptionMenu extends Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat =  new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    int selection;
    public void getLogin() throws IOException{
        int x =1;
        do {
            try {
                data.put(85111322, 9409);
                data.put(85111323, 9410);
                System.out.println("Welcome to the ATM Project!");
                System.out.print("Enter Your Customber Number: ");
                setCustomerNumber(menuInput.nextInt());
                System.out.print("Enter Your Pin Number: ");
                setPinNumber(menuInput.nextInt());
            }catch(Exception e) {
                System.out.println("\n" + "Invalid Charcter(s).Only numbers." + "\n");
                x=2;
            }
            for(Map.Entry<Integer,Integer> entry : data.entrySet()) {
                if(entry.getKey().equals(getCustomerNumber()) && entry.getValue().equals(getPinNumber())) {
                    getAccoutType();
                }
            }
            System.out.println("\n" + "Wrong Customber Number or Pin Number." + "\n");
        }while(x==1);
    }

    public void getAccoutType() {
        System.out.println("Select The Account Youwant to access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.println("Choice");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank You");
                break;

            default:
                System.out.println("\n" + "Invalid Choice: " + "\n");
                getAccoutType();
        }
    }


    public void getChecking() {
        System.out.println("Checking Account: ");
        System.out.println("Type 1-View Balance");
        System.out.println("Type 2-Withdraw Funds");
        System.out.println("Type 3-Deposit Funds");
        System.out.println("Type 4-Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance: " +moneyFormat.format(getCheckingBalance()));
                getAccoutType();
                break;
            case 2:
                getCheckingWithDrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccoutType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM ");
                break;
            default:
                System.out.println("\n" + "Invalid Choice: " + "\n");
                getChecking();
        }
    }

    public void getSaving() {
        System.out.println("Saving Account: ");
        System.out.println("Type 1-View Balance");
        System.out.println("Type 2-Withdraw FUnds");
        System.out.println("Type 3-Deposit Funds");
        System.out.println("Type 4-Exit");
        System.out.print("Choice: ");
        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance: " +moneyFormat.format(getSavingBalance()));
                getAccoutType();
                break;
            case 2:
                getSavingWithDrawInput();
                getAccoutType();
                break;
            case 3:
                getSavingDepositInput();
                getAccoutType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM ");
                break;
            default:
                System.out.println("\n" + "Invalid Choice: " + "\n");
                getSaving();
        }
    }
    public void getAccountType() {
    }
}