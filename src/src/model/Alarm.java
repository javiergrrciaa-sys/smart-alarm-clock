package model;

import java.time.LocalTime;
import java.util.UUID;

public class Alarm {

    private UUID id;
    private String label;
    private LocalTime time;
    private boolean active;

    public Alarm(String label, LocalTime time) {
        this.id = UUID.randomUUID();
        this.label = label;
        this.time = time;
        this.active = true;
    }

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

    public void setLabel(String label) {
        this.label = label;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void activate() {
        active = true;
    }

    public void deactivate() {
        active = false;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", time=" + time +
                ", active=" + active +
                '}';
    }
}
