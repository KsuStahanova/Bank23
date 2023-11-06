import java.util.Scanner;

public class Rach_chet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод информации о расчетном счете
        System.out.print("Введите номер расчетного счета: ");
        String accountNumber = scanner.nextLine();

        // Ввод информации о банковской карте
        System.out.println("Введите информацию о банковской карте:");
        Bank_card bankCard = new Bank_card();

        // Ввод информации о клиенте
        System.out.println("Введите информацию о клиенте:");
        Clientoinfo clientInfo = new Clientoinfo();

        // Создание объекта банковского счета и передача информации
        Bank_account bankAccount = new Bank_account(
                clientInfo.getDocumentNumber(),
                bankCard.getCardNumber(),
                bankCard.getExpiryDate(),
                bankCard.getTariff(),
                0.0, // Начальный баланс 0.0
                0.0); // Начальная процентная ставка 0.0

        // Вывод информации о банковском счете
        System.out.println("Информация о банковском счете:");
        System.out.println("Номер документа: " + bankAccount.getDocumentNumber());
        System.out.println("Номер карты: " + bankAccount.getCardNumber());
        System.out.println("Срок годности карты: " + bankAccount.getCardExpirationDate());
        System.out.println("Тариф: " + bankAccount.getTariff());
        System.out.println("Баланс: " + bankAccount.getAmount());
        System.out.println("Процентная ставка: " + bankAccount.getInterestRate());

        scanner.close();
    }
}

class Bank_card {
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

class Clientoinfo {
    // Здесь можно добавить нужные поля и методы для получения информации о клиенте
    private String documentNumber;

    public Clientoinfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер документа: ");
        this.documentNumber = scanner.nextLine();

        scanner.close();
    }

    public String getDocumentNumber() {
        return documentNumber;
    }
}

class Bank_account {
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