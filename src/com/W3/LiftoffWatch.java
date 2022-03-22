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
            return true;
        }
        if(weather == "Sunny") {
            return wind<=60;
        }
        if(weather == "Cloudy") {
            return wind<=45;
        }
        return false;
    }

    public static void main(String[] args) {
        LiftoffWatch launch = new LiftoffWatch();

        launch.setTemp(27.0);
        launch.setWeather("Sunny");
        launch.setWind(53);
        System.out.println(launch.canWeLaunch());

    }
}
