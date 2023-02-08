public class Computer {
    String product;
    int gigabyte;
    int battery;

    Computer (String product, int gigabyte, int battery) {
        this.product = product;
        this.gigabyte = gigabyte;
        this.battery = battery;
    }

    public void information () {
        System.out.println("Device: " + product + "GB: " + gigabyte + "Battery: " + battery);
    }
    public void wasBought() {
        System.out.println("this " + this.product + " was bought today");
    }

}
