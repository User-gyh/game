package game;

import java.util.Scanner;

public class Hero {
    String name1;
    Scanner sc = new Scanner(System.in);
    float HP1max = 500;
    float HP1 = HP1max;
    float attack1;
    float defence1 = 10;

    public void hero(Monster b) {
        name1 = sc.next();
        System.out.println("your information:");
        System.out.println("name:" + name1);
        System.out.println("HP:" + HP1);
        System.out.println("attack:(30-60)");
        System.out.println("defence:" + defence1);
        System.out.println("-----------------");
    }
}
