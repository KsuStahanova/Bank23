import java.util.Scanner;

public class Tariff {
    private String cardNumber;
    private String expiryDate;
    private String availableDiscounts;
    private String fullName;
    private String birthDate;

    public Tariff() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер карты: ");
        this.cardNumber = scanner.nextLine();

        System.out.print("Введите срок годности карты: ");
        this.expiryDate = scanner.nextLine();

        System.out.print("Введите доступные скидки: ");
        this.availableDiscounts = scanner.nextLine();

        System.out.print("Введите имя владельца: ");
        String fullName = scanner.nextLine();
        String[] names = fullName.split(" ");
        this.fullName = names[0];

        System.out.print("Введите день рождения: ");
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

    public String getAvailableDiscounts() {
        return availableDiscounts;
    }

    public void setAvailableDiscounts(String availableDiscounts) {
        this.availableDiscounts = availableDiscounts;
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
        Tariff tariff = new Tariff();

        System.out.println("Номер карты: " + tariff.getCardNumber());
        System.out.println("Срок годности карты: " + tariff.getExpiryDate());
        System.out.println("Доступные скидки: " + tariff.getAvailableDiscounts());
        System.out.println("Имя владельца: " + tariff.getFullName());
        System.out.println("День рождения: " + tariff.getBirthDate());
    }
}
