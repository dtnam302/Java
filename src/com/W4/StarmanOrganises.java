package com.W4;

import java.util.ArrayList;
import java.util.List;

public class StarmanOrganises {

    private List<RemoteControllable> controllables = new ArrayList<RemoteControllable>();

    public void addControllable(Object o){
        if(o instanceof  RemoteControllable){
            controllables.add((RemoteControllable) o);
        }
    }
    public void getAllStatusReports(){
        for(RemoteControllable e: controllables) {
            System.out.println(e.getStatusReport());
        }
    }

    public static void main(String[] args) {
        SpaceStation station = new SpaceStation("Mars");
        station.updateMission("Store food rations for hungry space travelers");

        Rover rover = new Rover();
        rover.setLocation(100.0, 42.0);
        rover.updateMission("Find water");

        StarmanOrganises organise = new StarmanOrganises();
        organise.addControllable(station);
        organise.addControllable(rover);
        organise.getAllStatusReports();

    }

}
