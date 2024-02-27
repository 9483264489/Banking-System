import java.util.Scanner;
public class bank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;

        boolean isBank = true;
        while (isBank) {
            System.out.println("Welcome to Basic Banking System");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = scanner.nextInt();
                    if (depositAmount > 0) {
                        balance =balance + depositAmount;
                        System.out.println("Deposit successful. Current balance: " + balance);
                    } 
                    else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmount = scanner.nextInt();
                    if (withdrawAmount > 0) {
                        balance =balance - withdrawAmount;
                        System.out.println("Withdrawal successful. Current balance: " + balance);
                    }
                    else {
                        System.out.println("Invalid amount or insufficient funds.");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using Basic Banking System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        
    }
}


