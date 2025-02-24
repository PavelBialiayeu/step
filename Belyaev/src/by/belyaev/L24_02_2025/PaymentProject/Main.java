package by.belyaev.L24_02_2025.PaymentProject;

public class Main {
    public static void main(String[] args) {

        PaymentMethod[] paymentMethods = new PaymentMethod[3];
        paymentMethods[0] = new Cash();
        paymentMethods[1] = new CreditCard(0123023602450236L, "Павел Беляев");
        paymentMethods[2] = new PayPal("diceman@tut.by");

        for (PaymentMethod pM : paymentMethods) {
            pM.pay(150);
        }
    }
}
