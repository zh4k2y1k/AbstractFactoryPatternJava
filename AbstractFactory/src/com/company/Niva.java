package com.company;

public class Niva extends Car{
    private double power;
    private String transmission;
    private String wheeldriveType;

    public Niva(double power, String transmission, String wheeldriveType) {
        this.power = power;
        this.transmission = transmission;
        this.wheeldriveType = wheeldriveType;
    }

    @Override
    public String getDetails(){
        return "Niva:" +
                "power=" + power +
                ", transmission='" + transmission + '\'' +
                ", wheeldriveType='" + wheeldriveType + '\'';

    }

    @Override
    public String toString() {
        return "Niva{" +
                "power=" + power +
                ", transmission='" + transmission + '\'' +
                ", wheeldriveType='" + wheeldriveType + '\'' +
                '}';
    }
}
