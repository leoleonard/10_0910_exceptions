package one;

import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(new Person(), 1000, 500);

        Scanner scanner = new Scanner(System.in);
        boolean finish = false;

        do {
            System.out.println("Co chcesz zrobić?");
            System.out.println("1: wplata");
            System.out.println("2: wyplata");
            System.out.println("3: koniec");
            System.out.println("4: saldo");

            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    //wplata
                    System.out.println("Ile chcesz wpłacić?");
                    double amount = scanner.nextDouble();
                    bankAccount.deposit(amount);
                    System.out.println("Obecny stan konta to: " + bankAccount.getMoney());
                    break;
                case 2:
                    //wyplata
                    boolean finishWithDraw = false;

                    do {

                        System.out.println("Ile chcesz wypłacić? 0 -> wyjście");
                        double withdrawAmount = scanner.nextDouble();


                        if (withdrawAmount == 0) {
                            break;
                        }

                        try {
                            bankAccount.withdraw(withdrawAmount);
                            finishWithDraw = true;
                        } catch (NotEnoughBalanceException e) {
                            System.out.println("Brak srodkow na koncie");
                        } catch (LimitExceededException e2) {
                            System.out.println("Limit wyplaty przekroczony");
                        }
                    } while (!finishWithDraw);

                    System.out.println("Obecny stan konta to: " + bankAccount.getMoney());
                    break;

                case 4:
                    System.out.println("Obecny stan konta to: " + bankAccount.getMoney());
                    break;

                case 3:
                    finish = true;
                    System.out.println("Bye bye");
                    //koniec
                default:
                    System.out.println("Wybrano nieprawidłową opcję");
            }
        } while (!finish);
    }
}
