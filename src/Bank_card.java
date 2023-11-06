import java.util.Scanner;

public class Bank_card {
    private String cardNumber;
    private String expiryDate;
    private String tariff;
    private String fullName;
    private String birthDate;

    public Bank_card() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер карты: ");
        this.cardNumber = scanner.nextLine();

        System.out.print("Введите срок годности карты: ");
        this.expiryDate = scanner.nextLine();

        System.out.print("Введите тариф: ");
        this.tariff = scanner.nextLine();

        System.out.print("Введите фамилию и имя: ");
        String fullName = scanner.nextLine();
        String[] names = fullName.split(" ");
        this.fullName = names[0];

        System.out.print("Введите дату рождения: ");
        this.birthDate = scanner.nextLine();

        scanner.close();
    }

    // Геттеры и сеттеры
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

    public static void main(String[] args) {
        Bank_card bankCard = new Bank_card();

        System.out.println("Номер карты: " + bankCard.getCardNumber());
        System.out.println("Срок годности карты: " + bankCard.getExpiryDate());
        System.out.println("Тариф: " + bankCard.getTariff());
        System.out.println("Фамилия и имя: " + bankCard.getFullName());
        System.out.println("Дата рождения: " + bankCard.getBirthDate());
    }
}