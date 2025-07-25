import java.util.Scanner;

public class Bank {
    private int pin;
    private int virtMoney;

    public boolean identification() {
        int counter = 3; // Количество попыток

        while (counter > 0) {
            int enteredPin = enter_pin();

            if (enteredPin == getPin()) {
                return true;
            } else {
                counter--;
                System.out.println("Неверный PIN");
                System.out.println("Осталось попыток: " + counter);
            }
        }
        return false;
    }

    private int enter_pin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите pin");
        int enter_pin = sc.nextInt();
        return enter_pin;
    }

    public int getVirtMoney() {
        return virtMoney;
    }

    public void setVirtMoney(int virtMoney) {
        this.virtMoney = virtMoney;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
