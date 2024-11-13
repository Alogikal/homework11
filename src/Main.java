import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        checkLeapYear();
        chooseOs();
        System.out.println(calculateDeliveryDays());
    }
    public static void checkLeapYear () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год для определения его високосности: ");
        int year = in.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }

    public static void chooseOs () {
        Scanner in = new Scanner(System.in);
        String linkiOSNew = "https://upload.wikimedia.org/wikipedia/commons/e/e4/Original_iPhone_-_iPhone_3G_-_iPhone_4_-_Flickr_-_Yutaka_Tsutano.jpg";
        String linkAndrNew = "https://i.pinimg.com/736x/fe/21/8f/fe218f96fff462ea5e4f5c70b57bfb4f--best-android-best-phone.jpg";
        String linkIOS = "https://blog.eldorado.ru/storage/publication/0/58/f7yIp6cPBZtZJtYVyJ8iu9FvtgJCF8LSVfAhbm9c.jpeg";
        String linkAndr = "https://i.pinimg.com/736x/0e/23/67/0e23674f40640af4c730344a860a4fd4.jpg";
        System.out.println("Укажите модель вашего смартфона (0 - iOS, 1 - Android): ");
        int clientOS = in.nextInt();
        System.out.println("Укажите текущий год: ");
        int clientDeviceNowYear = in.nextInt();
        System.out.println("Укажите год выпуска вашего смартфона: ");
        int clientDeviceYear = in.nextInt();
        if (clientOS == 0 && clientDeviceYear > clientDeviceNowYear) {
            System.out.println("Установите версию приложения для iOS по ссылке" + linkIOS);
        } else if (clientOS == 1 && clientDeviceYear > clientDeviceNowYear) {
            System.out.println("Установите версию приложения для Android по ссылке" + linkAndr);
        } else if (clientOS == 0 && clientDeviceYear < clientDeviceNowYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке" + linkiOSNew);
        }
        else if (clientOS == 1 && clientDeviceYear < clientDeviceNowYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке" + linkAndrNew);
        } else {
            System.out.println("Error!");
        }
    }
    public static String calculateDeliveryDays() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите расстояние до вашего офиса: ");
        int distance = in.nextInt();
        int deliveryTime20 = 1;
        int deliveryTime20_60 = 2;
        int deliveryTime60_100 = 3;
        if (distance <= 20) {
            return ("Потребуется дней для доставки: " + deliveryTime20);
        } else if (distance > 20 && distance <= 60) {
            return ("Потребуется дней для доставки: " + deliveryTime20_60);
        } else if (distance > 60 && distance <= 100) {
            return ("Потребуется дней для доставки: " + deliveryTime60_100);
        } else {
            return "Свыше 100км доставки нет";
        }
    }
}
