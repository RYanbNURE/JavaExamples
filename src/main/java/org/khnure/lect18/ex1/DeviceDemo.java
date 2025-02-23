package org.khnure.lect18.ex1;

public class DeviceDemo {

    public static void printDevice(Device device) {
        System.out.println(device.brand);
    }

    public static void main(String[] args) {
        Device smartphoneSamsung = new Device("Smartphone", "Samsung");
        Device smartphoneSiemens = new Device("Smartphone", "Siemens");
        System.out.println("Started runtime");

        smartphoneSamsung.startCamera();
        smartphoneSiemens.startCamera();

//        printDevice("dskj");
//        printDevice(Integer.valueOf(1));
//        smartphoneSamsung.camera = true;
//        smartphoneSamsung.brand
    }
}
