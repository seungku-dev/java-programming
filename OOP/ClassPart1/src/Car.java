public class Car {

    private String brand;
    private String model;
    private String colors;
    private int doors;
    private boolean convertible;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColors() {
        return colors;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setBrand(String brand) {

        if (brand == null) {
            brand = "Unknown";
        }

        String lowercaseMake = brand.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.brand = brand;
            default -> {
                this.brand = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void descrebeModel() {
        System.out.println(doors + "-doors " + brand + " " + model + " " + colors + " " + (convertible ? "convertible": ""));
    }
}
