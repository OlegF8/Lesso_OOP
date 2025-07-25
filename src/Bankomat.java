//1) То что объект умеет делать(поведения - то есть методы)
//2) То что объект имеет(харакетристики - поля)


//Когда начинаешь продумывать сигнатуру для тебя важны 2 вещи: что вернуть, что передать


public class Bankomat  extends Bank{

    private int moneyStorage;

    public Bankomat(int moneyStorage) {
        this.moneyStorage = moneyStorage;
    }

    public void viewMoney(){
        System.out.println("Денег в банкомате " + getMoneyStorage());
    }

    public int getMoneyStorage() {
        return moneyStorage;
    }

    public void setMoneyStorage(int moneyStorage) {
        this.moneyStorage = moneyStorage;
    }
}
