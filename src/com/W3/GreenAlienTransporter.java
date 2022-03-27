package com.W3;

import java.util.ArrayList;
import java.util.Arrays;


public class GreenAlienTransporter {
    //list = ArrayList
    //set = HashSet
    // dic = HashMap

    private String name; //neu doi thanh space thi line 20 => space = name


    //Q10
    private ArrayList<GreenAlien> aliens = new ArrayList<GreenAlien>();

    public GreenAlienTransporter(String name){
        this.name = name; //this.name => varaiable cua class GreenAlienTransporter
    }


    //Q10
    public boolean addPassenger(GreenAlien alien){
        if (!aliens.contains(alien)){ //if not ...
            aliens.add(alien);
            return true;
        }
        else return false;
    }
    public boolean removePassenger(GreenAlien alien){
        if (aliens.contains(alien)){
            aliens.remove(alien);
            return true;
        }
        else return false;
    }
    public String getPassengerNames() {
        String outString ="";
        for(int i=0;i<aliens.size();i++) { // khoi tao index;xac dinh dieu kien dung ( index cuoi); buoc nhay i++=>i+=1

            outString+=aliens.get(i).name;
            if (i!= aliens.size()-1) outString += ", ";

        }
        return outString;
    }
    public int countEyes() {
        int out = 0;
        for (GreenAlien alien:aliens){
            out+=alien.age; //age = eye
        }
        return out;
    }
    public ArrayList<String> shoppingList(){
        ArrayList<String> output = new ArrayList<String>();
        for (GreenAlien alien: aliens){
            output.add(alien.favouriteBand);
        }
        return output;
    }
    public String toString(){
        String outString = String.format("The passengers on Fun Club are:\n%s\nThe number of eyes on this transporter is: %d",getPassengerNames(),countEyes());
        return outString;
    }


}
