package Interface.CarExample;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW M5 Cs");

        car.name();
        car.engine("4395cc", "V8 engine");
        car.power("667Bhp","750Nm");
        car.drivetrain("AWD Transmission");
        car.turbocharge("Twin Turbocharge ");
        car.weight("4983 mm","1903 mm","1970 kg");
        car.ground_clearance("128mm");
    }
}
