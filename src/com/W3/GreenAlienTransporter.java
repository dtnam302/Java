package com.W3;

import java.util.ArrayList;
import java.util.Arrays;


public class GreenAlienTransporter {
    //list = ArrayList
    //set = HashSet
    // dic = HashMap

    private String name; //neu doi thanh space thi line 20 => space = name
    private ArrayList<Integer> cells;

    //Q10
    private ArrayList<GreenAlien> aliens = new ArrayList<GreenAlien>();

    public GreenAlienTransporter(String name){
        this.name = name; //this.name => varaiable cua class GreenAlienTransporter
        cells = new ArrayList<Integer>(Arrays.asList(100,100,100,100));
        // khoi tao 1 list co 4 phan tu voi gia tri khoi tao la 100
    }
    public boolean replaceCell(int cellNum){
        if (cellNum>=1 && cellNum <=4) {
            //cells[cellNum-1] = 100;
            cells.set(cellNum-1, 100); //index bat dau bang 0
            return true;
        }
        else return false;
    }

    public boolean travel(int lightYears){
        int numReduce = lightYears*10; //24 years => 240% reduce
        for(int i=0;i<4;i++){
            if (cells.get(i) < numReduce){ //cells.get(i) => cells[i]
                numReduce -= cells.get(i);
                cells.set(i,0);             // cells[i] = 0
            }
            else { // co 1 cuc pin con du nang luong de di het chuyen di
                cells.set(i, cells.get(i) - numReduce); //100 -40
                numReduce = 0;
            }
        }
        return numReduce == 0;
    }

    public int getCharge(int cellNum){
        if (cellNum>=1 && cellNum<=4) {
            return cells.get(cellNum - 1);
        } else return -1;
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

    public static void main(String[] args) {
        GreenAlienTransporter transporter = new GreenAlienTransporter("Fun Club");

        GreenAlien kloup = new GreenAlien("Kloup", 9, "Biscuits");
        GreenAlien gwerp = new GreenAlien("Gwerp", 4, "Marshmellows");
        GreenAlien blarg = new GreenAlien("Blarg", 3, "Pop Rocks");
        GreenAlien lesap = new GreenAlien("Lesap", 5, "Chocolate");
        GreenAlien hugso = new GreenAlien("Hugso", 2, "Pop Rocks");

        transporter.addPassenger(kloup);
        transporter.addPassenger(gwerp);
        transporter.addPassenger(blarg);
        transporter.addPassenger(lesap);
        transporter.addPassenger(hugso);

        System.out.println(transporter);



    }
}
