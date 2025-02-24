package by.belyaev.L24_02_2025.PaymentProject;

public class Cash implements PaymentMethod {
    @Override
    public void pay(double amount) {
        PaymentMethod.super.pay(amount);
        System.out.println("Оплата 150р. наличными");
    }
}