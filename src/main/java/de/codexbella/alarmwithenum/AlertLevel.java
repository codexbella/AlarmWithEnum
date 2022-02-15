package de.codexbella.alarmwithenum;

public enum AlertLevel {
    RED(0),
    YELLOW(30),
    GREEN(Integer.MAX_VALUE);

    private static final String MESSAGE_WARNING = "Alarm! -- Alarm!";
    private static final String MESSAGE_OK = "Alles cool.";
    private static final String MESSAGE_ERROR = "Fehler: Negative Anzahl an Kunden nicht möglich.";

    private long threshold;

    AlertLevel(int threshold) {
        this.threshold = threshold;
    }

    public String determineWarning(int numberOfCustomers) {
            if (numberOfCustomers < 0) {
                return MESSAGE_ERROR;
            } else if (numberOfCustomers > threshold) {
                return MESSAGE_WARNING;
            }
            return MESSAGE_OK;
        }

}
