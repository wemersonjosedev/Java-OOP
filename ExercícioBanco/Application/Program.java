package ExercícioBanco.Application;

import java.util.Locale;
import java.util.Scanner;

import ExercícioBanco.entites.Account;


public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account = new Account();

        System.out.println();

        System.out.println("*********************************");
        System.out.println("*          ACCOUNT BANK         *");
        System.out.println("*********************************");
        System.out.println();
        System.out.println("To access your bank, please enter the following information:");
        System.out.println();
        System.out.print("       Enter account number:      ");
        int accountNumber = sc.nextInt();
        account.addAccount(accountNumber);
        System.out.print("       Enter account holder:      ");
        String name = sc.nextLine();
        account.setName(name);
        System.out.println();


        System.out.print(" --->  Is there na initial deposit (y/n)?");
        String yn = sc.nextLine();
        System.out.println();
        if (yn.equalsIgnoreCase("y")) {
            System.out.print(" >  Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            account.depositAccount(deposit);
        }
        System.out.println();
        System.out.println("Account data:\n" + account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.depositAccount(deposit);
       
        System.out.println();
        System.out.println("Updated account data:\n" + account);
        System.out.println();

        System.out.print("Enter a withdraw value:");
        double withdraw = sc.nextDouble();
        account.withdrawAccount(withdraw);

        System.out.println("Updated account data:\n" + account);
        System.out.println();

        char y_n;

        do{
            System.out.println();
            System.out.println("-----------------------------------------------");
            System.out.println("|Do you want to make another transition? (y/n)|");
            System.out.println("-----------------------------------------------");

            System.out.print(" ---->  ");y_n = sc.next().charAt(0);

            if (y_n == 'y') {
                System.out.println();
                System.out.println("Deposit or Withdrawal?");
                String alternative = sc.next();
                if (alternative.equals("deposit")) {
                    System.out.print("Enter a deposit value: ");
                    deposit = sc.nextDouble();
                    account.depositAccount(deposit);

                    System.out.println();
                    System.out.println("Updated account data:\n" + account);
                    System.out.println();
                }
                else {
                    System.out.println();
                    System.out.print("Enter a withdraw value:");
                    withdraw = sc.nextDouble();
                    account.withdrawAccount(withdraw);

                    System.out.println();
                    System.out.println("Updated account data:\n" + account);
                    System.out.println();
                }

            }
        } while(y_n == 'y');


        System.out.println();
        System.out.println("Section finished.");
        System.out.println();

        sc.close();
        
    }
}
