public class InterfaceImplementation {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(4,100.00);
        System.out.println("Cars Max Speed "+car.getSpeed());
        System.out.println("Num of wheels "+car.numOfWheels);

        car.setCarStrength(10);
        System.out.println("Strength: "+car.getCarStrength());
    }
}
