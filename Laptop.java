public class Laptop extends Computer{
    String color;
    Laptop(String product, int gigabyte, int battery, String color) {
        super(product, gigabyte, battery);

        this.color = color;
    }

    public void colorOfLaptop () {
        System.out.println("The color of the laptop is " + color);
    }
}
