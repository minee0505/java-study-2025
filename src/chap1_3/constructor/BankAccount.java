package chap1_3.constructor;

public class BankAccount {
    int accountNumber;
    String owner;
    int balance;

    BankAccount(int accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int amount){
        balance = balance + amount;
    }

    void withdraw(int amount){
        if (isBalanceNotValid(this.balance)) {
            System.out.println("잔액부족");
            return ;
        }
        balance = balance - amount;
    }

    void displayBalance(){
        System.out.println("balance = " + balance);
    }

    boolean isBalanceNotValid(int balance){
        return balance < 0;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1002056, "kim", 500);
        bankAccount.withdraw(100);
        bankAccount.deposit(1000);
        bankAccount.displayBalance();
    }
}
