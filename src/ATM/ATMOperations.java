package ATM;

//Abstract class to enforce ATM operation blueprint
public abstract class ATMOperations implements ATMService {

    public static final String bank = "1RIVET BANK";


    public void welcomeMessage() {
        System.out.println("Welcome to " + bank + " ATM Services!");
    }
}