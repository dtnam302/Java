package com.W4;

public class Mercury extends Planet{
    public Mercury() {
        super("Mercury", 1, "Hot");
    }
    public String getFact(){
        return "Mercury is only the second hottest planet in the Solar System, despite being closest to the sun.";
    }

    public static void main(String[] args) {
        Mercury mercury = new Mercury();
        System.out.println(mercury instanceof Planet);
        System.out.println(mercury.getAxisRotation());
        System.out.println(mercury);
        System.out.println(mercury.getFact());

    }
}
