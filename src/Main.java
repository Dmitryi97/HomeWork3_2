public class Main {
    public static void main(String[] args) {
        Transport[] transport = {
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };
        transport[0].check();
        transport[1].check();
        transport[2].check();
        transport[3].check();
        transport[4].check();
        transport[5].check();
    }
}