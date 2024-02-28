import java.util.Scanner;

class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
    balance = initialBalance;
}
public double getBalance(){
    return balance;
}
public void deposit(double amount){
    balance += amount;
    System.out.println("Deposit successful.currentbalance:"+balance);
}
public void withdraw(double amount){
    if(balance >= amount){
        balance -= amount;
        System.out.println("withdraw successful.currentbalance:"+ balance);
    }else{
        System.out.println("Insufficient funds.withdrawl failed.");
    }
}
}

class Atm{
    private BankAccount account;
    public Atm(BankAccount account){
        this. account=account;
    }
    public void displayOptions(){
        System.out.println("1.Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public void performOption(int Option, Scanner scanner){
        switch(Option) 
        {
            case 1:
            System.out.println("current balance:"+ account.getBalance());

            break;

            case 2:
            System.out.println("Enter deposit amount:");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);
            break;

            case 3:
            System.out.println("Enter withdraw amount:");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);
            break;

            case 4:
            System.out.println("Exting.....");
            System.exit(0);

            default:
            System.out.println("Invalid Option.");

        }
    } 
    
}

public class AtmInterface{
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0);
        Atm atm = new Atm(userAccount);
        Scanner scanner = new Scanner (System.in);

        while(true){
            atm.displayOptions();
            System.out.print("Enter option:");

            int option = scanner.nextInt();
            atm.performOption(option,scanner);
        }

    }
}