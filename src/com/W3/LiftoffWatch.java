package com.W3;

public class LiftoffWatch {
    private double temperature = 0;
    private String weather;
    private double wind = 0;

    public void setTemp(double temp) {
        temperature = temp;
    }
    public void setWeather(String state){
        weather = state;
    }
    public void setWind(double speed){
        wind = speed;
    }
    public boolean canWeLaunch(){
        if (temperature>=16.5 && temperature <=34.0){
            //if temperature is satisfied => we look to the weather
            if(weather == "Sunny") {
                return wind<=60;
            }
            else if(weather == "Cloudy") {
                return wind<=45;
            }
            else return false; //case rainy
        }
        else return false; //case temperature not in range (16.5,34)
    }

    public static void main(String[] args) {
        LiftoffWatch launch = new LiftoffWatch();

        launch.setTemp(27.0);
        launch.setWeather("Cloudy");
        launch.setWind(35);
        System.out.println(launch.canWeLaunch());

    }
}
