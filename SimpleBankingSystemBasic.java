import java.util.Scanner;

public class SimpleBankingSystemBasic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0;
        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = input.nextDouble();
                balance += amount;
                System.out.println("Deposit successful.");
            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amount = input.nextDouble();
                if (amount > balance) {
                    System.out.println("Insufficient balance.");
                } else {
                    balance -= amount;
                    System.out.println("Withdrawal successful.");
                }
            } else if (choice == 3) {
                System.out.println("Your balance is: $" + balance);
            } else if (choice == 4) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }
}