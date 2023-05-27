package ua.hillel.homework8.Mobile;

public class Model extends MobilePhone {

    public Model(String brand, String model, String emei) {
        this.brand = brand;
        this.model = model;
        this.emei = emei;
    }

    @Override
    public void call(String number) {
        System.out.println("Phone " + getBrand() + "/" + getModel() + " is calling number " + number);
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("Phone " + getBrand() + "/" + getModel() + " is sending message >" + message + "< to number " + number);
    }
}
