package by.belyaev.L24_02_2025.PaymentProject;

public class CreditCard implements PaymentMethod {
    private long cardNumber;
    private String cardHolder;

    public CreditCard(long cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        PaymentMethod.super.pay(amount);
        System.out.println("Оплата 150р. с кредитной карты номер " + cardNumber + ", владелец: " + cardHolder);
    }
}