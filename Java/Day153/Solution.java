class BankAccount{
    private int balance;

    public BankAccount(){
        this.balance = 0;
    }
    public void deposit(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    public void withdraw(int amount){
        if(amount < balance){
            balance -= amount;
            System.out.println("Withdraw amount: " + balance);
        } else{
            System.out.println("Insufficinet fund for withdrawal: " + amount);
        }
    }
    public void checkBalance(){
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.deposit(800);
        account.withdraw(400);
        account.withdraw(500);
        account.checkBalance();
    }
}