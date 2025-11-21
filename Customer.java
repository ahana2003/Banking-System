public class Customer {
    private String name;
    private BankAccount account;

    public Customer(String name) {
        this.name = name;
        this.account = new BankAccount();
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void checkBalance() {
        System.out.println(name + "'s Balance: " + account.getBalance());
    }
}
