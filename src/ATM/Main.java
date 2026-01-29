package ATM;

//import java.io.IOException;
//
//public class Main {
//
//    static void main(String[] args) throws IOException {
//        OptionMenu om=new OptionMenu();
//        om.getLogin();
//    }
//}
public class Main {
    public static void main(String[] args) {

        Account account = new Account();
        account.setCustomerNumber(12345);
        account.setPinNumber(6789);


        OptionMenu optionMenu = new OptionMenu(account);


        if (optionMenu.login()) {
            optionMenu.showMenu();
        }
        // Start the ATM menu
//        optionMenu.showMenu();
    }
}