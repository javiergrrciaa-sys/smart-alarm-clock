package service;

import model.Alarm;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AlarmManager {

    private List<Alarm> alarms;

    public AlarmManager() {
        alarms = new ArrayList<>();
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    public void removeAlarm(Alarm alarm) {
        alarms.remove(alarm);
    }

    public List<Alarm> getAlarms() {
        return alarms;
    }

    public Alarm findById(UUID id) {
        for (Alarm alarm : alarms) {
            if (alarm.getId().equals(id)) {
                return alarm;
            }
        }
        return null;
    }
}
