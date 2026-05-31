package service;

import model.Alarm;

import java.util.List;

public class ConflictDetector {

    private int minDifferenceMinutes = 5;

    public ConflictDetector() {
    }

    /**
     * Devuelve true si hay conflictos entre alarmas
     */
    public boolean hasConflict(List<Alarm> alarms) {

        for (int i = 0; i < alarms.size(); i++) {
            for (int j = i + 1; j < alarms.size(); j++) {

                Alarm a1 = alarms.get(i);
                Alarm a2 = alarms.get(j);

                if (!a1.isActive() || !a2.isActive()) {
                    continue;
                }

                int diff = Math.abs(
                        a1.getTime().toSecondOfDay()
                                - a2.getTime().toSecondOfDay()
                );

                int diffMinutes = diff / 60;

                if (diffMinutes < minDifferenceMinutes) {
                    return true;
                }
            }
        }

        return false;
    }

    public void setMinDifferenceMinutes(int minutes) {
        if (minutes > 0) {
            this.minDifferenceMinutes = minutes;
        }
    }
}
