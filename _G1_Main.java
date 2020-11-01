package game;

import java.util.ArrayList;
import java.util.Scanner;

public class _G1_Main {
    public static void main(String[] args) {
        System.out.println("Input hero's name:");
        Hero hero = new Hero();
        Monster monster =new Monster();
        Skill skill=new Skill();
        hero.hero(monster);
        monster.monster();
        outer:
        for (int i = 0; i < 1000; i++)
        {
            System.out.println("第" + (i + 1) + "回合");
            System.out.println("Tip:hurt=attack-defence");
            skill.HeroSkill(hero,monster);
            if(hero.HP1<=0)
            {
                System.out.println("default");
                break;
            }
            for (int j = 0; j < monster.HP2.length; j++) {
                int v=0;
                if (monster.HP2[j] < 0)
                    v++;
                if(v==3) {
                    System.out.println("win");
                    break outer;
                }
                }
            monster.combat(hero);
            if(hero.HP1<=0)
            {
                System.out.println("default");
                break ;
            }
            for (int j = 0; j < monster.HP2.length; j++) {
                int v=0;
                if (monster.HP2[j] < 0)
                    v++;
                if(v==3) {
                    System.out.println("win");
                    break outer;
                }
            }
            System.out.println("-----------------");
            }
    }
}
