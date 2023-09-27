package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Error's active " + active);
        System.out.println("Status's active " + status);
        System.out.println("Message's active " + message);
    }

    public static void main(String[] args) {
        Error defaultError = new Error();
        defaultError.printInfo();
        Error fieldError = new Error(true, 1, "not sent");
        fieldError.printInfo();
    }
}

