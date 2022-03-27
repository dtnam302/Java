package com.W4;

public class Planet {
    private String nameClass;
    private int orderClass;
    private String temperatureClass;

    public Planet(String name, int order, String temperature) {
        nameClass = name;
        orderClass = order;
        temperatureClass = temperature;
    }
    public String orderFromSun() {
        return String.format("%s is number %d from the Sun",nameClass,orderClass);
    }

    public String getName() {
        return nameClass;
    }
    public String getTemperature() {
        return temperatureClass;
    }
    public String getAxisRotation(){
        return "Counterclockwise";
    }
    public String getFact(){
        return String.format("%s is a planet in the Milky Way galaxy",nameClass);
    }
    public String toString(){
        return String.format("%s and is %s",orderFromSun(),temperatureClass);
    }
}
