public class Main {
    public static void main(String[] args) {
        task1(2024);
        task2(1, 2015);
        task3();

    }

    public static void task1(int year) {

        boolean leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (leapYear) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Невисокосный год");
        }
    }

    public static void task2(int client, int clientDeviceYear) {
        int ios = 1;
        int android = 0;
        boolean condition = clientDeviceYear > 2015;
        if (client == ios && condition) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        } else if (client == ios && clientDeviceYear <= 2015) {
            System.out.println("Установите  версию приложения для iOS по ссылке");

            {
                if (client == android && (condition)) {
                    System.out.println("Установите  версию приложения для Android по ссылке");
                } else if (client == android && clientDeviceYear <= 2015) {
                    {
                        System.out.println("Установите версию приложения для Android по ссылке");
                    }
                }
            }
        }
    }

    public static void task3() {
        var deliveryDistance = 100;
        countNames(deliveryDistance);
    }
    private static int countNames(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            return -1;

        }
    }
}







