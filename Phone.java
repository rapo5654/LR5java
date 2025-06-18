public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        this("Неизвестно", "Неизвестно");
        this.weight = 0.0;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model); // вызов конструктора с двумя параметрами
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void printInfo() {
        System.out.println("Номер: " + number + ", Модель: " + model + ", Вес: " + weight);
    }
}
