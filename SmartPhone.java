public class SmartPhone extends Computer {

    // inheritance 1 - For a child class add at least 1 additional property and 1 additional method.
    int nrOfCamera;
    SmartPhone(String product, int gigabyte, int battery, int nrOfCamera) {
        super(product, gigabyte, battery);

        this.nrOfCamera = nrOfCamera;
    }

    public void howManyCameras () {
        System.out.println("The smartphone has " + nrOfCamera + " cameras");
    }
}
