package ru.netology.javaqa;

public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation;
    private int currentRadioStation = minRadioStation;
    private int currentVolume;

    public Radio() {
        this.maxRadioStation = 9;
    }

    public Radio(int stationsQuantity) {
        this.maxRadioStation = stationsQuantity - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int CurrentRadioStation) {
        if (CurrentRadioStation < minRadioStation) {
            return;
        }
        if (CurrentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = CurrentRadioStation;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < 0) {
            return;
        }
        if (CurrentVolume > 100) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public void next() {
        if (currentRadioStation != maxRadioStation) {
            currentRadioStation++;
        } else currentRadioStation = minRadioStation;
    }

    public void prev() {
        if (currentRadioStation != minRadioStation) {
            currentRadioStation--;
        } else currentRadioStation = maxRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }

    public void setToMaxRadioStation() {
        currentRadioStation = maxRadioStation;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }
}
