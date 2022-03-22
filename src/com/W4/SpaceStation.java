package com.W4;

public class SpaceStation implements RemoteControllable{
    private String planetClass;
    private String mission;

    SpaceStation (String planet){
        planetClass = planet;
    }

    public String getLocation() {

        return String.format("The space station floats around the planet %s",planetClass);

    }

    public String getStatusReport() {

        return String.format("%s\nThe station is on a mission to: %s",getLocation(),mission);
    }

    public void updateMission(String newMission) {

        mission = newMission;
    }

    public static void main(String[] args) {
        SpaceStation station = new SpaceStation("Mars");
        System.out.println(station instanceof RemoteControllable);
        station.updateMission("Store food rations for hungry space travelers");
        System.out.println(station.getStatusReport());

    }

}
