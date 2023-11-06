public class Bank_account {
    private String documentNumber;
    private String cardNumber;
    private String cardExpirationDate;
    private String tariff;
    private double amount;
    private double interestRate;

    public Bank_account(String documentNumber, String cardNumber, String cardExpirationDate,
                        String tariff, double amount, double interestRate) {
        this.documentNumber = documentNumber;
        this.cardNumber = cardNumber;
        this.cardExpirationDate = cardExpirationDate;
        this.tariff = tariff;
        this.amount = amount;
        this.interestRate = interestRate;
    }

    // Геттеры и сеттеры
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