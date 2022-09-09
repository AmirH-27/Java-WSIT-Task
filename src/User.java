public class User {
    private String name;
    private double balance;
    private PaymentServiceImp paymentServiceImp;//dependency injection
    //injecting dependency
    public User(String name, double balance, PaymentServiceImp paymentServiceImp) {
        this.name = name;
        this.balance = balance;
        this.paymentServiceImp = paymentServiceImp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public PaymentServiceImp getPaymentServiceImp() {
        return paymentServiceImp;
    }

    public void setPaymentServiceImp(PaymentServiceImp paymentServiceImp) {
        this.paymentServiceImp = paymentServiceImp;
    }

    public void pay(double amount, User user) {
        paymentServiceImp.MakePaymentRequest(amount, user);
        user.setBalance(user.getBalance() + amount);
        this.setBalance(this.getBalance() - amount);
    }
    public String toString() {
        return "User: " + getName() + " has " + getBalance() + " in his account";
    }
}
