import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Menu extends Account_info{
    Scanner sc = new Scanner(System.in);
    HashMap<Integer,Integer> data = new HashMap<>();


    public void getLogin() throws IOException{
        int x = 1;
        do {
            try{
                data.put(12345,1207);
                data.put(78955,1313);

                System.out.println("Welcome to the JAVA ATM!!");
                System.out.println("Please enter your account number to begin...");
                setCustomerNumber(sc.nextInt());
                System.out.println("Please enter your account password to begin...");
                setCustomerPin(sc.nextInt());
            }
            catch(Exception e){
                System.out.println("Invalid account credentials");
                x=2;
            }

            int cn = getCustomerNumber();
            int pn = getCustomerPin();
            if(data.containsKey(cn) && data.get(cn)==pn){
                getAccountType();
            }
            else{
                System.out.println("Wrong account details.");
            }
        }while (x==1);
    }

    public void getAccountType(){
        System.out.println("Select your account type: ");
        System.out.println("1.Current account");
        System.out.println("2.Savings account");
        System.out.println("3.Exit");

        int choice = sc.nextInt();
        switch (choice){
            case 1:
                getCurrent();
                break;
            case 2:
                getSavings();
                break;
            case 3:
                System.out.println("Thank you for visiting JAVA ATM....");
                break;
            default:
                System.out.println("Wrong option selected.");
        }
    }

    private void getCurrent() {
        System.out.println("Current Account: ");
        System.out.println("1.Check balance");
        System.out.println("2.Withdraw amount");
        System.out.println("3.Deposit amount");
        System.out.println("4.Exit");

        System.out.println("Choice: ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println(currentBal);
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for visiting JAVA ATM....");
                break;
            default:
                System.out.println("Bad choice!!");
        }
    }

    private void getSavings() {
        System.out.println("Savings Account: ");
        System.out.println("1.Check balance");
        System.out.println("2.Withdraw amount");
        System.out.println("3.Deposit amount");
        System.out.println("4.Exit");

        System.out.println("Choice: ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println(savingsBal);
                getAccountType();
                break;
            case 2:
                getSavingsWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingsDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for visiting JAVA ATM....");
                break;
            default:
                System.out.println("Bad choice!!");
        }
    }
}
