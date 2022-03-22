package com.W3;

public class LocationBeacon {

    private int hours;
    private int minutes;
    private int distances;


    public void heartBeat(int startHour, int startMinute, int startDistance, int speed, int duration){

        int speedInTenMinute = speed/(duration/10);

        distances = startDistance;
        hours = startHour;
        minutes = startMinute;


        /*while (duration>0){
            minutes +=10;
            hours = (startHour + minutes / 60) % 24; // minutes = 61 => 61 div 60 => 1 + 14 = 15
            distances += speedInTenMinute;
            String output = String.format("[%d:%d] Starman is %dkm away from Earth",hours,minutes%60,distances);
            System.out.println(output);

            duration-=10;
        }*/

        int numTrack = duration/10; //every 10 minutes
        for (int i=0;i<numTrack;i++){
            minutes +=10;
            hours = (startHour + minutes / 60) % 24; // minutes = 61 => 61 div 60 => 1 + 14 = 15
            distances += speedInTenMinute;
            String output = String.format("[%d:%d] Starman is %dkm away from Earth",hours,minutes%60,distances);
            System.out.println(output);
        }
    }
    public static void main(String[] args) {
        LocationBeacon beacon = new LocationBeacon();
        beacon.heartBeat(14, 31, 300000, 60000, 60);

    }
}
