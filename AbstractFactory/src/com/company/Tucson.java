package com.company;

public class Tucson extends Car{
    private double power;
    private String transmission;
    private String wheeldriveType;

    public Tucson(double power, String transmission, String wheeldriveType) {
        this.power = power;
        this.transmission = transmission;
        this.wheeldriveType = wheeldriveType;
    }

    @Override
    public String getDetails(){
        return "Tucson:" +
                "power=" + power +
                ", transmission='" + transmission + '\'' +
                ", wheeldriveType='" + wheeldriveType + '\'';

    }

    @Override
    public String toString() {
        return "Tucson{" +
                "power=" + power +
                ", transmission='" + transmission + '\'' +
                ", wheeldriveType='" + wheeldriveType + '\'' +
                '}';
    }
}
