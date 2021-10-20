package com.company;

public class FactoryGenerator {
    public static AbstactCarFactory getFactory(FactoryType factoryType){
        switch (factoryType){
            case LADA:
                return new LadaFactory();
            case HYUNDAI:
                return new HyundaiFactory();
        }
        return null;
    }
}
