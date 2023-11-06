import java.util.Scanner;
public class Sall {
    private String cardNumber;
    private String expiryDate;
    private String discounts;
    private String ownerName;
    private String birthDate;

    public Sall() {
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
        Sall sall = new Sall();

        Bank_card bankCard = new Bank_card();
        bankCard.setCardNumber(sall.getCardNumber());
        bankCard.setExpiryDate(sall.getExpiryDate());
        bankCard.setTariff(sall.getDiscounts());
        bankCard.setFullName(sall.getOwnerName());
        bankCard.setBirthDate(sall.getBirthDate());

        System.out.println("Номер карты: " + bankCard.getCardNumber());
        System.out.println("Срок годности карты: " + bankCard.getExpiryDate());
        System.out.println("Тариф: " + bankCard.getTariff());
        System.out.println("Фамилия и имя: " + bankCard.getFullName());
        System.out.println("Дата рождения: " + bankCard.getBirthDate());
    }
}
