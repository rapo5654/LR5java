import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных для первого телефона
        System.out.println("Введите данные для первого телефона:");
        System.out.print("Номер: ");
        String number1 = scanner.nextLine();
        System.out.print("Модель: ");
        String model1 = scanner.nextLine();
        System.out.print("Вес: ");
        double weight1 = scanner.nextDouble();
        scanner.nextLine(); // очистка перевода строки
        Phone phone1 = new Phone(number1, model1, weight1);

        // Ввод данных для второго телефона
        System.out.println("\nВведите данные для второго телефона:");
        System.out.print("Номер: ");
        String number2 = scanner.nextLine();
        System.out.print("Модель: ");
        String model2 = scanner.nextLine();
        System.out.print("Вес: ");
        double weight2 = scanner.nextDouble();
        scanner.nextLine(); // очистка перевода строки
        Phone phone2 = new Phone(number2, model2, weight2);

        // Ввод данных для третьего телефона
        System.out.println("\nВведите данные для третьего телефона:");
        System.out.print("Номер: ");
        String number3 = scanner.nextLine();
        System.out.print("Модель: ");
        String model3 = scanner.nextLine();
        System.out.print("Вес: ");
        double weight3 = scanner.nextDouble();
        scanner.nextLine(); // очистка перевода строки
        Phone phone3 = new Phone(number3, model3, weight3);

        // Вывод информации
        System.out.println("\nИнформация о телефонах:");
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        // Ввод имени звонящего и вызов методов
        System.out.print("\nВведите имя звонящего для phone1: ");
        String caller1 = scanner.nextLine();
        phone1.receiveCall(caller1);
        System.out.println("Номер телефона: " + phone1.getNumber());

        System.out.print("\nВведите имя звонящего для phone2: ");
        String caller2 = scanner.nextLine();
        phone2.receiveCall(caller2);
        System.out.println("Номер телефона: " + phone2.getNumber());

        System.out.print("\nВведите имя звонящего для phone3: ");
        String caller3 = scanner.nextLine();
        phone3.receiveCall(caller3);
        System.out.println("Номер телефона: " + phone3.getNumber());

        scanner.close();
    }
}
