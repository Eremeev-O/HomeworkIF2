public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//Задание №1
        System.out.println("Задание №1");
        int clientOS = 1 ;
        if ( clientOS == 0 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if ( clientOS == 1 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//Задание №2
        System.out.println("Задание №2");
        int clientDeviceYear = 2015;
        clientOS = 1 ;
        if ( clientOS == 0 ) {
            if ( clientDeviceYear >= 2015 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if ( clientOS == 1 ) {
            if ( clientDeviceYear >= 2015 ) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
//Задание №3
        System.out.println("Задание №3");
        int year = 1984;
        int yearVis = 1584;
        // Если год введения високосного года 1584, то точка входа этот год, соответственно придется расчеты вести через
        // разницу в годах между текущим и годом введения високосности
        int a = (year - yearVis ) % 4;
        int b = (year - yearVis ) % 100;
        // Почему каждый сотый год с момента введения високосного года (я так понимаю условие задачи) не является високосным?! Это же не так!
        // Только по определению задачи?
        int c = (year - yearVis ) % 400;
        boolean reshenie = year >= yearVis && (a == 0 || c == 0) && b != 0;
            if ( reshenie ) {
                System.out.println( year + " год является високосным");
            } else {
                System.out.println( year + " год не является високосным");
            }
//Задание №4
        System.out.println("Задание №4");
        int deliveryDistance = 95;
        int deySum = 0;
        if (deliveryDistance < 100 ) {
            if (deliveryDistance < 20) {
                deySum = 1;
            }
            if (deliveryDistance >= 20 && deliveryDistance < 60) {
                deySum = 2;
            }
            if (deliveryDistance >= 60 && deliveryDistance < 100) {
                deySum = 3;
            }
            System.out.println("Потребуется дней: " + deySum);
        } else {
        System.out.println("Доставка невозможна");
        }
//Задание №5
        System.out.println("Задание №5");
        int monthNumber = 12;
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
                System.out.println("Нет такого месяца в году");
        }
    }
}