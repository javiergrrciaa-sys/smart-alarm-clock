package model;

public class SoundProfile {

    private String soundName;
    private int volume; // 0 - 100

    public SoundProfile(String soundName, int volume) {
        this.soundName = soundName;
        setVolume(volume);
    }

    public String getSoundName() {
        return soundName;
    }

    public int getVolume() {
        return volume;
    }

    public void setSoundName(String soundName) {
        this.soundName = soundName;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            this.volume = 0;
        } else if (volume > 100) {
            this.volume = 100;
        } else {
            this.volume = volume;
        }
    }

    public void increaseVolume(int step) {
        setVolume(this.volume + step);
    }

    public void decreaseVolume(int step) {
        setVolume(this.volume - step);
    }

    @Override
    public String toString() {
        return "SoundProfile{" +
                "soundName='" + soundName + '\'' +
                ", volume=" + volume +
                '}';
    }
}
