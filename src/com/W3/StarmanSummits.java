package com.W3;

public class StarmanSummits {
    public void climbMountain(double height, double dash, double slide){
        int attemp = 1; //so lan treo
        while (height>=dash) {
            height -= (dash-slide);
            attemp+=1;
        }
//        while(true) {
//            attemp+=1;
//            curHeight+=dash;
//            if(curHeight>=height) break;
//            curHeight-=slide;
//        }
        System.out.println(String.format("Starman needs to dash %d times before he reaches the top of the mountain",attemp));
    }

    public static void main(String[] args) {
        StarmanSummits starman = new StarmanSummits();
        starman.climbMountain(123456, 54.7, 2.8);

    }
}
