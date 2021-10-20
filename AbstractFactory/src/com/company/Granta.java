package com.company;

public class Granta extends Car {
    private double power;
    private String transmission;
    private String wheeldriveType;

    public Granta(double power, String transmission, String wheeldriveType) {
        this.power = power;
        this.transmission = transmission;
        this.wheeldriveType = wheeldriveType;
    }

    @Override
    public String getDetails(){
        return "Granta:" +
                "power=" + power +
                ", transmission='" + transmission + '\'' +
                ", wheeldriveType='" + wheeldriveType + '\'';

    }

    @Override
    public String toString() {
        return "Granta{" +
                "power=" + power +
                ", transmission='" + transmission + '\'' +
                ", wheeldriveType='" + wheeldriveType + '\'' +
                '}';
    }
}
