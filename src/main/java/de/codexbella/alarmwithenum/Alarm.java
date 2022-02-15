package de.codexbella.alarmwithenum;

public class Alarm {
    public static String customerCheck(int numberOfCustomers, AlertLevel alertLevel) {
        return alertLevel.determineWarning(numberOfCustomers);//test
    }
}
