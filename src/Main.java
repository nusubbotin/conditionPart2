public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2:");
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 3:");
        int year = 2021;

        if (year % 4 == 0 && year % 100 > 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задание 4:");
        int deliveryDistance = 0;
        double deliveryTime;
        int deliveryTimeInt;

        deliveryDistance = deliveryDistance - 20;

        deliveryTime = (float) deliveryDistance / 40;
        deliveryTime = deliveryTime + 1;

        deliveryTimeInt = (int) deliveryTime;

        if (deliveryTime > deliveryTimeInt) {
            deliveryTimeInt++;
        }

        System.out.println("Потребуется дней: " + deliveryTimeInt);

        System.out.println("Задание 5:");
        short monthNumber = -1;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Введены не корректные входные данные! \n"+
                        "Меся должен быть числом от 1 до 12.");
        }

    }
}