package ATM;

//Abstract class to enforce ATM operation blueprint
public abstract class ATMOperations implements ATMService {

    public static final String BANK_NAME = "1RIVET BANK";


    public void welcomeMessage() {
        System.out.println("Welcome to " + BANK_NAME + " ATM Services!");
    }
}