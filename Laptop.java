public class Laptop extends Computer {

    // inheritance 1 - For a child class add at least 1 additional property and 1 additional method.
    String color;
    Laptop(String product, int gigabyte, int battery, String color) {
        super(product, gigabyte, battery);

        this.color = color;
    }

    public void colorOfLaptop () {
        System.out.println("The color of the laptop is " + color);
    }
}
