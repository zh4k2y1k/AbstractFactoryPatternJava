package com.company;

public class Elantra extends Car{
    private double power;
    private String transmission;
    private String wheeldriveType;

    public Elantra(double power, String transmission, String wheeldriveType) {
        this.power = power;
        this.transmission = transmission;
        this.wheeldriveType = wheeldriveType;
    }

    @Override
    public String getDetails(){
        return "Elantra:" +
                "power=" + power +
                ", transmission='" + transmission + '\'' +
                ", wheeldriveType='" + wheeldriveType + '\'';

    }

    @Override
    public String toString() {
        return "Elantra{" +
                "power=" + power +
                ", transmission='" + transmission + '\'' +
                ", wheeldriveType='" + wheeldriveType + '\'' +
                '}';
    }
}
