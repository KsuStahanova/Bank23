import java.util.Scanner;

public class Bank_Opera {
    public enum OperationType {
        DEPOSIT, CREDIT, BANK_ACCOUNT
    }

    public static void main(String[] args) {
        // Создание объекта ClientInfo
        ClientInfo clientInfo = new ClientInfo("John Smith", "01/01/1990");

        // Создание объекта BankCard
        BankCard bankCard = new BankCard();

        // Вывод информации о клиенте и карте
        System.out.println("Информация о клиенте:");
        System.out.println("ФИО: " + clientInfo.getFullname());
        System.out.println("Дата рождения: " + clientInfo.getBirthdate());
        System.out.println("Информация о карте:");
        System.out.println("Номер карты: " + bankCard.getCardNumber());
        System.out.println("Срок годности: " + bankCard.getExpiryDate());
        System.out.println("Тариф: " + bankCard.getTariff());

        // Создание объекта TypeCard
        TypeCard typeCard = new TypeCard(TypeCard.PaymentSystem.VISA, TypeCard.Bank.BANK_OF_AMERICA);

        // Вывод информации о типе карты
        System.out.println("Информация о типе карты:");
        System.out.println("Платежная система: " + typeCard.getPaymentSystem());
        System.out.println("Банк: " + typeCard.getBank());
    }
}

class ClientInfo {
    private String fullname;
    private String birthdate;

    public ClientInfo(String fullname, String birthdate) {
        this.fullname = fullname;
        this.birthdate = birthdate;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}

class BankCard {
    private String cardNumber;
    private String expiryDate;
    private String tariff;

    public BankCard() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер карты: ");
        this.cardNumber = scanner.nextLine();

        System.out.print("Введите срок годности карты: ");
        this.expiryDate = scanner.nextLine();

        System.out.print("Введите тариф: ");
        this.tariff = scanner.nextLine();

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

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }
}

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