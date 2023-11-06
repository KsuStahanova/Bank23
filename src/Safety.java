import java.util.Scanner;

public class Safety {
    private ClientInfo clientInfo;
    private BankCard bankCard;

    java
    Copy code
    public Safety(ClientInfo clientInfo, BankCard bankCard) {
        this.clientInfo = clientInfo;
        this.bankCard = bankCard;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullname = scanner.nextLine();

        System.out.print("Введите дату рождения: ");
        String birthdate = scanner.nextLine();

        ClientInfo clientInfo = new ClientInfo(fullname, birthdate);

        System.out.print("Введите номер карты: ");
        String cardNumber = scanner.nextLine();

        System.out.print("Введите срок годности карты: ");
        String expiryDate = scanner.nextLine();

        System.out.print("Введите тариф: ");
        String tariff = scanner.nextLine();

        System.out.print("Введите фамилию и имя: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите дату рождения: ");
        String birthDate = scanner.nextLine();

        BankCard bankCard = new BankCard(cardNumber, expiryDate, tariff, fullName, birthDate);

        Safety safety = new Safety(clientInfo, bankCard);

        scanner.close();

        System.out.println("ФИО: " + safety.getClientInfo().getFullname());
        System.out.println("Дата рождения: " + safety.getClientInfo().getBirthdate());
        System.out.println("Номер карты: " + safety.getBankCard().getCardNumber());
        System.out.println("Срок годности карты: " + safety.getBankCard().getExpiryDate());
        System.out.println("Тариф: " + safety.getBankCard().getTariff());
        System.out.println("Фамилия и имя: " + safety.getBankCard().getFullName());
        System.out.println("Дата рождения: " + safety.getBankCard().getBirthDate());
    }