public class BankCard {
    private Person person;
    private Bank bank;

    public BankCard(Person person, Bank bank, int pin) {
        this.person = person;
        this.bank = bank;  // Инициализируем bank
        bank.setPin(pin);
    }

}
