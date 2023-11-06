public class Vklad {
    private ClientInfo clientInfo;
    private Bank_card bankCard;
    private TypeCard typeCard;
    private BankAccount bankAccount;

    public Vklad(ClientInfo clientInfo, Bank_card bankCard, TypeCard typeCard) {
        this.clientInfo = clientInfo;
        this.bankCard = bankCard;
        this.typeCard = typeCard;

        this.bankAccount = new BankAccount(clientInfo.getFullname(), bankCard.getCardNumber(),
                bankCard.getExpiryDate(), bankCard.getTariff(), 0.0, 0.0);
    }

    // Геттеры и сеттеры
    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public Bank_card getBankCard() {
        return bankCard;
    }

    public void setBankCard(Bank_card bankCard) {
        this.bankCard = bankCard;
    }

    public TypeCard getTypeCard() {
        return typeCard;
    }

    public void setTypeCard(TypeCard typeCard) {
        this.typeCard = typeCard;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public static void main(String[] args) {
        ClientInfo clientInfo = new ClientInfo("Иванов Иван Иванович", "01.01.1990");
        Bank_card bankCard = new Bank_card();
        TypeCard typeCard = new TypeCard(TypeCard.PaymentSystem.MASTERCARD, TypeCard.Bank.JP_MORGAN_CHASE);

        Vklad vklad = new Vklad(clientInfo, bankCard, typeCard);

        System.out.println("Имя клиента: " + vklad.getClientInfo().getFullname());
        System.out.println("Номер карты: " + vklad.getBankCard().getCardNumber());
        System.out.println("Тип карты: " + vklad.getTypeCard().getPaymentSystem());
        System.out.println("Банк: " + vklad.getTypeCard().getBank());
        System.out.println("Номер документа: " + vklad.getBankAccount().getDocumentNumber());
    }
}