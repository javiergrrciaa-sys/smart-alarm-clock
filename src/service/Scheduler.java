package service;

import model.Alarm;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Scheduler {

    public Scheduler() {
    }

    /**
     * Simula la comprobación de alarmas en el sistema
     */
    public void checkAlarms(List<Alarm> alarms) {

        LocalTime now = LocalTime.now();

        for (Alarm alarm : alarms) {

            if (!alarm.isActive()) {
                continue;
            }

            if (alarm.getTime().getHour() == now.getHour()
                    && alarm.getTime().getMinute() == now.getMinute()) {

                triggerAlarm(alarm);
            }
        }
    }

    /**
     * Simula el disparo de una alarma
     */
    private void triggerAlarm(Alarm alarm) {

        System.out.println("⏰ ALARMA ACTIVA: " + alarm.getLabel());
        System.out.println("Hora: " + alarm.getTime());
        System.out.println("Sonido: " + alarm.getSoundProfile());
    }
}
