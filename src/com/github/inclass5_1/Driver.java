package com.github.inclass5_1;

public class Driver {

    public static void main(String[] args) {
        double x = 5, y=5, z=5;

        Player[] player = {new Player("nick"), new Player("gold"), new Player("lollero")};

        player[0].setLocation(1,1,1);
        player[1].setLocation(30,2,2);
        player[2].setLocation(40,3,3);

        for(Player person: player){
            if (person.nearby(x,y,z)){
                System.out.println("Player " + person.getName() + " is near the flag! Location: " + person.getLocation());
            }
        }
    }
}
