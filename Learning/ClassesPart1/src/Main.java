public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Maseratti");
        car.setModel("Carrera");
        car.setColor("Red");
        car.setDoors(2);
        car.setConvertible(true);
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setColor("Red");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.describeCar();

    }
}