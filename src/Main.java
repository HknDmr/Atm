import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To View Balance: 1 \n" +
                "Cash Withdraw: 2 \n" +
                "To Deposit Money To A Different Account: 3 \n" +
                "Quit: Q \n" +
                "Press: ");
        int transactions = scanner.nextInt();


        switch (transactions) {
            case 1:
                System.out.println("Your Balance " + 1000 + " Euro");
                break;
            case 2:
                System.out.println("Please Enter The Amount You Want To Withdraw:");
                int amount = scanner.nextInt();
                System.out.println(amount + " Your Money Is Being Given Please Don't Forget To Take Your Card After You Get Your Money\n");
                break;
            case 3:
                System.out.println("Please select country code \n" + 1 + ":TR \n" + 2 + " :Estonia");
                int countryiban = scanner.nextInt();
                switch (countryiban) {
                    case 1:
                        System.out.println("Please Enter The Iban Number");
                        break;
                    case 2:
                        System.out.println("Please Enter The Iban Number");
                        break;
                }
                long iban = scanner.nextLong();
                System.out.println("Money Is Sent");
                break;
            case 4:
                System.out.println("Good Bye");
                break;
            default:
                System.out.println("Please Enter Correctly!\n");
        }

    }
}