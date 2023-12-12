package fr.cda.exercices.tp2;

public class Thermometer {
    private double tempInC;

    private double tempInF;

    private double tempInK;

    public Thermometer(){
        this.tempInC = 0;
        this.tempInF = 32;
        this.tempInK = 273.15;
    }

    public double getTempInC() {
        return tempInC;
    }

    public void setTempInC(double tempInC) {
        this.tempInC = tempInC;
        this.tempInF = tempInC * 1.8 + 32;
        this.tempInK = tempInC + 273.15;
    }

    public double getTempInF() {
        return tempInF;
    }

    public void setTempInF(double tempInF) {
        this.tempInF = tempInF;
        this.tempInC = (tempInF - 32) / 1.8;
        this.tempInK = (tempInF - 32) / 1.8 + 273.15;
    }

    public double getTempInK() {
        return tempInK;
    }

    public void setTempInK(double tempInK) {
        this.tempInK = tempInK;
        this.tempInC = tempInK - 273.15;
        this.tempInF = (tempInK - 273.15) * 1.8 + 32;
    }

}