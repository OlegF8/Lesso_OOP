//ООП

//2) Инкапсуляция -
//Как создать объект:
//Тип имя = new Тип();

public class Main {
    public static void main(String[] args) {
        Bank Sber = new Bank();
        Person person = new Person("Ivan", Sber,20000, 1200);
        Bankomat bankomat = new Bankomat(1000000);
        BankCard maestro_momentum = new BankCard(person, Sber,1234);

        bankomat.viewMoney();
        person.withdraw_money(bankomat,maestro_momentum);
        person.viewMoney(Sber);
        bankomat.viewMoney();

        person.deposit_money(bankomat, maestro_momentum);
        person.viewMoney(Sber);
        bankomat.viewMoney();
    }
}
