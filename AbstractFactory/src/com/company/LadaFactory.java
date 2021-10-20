package com.company;

public class LadaFactory extends AbstactCarFactory{

    @Override
    Car getCar(CarName carName) {
        switch (carName){
            case NIVA:
                return new Niva(1.7, "4WD","Manual");
            case GRANTA:
                return new Niva(1.6, "FWD","Manual");
        }
        return null;
    }
}
