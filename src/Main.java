import model.Alarm;
import model.SoundProfile;
import service.*;

import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // =========================
        // CREAR SERVICIOS
        // =========================
        AlarmManager alarmManager = new AlarmManager();
        Scheduler scheduler = new Scheduler();
        SnoozeManager snoozeManager = new SnoozeManager();
        ConflictDetector conflictDetector = new ConflictDetector();
        MathChallenge mathChallenge = new MathChallenge();

        // =========================
        // CREAR ALARMAS
        // =========================
        Alarm alarm1 = new Alarm("Trabajo", LocalTime.now().plusMinutes(1));
        alarm1.setSoundProfile(new SoundProfile("Nature", 50));
        alarm1.addRepeatDay(DayOfWeek.MONDAY);

        Alarm alarm2 = new Alarm("Estudio", LocalTime.now().plusMinutes(2));
        alarm2.setSoundProfile(new SoundProfile("Beep", 70));

        alarmManager.addAlarm(alarm1);
        alarmManager.addAlarm(alarm2);

        // =========================
        // PROBAR CONFLICTOS
        // =========================
        System.out.println("¿Hay conflictos? " +
                conflictDetector.hasConflict(alarmManager.getAlarms()));

        // =========================
        // PROBAR SNOOZE
        // =========================
        System.out.println("Snooze alarma1...");
        snoozeManager.snooze(alarm1);
        System.out.println("Nueva hora: " + alarm1.getTime());

        // =========================
        // SIMULAR RETO MATEMÁTICO
        // =========================
        System.out.println("Reto matemático:");
        System.out.println(mathChallenge.getChallenge());

        boolean ok = mathChallenge.validateAnswer(0); // prueba incorrecta
        System.out.println("Respuesta correcta? " + ok);

        // =========================
        // SIMULAR SCHEDULER (UNA VEZ)
        // =========================
        List<Alarm> alarms = new ArrayList<>(alarmManager.getAlarms());
        scheduler.checkAlarms(alarms);
    }
}
