package org.khnure.lect18.ex1;

public class Device {

    private String device;
    public String brand;

//    public boolean camera;

    public Device(String device, String brand) {
        this.device = device;
        this.brand = brand;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void startCamera() {
        if (brand.equals("Siemens")) {
            System.out.println("This device does not have a camera");
        } else {
            System.out.println("Starting camera");
        }
    }
}
