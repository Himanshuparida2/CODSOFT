import java.util.*;
interface ATM{
    public static double amount = 0;
    public static double balance=0;
    double withdraw(double amount);
    double deposit(double amount);
    void CheckBalance();
}
public class ATMmachine implements ATM {
    double balance;
    double amount;
    int AccountNumber;
    @Override
    public double withdraw(double amount){
        if(CheckBalance(balance)>amount){
            System.out.println("\n Rs."+amount +" has been withdrawed from Your Bank Account "+AccountNumber+"\n") ;
            System.out.println("Transaction Succesfull...");
            balance-=amount;
            return balance;
        }
        else{
            System.out.println("Insufficient Balance");
            return balance;
        }
    }
    @Override
   public double deposit(double amount){
    balance+=amount;
    System.out.println("\n Rs."+amount+" has Successfully Deposited in Your Bank Account "+AccountNumber+"\n");
    System.out.println("Transaction Succesfull...");
    return balance;
    }
    public double CheckBalance(double balance){
        this.balance=balance;
        return balance;
    }
    @Override
    public void CheckBalance(){
        System.out.println("Your Bank Account "+AccountNumber+" have a balance of Rs. "+balance);
    }
}
class userbank extends ATMmachine{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        userbank sbi=new userbank();
        System.out.println("Enter Your Name: ");
        sc.nextLine();
        Random random=new Random();
        sbi.AccountNumber=random.nextInt(900000)+100000;
        sbi.balance=1000;
        int choice=0;
        while(choice!=4){
            System.out.println("---------------------------------------------");
            System.out.println("Choice Your Option");
            System.out.println("Press 1 : Withdraw");
            System.out.println("Press 2 : Deposite");
            System.out.println("Press 3 : Check Balance");
            System.out.println("Press 4 : Exit");
            System.out.println("---------------------------------------------");
            choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Amount: ");
                double amount=sc.nextDouble();
                sbi.withdraw(amount);
                break;
            case 2:
                System.out.println("Enter Amount: ");
                double amount1=sc.nextDouble();
                sbi.deposit(amount1);
                break;
            case 3:
                System.out.println();
                sbi.CheckBalance();
                break;
            default:
                System.out.println("\nThank you!!!");
                break;
        }
    }
        System.out.println("---------------------------------------------");
        sc.close();
    }
}