import java.text.DecimalFormat;
import java.util.Scanner;

public class Account_info {
    private int customerNum;
    private int pinNum;
    protected double currentBal = 0.0;
    protected double savingsBal = 0.0;

    Scanner sc = new Scanner(System.in);
    DecimalFormat money = new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNum){
        this.customerNum = customerNum;
        return customerNum;
    }

    public int getCustomerNumber(){
        return customerNum;
    }

    public int setCustomerPin(int pinNum){
        this.pinNum = pinNum;
        return pinNum;
    }

    public int getCustomerPin(){
        return pinNum;
    }


    public double calcCurrentWithdraw(double amount){
        currentBal = currentBal - amount;
        return currentBal;
    }

    public double calcSavingsWithdraw(double amount){
        savingsBal = savingsBal - amount;
        return savingsBal;
    }

    public double calcCurrentDeposit(double amount){
        currentBal = currentBal + amount;
        return currentBal;
    }

    public double calcSavingsDeposit(double amount){
        savingsBal = savingsBal + amount;
        return savingsBal;
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Enter amount you want withdraw from your Current account: ");
        int amt = sc.nextInt();

        if((currentBal-amt)>=0){
            calcCurrentWithdraw(amt);
            System.out.println("New current account balance is: "+currentBal);
        }
        else{
            System.out.println("Insufficient funds....");
        }
    }

    public void getCheckingDepositInput(){
        System.out.println("Enter amount you want deposit from your Current account: ");
        int amt = sc.nextInt();

        if((currentBal+amt)>=0){
            calcCurrentDeposit(amt);
            System.out.println("New current account balance is: "+currentBal);
        }
        else{
            System.out.println("Error...");
        }
    }

    public void getSavingsWithdrawInput(){
        System.out.println("Enter amount you want withdraw from your Savings account: ");
        int amt = sc.nextInt();

        if((savingsBal-amt)>=0){
            calcSavingsWithdraw(amt);
            System.out.println("New savings account balance is: "+savingsBal);
        }
        else{
            System.out.println("Insufficient funds....");
        }
    }

    public void getSavingsDepositInput(){
        System.out.println("Enter amount you want deposit from your Savings account: ");
        int amt = sc.nextInt();

        if((savingsBal+amt)>=0){
            calcSavingsDeposit(amt);
            System.out.println("New savings account balance is: "+savingsBal);
        }
        else{
            System.out.println("Error...");
        }
    }


}
