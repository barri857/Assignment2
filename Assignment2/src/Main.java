public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 2022, 4, "Petrol");
        Motorcycle bike = new Motorcycle("Yamaha", 2021, false);
        Truck truck = new Truck("Volvo", 2020, 15.0, 3);

        Driver driver1 = new Driver("Alibek", "AB123");
        Driver driver2 = new Driver("Aruzhan", "CD456");

        car.setDriver(driver1);
        bike.setDriver(driver2);
        truck.setDriver(driver1);

        Vehicle[] vehicles = {car, bike, truck};

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            if (v.driver != null) {
                v.driver.displayDriverInfo();
            }
            v.stopEngine();
            System.out.println("----------------");
        }
    }
}