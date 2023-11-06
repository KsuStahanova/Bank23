class ClientInfo {
    private String fullname;
    private String birthdate;

    typescript
    Copy code
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
    private String fullName;
    private String birthDate;

    typescript
    Copy code
    public BankCard(String cardNumber, String expiryDate, String tariff, String fullName, String birthDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.tariff = tariff;
        this.fullName = fullName;
        this.birthDate = birthDate;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}