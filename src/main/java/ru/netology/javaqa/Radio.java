package ru.netology.javaqa;

public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int stationsQuantity  = 9;
    private int currentRadioStation = minRadioStation;

    public Radio(int stationsQuantity) {
        this.stationsQuantity = stationsQuantity;
    }

    public Radio() {
        maxRadioStation = minRadioStation + stationsQuantity;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void next() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else currentRadioStation = minRadioStation;
    }

    public void prev() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else currentRadioStation = maxRadioStation;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = maxRadioStation;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

}
