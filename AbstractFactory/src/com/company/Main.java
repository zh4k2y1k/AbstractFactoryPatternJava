package com.company;

public class Main {

    public static void main(String[] args) {
        Car hyundai = FactoryGenerator.getFactory(FactoryType.HYUNDAI).getCar(CarName.ELANTRA);
        System.out.println(hyundai.getDetails());

        Car lada = FactoryGenerator.getFactory(FactoryType.LADA).getCar(CarName.NIVA);
        System.out.println(lada.getDetails());
    }
}
