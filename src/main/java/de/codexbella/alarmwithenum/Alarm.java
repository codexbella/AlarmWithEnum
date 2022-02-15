package de.codexbella.alarmwithenum;

public class Alarm {

    private static final String MESSAGE_WARNING = "Alarm! -- Alarm!";
    private static final String MESSAGE_OK = "Alles cool.";
    private static final String MESSAGE_ERROR = "Fehler in der Eingabe.";

    public static String shopCoronaAlarm(int numberOfCustomers, String alertLevel) {
        switch (alertLevel) {
            case "rot":
                return customerCheck(numberOfCustomers, 0.0);
            case "gelb":
                return customerCheck(numberOfCustomers, 30.0);
            case "gruen":
                return customerCheck(numberOfCustomers, Double.POSITIVE_INFINITY);//oder mit Integer.MAX_VALUE oder Long.MAX_VALUE
            default:
                return MESSAGE_ERROR;
        }
    }

    public static String customerCheck(int numberOfCustomers, double numberOfCustomersAllowed) {
        if (numberOfCustomers < 0) {
            return MESSAGE_ERROR;
        } else if (numberOfCustomers > numberOfCustomersAllowed) {
            return MESSAGE_WARNING;
        }
        return MESSAGE_OK;
    }
}
