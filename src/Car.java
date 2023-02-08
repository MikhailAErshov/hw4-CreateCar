//Напишите программу с классом Car.
//Создайте конструктор класса Car.
//Создайте атрибуты класса Car — color (цвет), type (тип), year (год).
//Напишите пять методов:
//Первый — запуск автомобиля, при его вызове выводится сообщение «Автомобиль заведен».
//Второй — отключение автомобиля — выводит сообщение «Автомобиль заглушен».
//Третий — присвоение автомобилю года выпуска.
//Четвертый метод — присвоение автомобилю типа.
//Пятый — присвоение автомобилю цвета.

public class Car {
    String color;
    String type;
    int year;

    public Car(String color, String type, int year) {
        this.color = color;
        this.type = type;
        this.year = year;
    }

    public void startEngine(){
        System.out.println("Автомобиль заведен");
    }
    public void stopEngine(){
        System.out.println("Автомобиль заглушен");
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void showInfo (){
        System.out.println("Автомобиль: " + "цвет-" + color + " тип-" + type + " год-" + year);
    }
}
