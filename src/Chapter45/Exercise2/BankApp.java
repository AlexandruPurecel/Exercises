package Chapter45.Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankApp {


    private void mainMenu(){
        System.out.println("""
            Welcome to the bank!
            1 for creating new Account
            2 if you already have an account
            3 exit
            Please choose an option:\s""");
    }

    private void run(){
        Scanner sc  = new Scanner(System.in);
        BankAccount system = new BankAccount();
        List<BankAccount> accounts = system.populateBankAccounts();
        while(true) {
            mainMenu();
            int choice =  sc.nextInt();
            switch (choice) {

                case 1 -> {
                    sc.nextLine();
                    System.out.print("Please enter your name: ");
                    String name = sc.nextLine();
                    Random rand = new Random();
                    int num = rand.nextInt(99) + 1;
                    system.createAccount(num, name, 0);
                    System.out.println("New account generated for " + name + " with number " + num );
                }
                case 2 -> {
                    sc.nextLine();
                    System.out.println("Please enter your name: ");
                    String name = sc.nextLine();
                    BankAccount foundAccount = null;
                    for (BankAccount account : accounts) {
                        if (account.getOwner().equals(name)) {
                            foundAccount = account;
                            break;

                        }
                    }

                    if(foundAccount == null) {
                        System.out.println("Account with name: " + name + " not found, navigating back to main menu");
                        break;
                    }

                    System.out.println("Account with name: " + name + " and with number " + foundAccount.getAccountNumber() + "found");
                    System.out.print("""
                                Choose an option:
                                1 for adding money
                                2 for withdraw
                                """);
                    int choose =  sc.nextInt();
                    switch (choose) {
                        case 1 -> {
                            System.out.println("Your current balance is: " + foundAccount.getBalance());
                            System.out.print("Please enter the amount you want to add: ");
                            int amount = sc.nextInt();
                            system.deposit(foundAccount, amount);
                        }
                        case 2 -> {
                            System.out.println("Your current balance is: " + foundAccount.getBalance());
                            System.out.print("Please enter the amount you want to withdraw: ");
                            int amount = sc.nextInt();
                            system.withdraw(foundAccount, amount);
                        }
                        default -> System.out.print("Invalid option");
                    }
                }
                case 3 -> {
                    System.out.print("Bye bye!");
                    sc.close();
                    return;
                }

            }
        }

    }




    void main() {
        run();
    }

}