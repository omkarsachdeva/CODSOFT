import java.util.*;

class Account {
    double bal;

    public Account(double init_bal) {
        bal = init_bal;
    }

    public double Balance() {
        return bal;
    }

    public void Deposit(double amt) {
        bal += amt;
    }

    public boolean withdraw(double amt) {
        if (amt <= bal) {
            bal -= amt;
            return true;
        }
        return false;
    }
}

class Atm1 {

    Account acc;

    public Atm1(Account Bankaccount) {
        acc = Bankaccount;
    }

    public void Menu() {
        System.out.println("Atm Menu, Choose an option");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Withdraw Amount");
    }

    public void transact() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Menu();
            System.out.println("Select");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Balance" + acc.Balance());
                    break;
                case 2:
                    System.out.println("Enter Amount to Deposit");
                    double dep_amount = sc.nextDouble();
                    acc.Deposit(dep_amount);
                    System.out.println("Updated Balance " + acc.Balance());
                    break;
                case 3:
                    System.out.println("Enter Amount to Withdraw");
                    double with_amt = sc.nextDouble();
                    if (acc.withdraw(with_amt)) {
                        System.out.println("Withdraw done. Updated Balance" + acc.Balance());
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

public class Atm {
    public static void main(String[] args) {
        Account userAccount = new Account(10000);
        Atm1 atm1 = new Atm1(userAccount);
        atm1.transact();
    }
}