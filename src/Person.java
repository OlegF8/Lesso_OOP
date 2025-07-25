import java.util.Scanner;

public class Person {
    String name;
    private int physMoney;
    Bank bank;

    public Person(String name, Bank bank, int physMoney, int virtMoney) {
        this.name = name;
        this.physMoney = physMoney;
        this.bank = bank;
        bank.setVirtMoney(virtMoney);
    }

    public void viewMoney(Bank bank) {
        System.out.println("virt: " + bank.getVirtMoney() + " phys: " + physMoney);
    }


    //снять деньги
    public void withdraw_money(Bankomat bankomat, BankCard card) {

        if(bank.identification() == true){
            int moneyStorage = bankomat.getMoneyStorage(); //Получаем общее кол-во денег в банкомате

            Scanner sc = new Scanner(System.in);
            System.out.println("Вывести деньги ");
            int money_to_withdraw = sc.nextInt();

            if(bankomat.getMoneyStorage() < money_to_withdraw || getVirtMoney() < money_to_withdraw) {
                System.out.println("Денег нет!");
            } else {
                //int humanVirtMoney = human.getVirtMoney(); //все вирт деньги
                int humanPhysMoney = getPhysMoney();
                //human.setMoney(human.getMoney() + sum); еще один способ

                setPhysMoney(humanPhysMoney + money_to_withdraw);
                bank.setVirtMoney(getVirtMoney() - money_to_withdraw);


                moneyStorage -= money_to_withdraw;
                bankomat.setMoneyStorage(moneyStorage);
            }
        } else{
            System.out.println("Неверный пин код");
        }
    }

    //положить деньги
    public void deposit_money(Bankomat bankomat, BankCard card){

        if(bank.identification() == true){
            int moneyStorage = bankomat.getMoneyStorage(); //Получаем общее кол-во денег в банкомате

            int humanPhysMoney = getPhysMoney();
            int humanVirtMomney = getVirtMoney();

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите сумму для зачисления");
            int money_to_deposit = sc.nextInt();

            if (humanPhysMoney < money_to_deposit){
                System.out.println("Денег нет!");
            } else {
                setPhysMoney(humanPhysMoney - money_to_deposit);
                bank.setVirtMoney(humanVirtMomney + money_to_deposit);

                moneyStorage += money_to_deposit;
                bankomat.setMoneyStorage(moneyStorage);

            }
        }else {
            System.out.println("Неверный пин код");
        }

    }

    private int getVirtMoney() {
        return bank.getVirtMoney();
    }

    public int getPhysMoney() {
        return physMoney;
    }

    public void setPhysMoney(int physMoney) {
        this.physMoney = physMoney;
    }
}
