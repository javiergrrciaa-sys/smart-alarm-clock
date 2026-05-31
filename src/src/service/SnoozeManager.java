package service;

import model.Alarm;

import java.time.LocalTime;

public class SnoozeManager {

    private int snoozeMinutes = 10;

    public SnoozeManager() {
    }

    public LocalTime snooze(Alarm alarm) {
        LocalTime newTime = alarm.getTime().plusMinutes(snoozeMinutes);
        alarm.setTime(newTime);
        return newTime;
    }

    public void setSnoozeMinutes(int minutes) {
        if (minutes > 0) {
            this.snoozeMinutes = minutes;
        }
    }

    public int getSnoozeMinutes() {
        return snoozeMinutes;
    }
}
