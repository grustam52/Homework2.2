

public class Main {
    public static void main(String[] args) {
        Car car = new Car ( "car1");
        Car car2 = new Car("car2");

        Truck truck = new Truck("truck1");
        Truck truck2 = new Truck("truck2",8);

        Bucycle bucycle = new Bucycle("bucycle1");
        Bucycle bucycle2 = new Bucycle("bucycle2");

        Transport[] transports = {
                (Transport) car,
                (Transport) car2,
                (Transport) truck,
                (Transport) truck2,
                (Transport) bucycle,
                (Transport) bucycle2

        };
        ServiceStation serviceStation = new ServiceStation();
        for (Transport transport : transports){
            System.out.println("===============");
            serviceStation.check(transport);
            System.out.println("===============");
        }
    }
}