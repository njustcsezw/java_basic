package njustz.basiclib.process;

/**
 * @author njustz
 * @date 2020/3/8
 */

class Account{
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amt){
        if(amt>0){
            balance += amt;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":存钱成功，余额为：" + balance);
        }
    }
}

class Customer extends Thread{

    private  Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            account.deposit(1000);
        }
    }
}


public class ThreadAccountTest {

    public static void main(String[] args) {
        Account account = new Account(0);
        Customer customer = new Customer(account);
        Customer customer1 = new Customer(account);
        Customer customer2 = new Customer(account);

        customer.start();
        customer1.start();
        customer2.start();
    }
}
