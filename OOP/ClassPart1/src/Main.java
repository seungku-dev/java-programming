public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setBrand("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColors("black");

        car.descrebeModel();

        Car targa = new Car();
        targa.setBrand("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColors("red");

        targa.descrebeModel();
    }
}