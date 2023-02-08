public class SmartPhone extends Computer{
    int nrOfCamera;
    SmartPhone(String product, int gigabyte, int battery, int nrOfCamera) {
        super(product, gigabyte, battery);

        this.nrOfCamera = nrOfCamera;
    }

    public void howManyCameras () {
        System.out.println("The smartphone has " + nrOfCamera + " cameras");
    }
}
