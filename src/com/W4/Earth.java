package com.W4;

public class Earth extends Planet{

    public Earth() {
        super("Earth", 3, "Warm");
    }
    public String home(){
        return "Home to every one of us";
    }
    public long getPopulation(){
        return 7874965825L;
    }

    public static void main(String[] args) {
        Earth earth = new Earth();
        System.out.println(earth instanceof Planet);
        System.out.println(earth.getAxisRotation());
        System.out.println(earth);
        System.out.println(earth.home());
        System.out.println(earth.getFact());
        System.out.println(earth.getPopulation());

    }
}
