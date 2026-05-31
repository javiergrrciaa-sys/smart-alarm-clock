package model;

import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.Set;
import java.util.HashSet;
import java.util.UUID;

public class Alarm {

    // Identidad
    private UUID id;

    // Datos básicos
    private String label;
    private LocalTime time;
    private boolean active;

    // Repetición semanal
    private Set<DayOfWeek> repeatDays;

    // Sonido
    private SoundProfile soundProfile;

    public Alarm(String label, LocalTime time) {
        this.id = UUID.randomUUID();
        this.label = label;
        this.time = time;
        this.active = true;

        this.repeatDays = new HashSet<>();
    }

    // ======================
    // GETTERS
    // ======================

    public UUID getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public LocalTime getTime() {
        return time;
    }

    public boolean isActive() {
        return active;
    }

    public Set<DayOfWeek> getRepeatDays() {
        return repeatDays;
    }

    public SoundProfile getSoundProfile() {
        return soundProfile;
    }

    // ======================
    // SETTERS
    // ======================

    public void setLabel(String label) {
        this.label = label;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setSoundProfile(SoundProfile soundProfile) {
        this.soundProfile = soundProfile;
    }

    // ======================
    // ACTIVAR / DESACTIVAR
    // ======================

    public void activate() {
        this.active = true;
    }

    public void deactivate() {
        this.active = false;
    }

    // ======================
    // REPETICIÓN SEMANAL
    // ======================

    public void addRepeatDay(DayOfWeek day) {
        repeatDays.add(day);
    }

    public void removeRepeatDay(DayOfWeek day) {
        repeatDays.remove(day);
    }

    public boolean repeatsOn(DayOfWeek day) {
        return repeatDays.contains(day);
    }

    // ======================
    // TO STRING
    // ======================

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", time=" + time +
                ", active=" + active +
                ", repeatDays=" + repeatDays +
                ", soundProfile=" + soundProfile +
                '}';
    }
}
