package com.company;

public class HyundaiFactory extends AbstactCarFactory{

    @Override
    Car getCar(CarName carName) {
        switch (carName){
            case TUCSON:
                return new Tucson(2.5, "4WD","Automatic");
            case ELANTRA:
                return new Elantra(2.0, "FWD","Automatic");
        }
        return null;
    }
}
