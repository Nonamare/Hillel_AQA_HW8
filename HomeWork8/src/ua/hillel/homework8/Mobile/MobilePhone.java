package ua.hillel.homework8.Mobile;

abstract class MobilePhone implements Mobile {
    String brand;
    String model;
    String emei;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getEmei() {
        return emei;
    }

    public abstract void call(String number);
}
