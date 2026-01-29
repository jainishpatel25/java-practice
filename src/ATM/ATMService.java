package ATM;

public interface ATMService {

//    void withdraw(double amount);
//    void deposit(double amount);
//    void checkBalance();


    void withdraw(double amount, int accountType);
    void deposit(double amount, int accountType );
    void checkBalance();
}
