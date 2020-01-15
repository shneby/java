package com.shapes.inheritance;

public enum Color {
    RED(620, 750, "red"),
    BLUE(450, 495, "blue"),
    GREEN(495, 570, "green");

    private int waveLengthMin;
    private int waveLengthMax;
    private String simpleName;

    Color(int waveLengthMin, int waveLengthMax, String simpleName) {
        this.waveLengthMin = waveLengthMin;
        this.waveLengthMax = waveLengthMax;
        this.simpleName = simpleName;
    }

    @Override
    public String toString() {
        return simpleName;
    }

    public double getWaveLengthMin() {
        return waveLengthMin;
    }

    public double getWaveLengthMax() {
        return waveLengthMax;
    }

    public void setWaveLengthMin(int waveLengthMin) {
        this.waveLengthMin = waveLengthMin;
    }

    public void setWaveLengthMax(int waveLengthMax) {
        this.waveLengthMax = waveLengthMax;
    }
}
