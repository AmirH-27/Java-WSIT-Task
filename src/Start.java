import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentServiceImp paymentServiceImp = new PaymentServiceImp();
        double amount = 0;
        User user = new User("Amir", 50000, paymentServiceImp);
        User user2 = new User("Habib", 20000, paymentServiceImp);

        System.out.println(user.toString());
        System.out.println(user2.toString());
        System.out.println("1. Make Payment");
        System.out.println("2. Exit");
        System.out.print("Enter option: ");
        if(scanner.nextInt() == 1 && user.getBalance() > 0) {
            System.out.print("Enter amount to pay: ");
            amount = scanner.nextDouble();
            user.pay(amount, user2);
            System.out.println(user.toString());
            System.out.println(user2.toString());
        }
        else if(user.getBalance() < amount) {
            System.out.println("Program terminated");
        }
    }
}
