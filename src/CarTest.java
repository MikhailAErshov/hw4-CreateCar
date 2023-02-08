public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("black", "BMW M5", 2023);

        car1.startEngine();
        car1.stopEngine();
        car1.color = "red";
        car1.year = 2020;
        car1.type = "AUDI RS";

        car1.showInfo();
    }
}
