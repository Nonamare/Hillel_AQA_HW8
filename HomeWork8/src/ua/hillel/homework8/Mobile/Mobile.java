package ua.hillel.homework8.Mobile;

public interface Mobile {
    void call(String number);

    void sendMessage(String number, String message);

    String getEmei();
}
