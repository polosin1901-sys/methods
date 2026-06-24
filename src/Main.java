import java.time.LocalDate;

public class Main {
    // 1 задача
    public static void defineYear(int definedYear) {
        if (definedYear < 1584) {
            System.out.println("В " + definedYear + " году ещё не было введено разделение на високосные и не високосные года");
        } else if ((definedYear % 4 == 0 && definedYear % 100 != 0) || (definedYear % 400 == 0)) {
            System.out.println(definedYear + " год является високосным");
        } else {
            System.out.println(definedYear + " год не является високосным");
        }
    }

    // 2 задача
    public static void displayMessage(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= currentYear && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    //    3 задача
    public static void defineDaysOfDelivery(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
//        Проверка для метода из 1 задачи
        int year = 2021;
        defineYear(year);
// Проверка для метода из 2 задачи
        int clientOS1 = 0;
        int currentYear1 = 2015;
        displayMessage(currentYear1, clientOS1);
// Проверка для метода из 3 задачи
        int deliveryDistance1 = 95;
        defineDaysOfDelivery(deliveryDistance1);
    }
}