package ch11.sec06;

public class Account {
    private long balance;
    
    public Account() { }
    
    public long getBalance() {
        return balance;
    }
    
    public void deposit(int money) {
        balance += money;
    }
    
    public void withdraw(int money) throws InsufficientException {
        // 잔고가 부족하면 예외를 던짐
        if(balance < money) {
            throw new InsufficientException("잔고 부족: " + (money - balance) + " 모자람");
        }
        balance -= money;
    }
}
