package ru.appline.compass.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Model implements Serializable {
    private static final Model instance = new Model();

    public static Model getInstance(){
        return instance;
    }

    public Model(){
    }

    public String getSide(double degree){
        if(degree < 0 || degree > 359){
            return "Wrong range";
        }
        else if(degree >= 0 && degree <= 22.5 || degree >= 335.5){
            return "North";
        }
        else if(degree > 22.5 && degree <= 67.5){
            return "North East";
        }
        else if(degree > 67.5 && degree <= 112.5){
            return "East";
        }
        else if(degree > 112.5 && degree <= 157.5){
            return "South East";
        }
        else if(degree > 157.5 && degree <= 202.5){
            return "South";
        }
        else if(degree > 202.5 && degree <= 247.5){
            return "South West";
        }
        else if(degree > 247.5 && degree <= 292.5){
            return "West";
        }
        else{
            return "North West";
        }
    }
}
