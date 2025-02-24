package by.belyaev.L24_02_2025.PaymentProject;

public class PayPal implements PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        PaymentMethod.super.pay(amount);
        System.out.println("Оплата 150р. через PayPal аккаунт " + email);
    }
}