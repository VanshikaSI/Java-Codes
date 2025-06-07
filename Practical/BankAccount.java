import java.util.*;

public class BankAccount {
    int accno, bal, wit, dep;
    String name, acctype;

    public void input() {
        System.out.println("Enter your name, account type, account number, balance:");
        Scanner s = new Scanner(System.in);
        name = s.next();
        acctype = s.next();
        accno = s.nextInt();
        bal = s.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name + " Account type: " + acctype + " Account no.: " + accno + " Balance: " + bal);
    }

    public void withdraw() {
        System.out.println("Enter the amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        wit = sc.nextInt();
        
        if (wit > bal) {
            System.out.println("Invalid request: Insufficient funds");
        } else {
            bal = bal - wit;
            System.out.println("Withdrawal successful. New balance: " + bal);
        }
    }

    public void deposit() {
        System.out.println("Enter the value to be deposited:");
        Scanner sc = new Scanner(System.in);
        dep = sc.nextInt();
        bal = bal + dep;
        System.out.println("Deposit successful. New balance: " + bal);
    }
}

