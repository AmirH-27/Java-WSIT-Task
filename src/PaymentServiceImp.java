public class PaymentServiceImp implements PaymentService {
    @Override
    public void MakePaymentRequest(double amount, User user) {
        if(user.getBalance()> amount && amount > 0) {
            System.out.println("Payment request sent to " + user.getName() + " for " + amount);
        }
    }
}
