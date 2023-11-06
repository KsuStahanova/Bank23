import java.util.Scanner;

// Класс для представления типа платежной системы
class TypeCard {
    public enum PaymentSystem {
        MASTERCARD, VISA, UNION_PAY, STRIPE, CHECKOUT, PAYPAL, SHOPIFY_PAYMENTS, DWOLLA, JCB, AMERICAN_EXPRESS
    }

    public enum Bank {
        JP_MORGAN_CHASE, BANK_OF_AMERICA, ICBC, CHINA_MERCHANTS_BANK, TORONTO_DOMINION_BANK, BANK_OF_MONTREAL
    }

    private PaymentSystem paymentSystem;
    private Bank bank;

    public TypeCard(PaymentSystem paymentSystem, Bank bank) {
        this.paymentSystem = paymentSystem;
        this.bank = bank;
    }

    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }

    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}

// Класс для представления банковского счета
class BankAccount {
    private String documentNumber;
    private String cardNumber;
    private String cardExpirationDate;
    private String tariff;
    private double amount;
    private double interestRate;

    public BankAccount(String documentNumber, String cardNumber, String cardExpirationDate,
                       String tariff, double amount, double interestRate) {
        this.documentNumber = documentNumber;
        this.cardNumber = cardNumber;
        this.cardExpirationDate = cardExpirationDate;
        this.tariff = tariff;
        this.amount = amount;
        this.interestRate = interestRate;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

// Класс для представления продажи
class Sale {
    private String cardNumber;
    private String expiryDate;
    private String discounts;
    private String ownerName;
    private String birthDate;

    public Sale() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер карты: ");
        this.cardNumber = scanner.nextLine();

        System.out.print("Введите срок годности карты: ");
        this.expiryDate = scanner.nextLine();

        System.out.print("Введите доступные скидки: ");
        this.discounts = scanner.nextLine();

        System.out.print("Введите имя владельца: ");
        this.ownerName = scanner.nextLine();

        System.out.print("Введите день рождения: ");
        this.birthDate = scanner.nextLine();

        scanner.close();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public static void main(String[] args) {
        Sale sale = new Sale();

        TypeCard.PaymentSystem paymentSystem = TypeCard.PaymentSystem.VISA;
        TypeCard.Bank bank = TypeCard.Bank.BANK_OF_AMERICA;

        TypeCard typeCard = new TypeCard(paymentSystem, bank);