package one;
//wyjątki

public class BankAccount {
    private Person person;
    private double money;
    private double limit;

    public double getMoney() {
        return money;
    }


    public BankAccount(Person person, double money, double limit) {
        if (person == null) {
            throw new NullPointerException("person cannot be null");
        }
        this.person = person;
        this.money = money;
        this.limit = limit;
    }

    public void deposit(double amount) {
//            money = money + amount;
        money += amount;
    }

    public void withdraw(double amount) {
        if (money >= amount) {

            if (amount <= limit) {
                money -= amount;
            } else {
                throw new LimitExceededException();
            }

        } else {
            throw new NotEnoughBalanceException();
        }
    }
}


