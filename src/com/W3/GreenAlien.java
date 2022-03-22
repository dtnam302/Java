package com.W3;

public class GreenAlien {
    public String name;
    public int age; //eyeCount
    public String favouriteBand; //favouriteCandy

    public GreenAlien() {
        name = "GreenAlien";
        age = 23;
        favouriteBand = "abc";
    }

    public GreenAlien(String tempName, int tempAge, String tempBand) {
        name = tempName;
        age = tempAge;
        favouriteBand = tempBand;

    }



    public boolean equals(GreenAlien other) {
        if (name == other.name &&
                age == other.age &&
                favouriteBand == other.favouriteBand)
                {
            return true;
        }
        return false;
    }



    public String toString() {
        return String.format("This Alien is called %s and has %d eyes. Gross. It seems to enjoy eating %s",
                name, age, favouriteBand);
    }


    public static void main(String[] args) {
        GreenAlien kloup = new GreenAlien();
        GreenAlien lesap = new GreenAlien();
        GreenAlien gwerp = new GreenAlien("Gwerp", 4, "Marshmellows");
        GreenAlien blarg = new GreenAlien("Kloup", 3, "Pop Rocks");

        System.out.println(kloup.equals(lesap));
        System.out.println(gwerp.equals(lesap));
        System.out.println(kloup.equals(blarg));

        System.out.println(kloup);
    }

}
