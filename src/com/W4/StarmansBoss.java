package com.W4;

import java.util.Collection;
import java.util.List;

public class StarmansBoss {
    public int getCollectiveAge(Collection<Astronaut> o) {
        int outAge = 0;
        for(Astronaut e: o) {
            outAge+=e.getAge();
        }
        return outAge;
    }

    public static void main(String[] args) {
        Astronaut spaceman = new Astronaut("Spaceman", 20, "Hash browns", "0001 to Mars");
        Astronaut spacegirl = new Astronaut("Spacegirl", 21, "Pizza", "0002 to the Moon");
        Astronaut spacedog = new Astronaut("Spacedog", 7, "Hash browns", "0001 to Mars");

        List<Astronaut> astronautList = List.of(spaceman, spacegirl, spacedog);

        StarmansBoss boss = new StarmansBoss();
        System.out.println(boss.getCollectiveAge(astronautList));

    }
}
