package com.W4;

public class Rover implements RemoteControllable{

    private double latitudeClass;
    private double longitudeClass;
    private String mission;


    public String getStatusReport() {
        return String.format("%s\nThe rover is driving to: %s",getLocation(),mission);
    }

    public void updateMission(String newMission) {
        mission = newMission;
    }
    public void setLocation(double latitude, double longitude){
        latitudeClass = latitude;
        longitudeClass = longitude;
    }

    public String getLocation(){
        return String.format("The rover is located %.1f, %.1f on the planet",latitudeClass,longitudeClass);
    }

    public static void main(String[] args) {
        Rover rover = new Rover();
        System.out.println(rover instanceof RemoteControllable);
        rover.setLocation(100.0, 42.0);
        rover.updateMission("Find water");
        System.out.println(rover.getStatusReport());

    }
}
