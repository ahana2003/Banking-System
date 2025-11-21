import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        Customer customer = new Customer(name);

        while (true) {
            System.out.println("\n----- BANK MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    customer.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    customer.withdraw(sc.nextDouble());
                    break;

                case 3:
                    customer.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
