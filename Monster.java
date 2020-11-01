package game;

public class Monster {
    String[]name2={"哥布林1","哥布林2","哥布林3"} ;
    float[]HP2max={1000,1000,1000};
    float[]HP2={10,10,10};
    float attack2;
    float[]defence2={20,20,20};
    public void monster() {
        for (int i = 0; i < name2.length; i++) {
            System.out.println("enemy's information:");
            System.out.println("name:" + name2[i]);
            System.out.println("HP:" + HP2[i]);
            System.out.println("attack:(40-70)");
            System.out.println("defence:" + defence2[i]);
            System.out.println("-----------------");
        }
    }
    public void combat(Hero a){
        float hurt1;
        for (int j = 0; j <name2.length ; j++) {
            attack2 = (int) (Math.random() * 10000 % 40 + 30);
            hurt1 = attack2 - a.defence1;
            if (hurt1 <= 0)
                hurt1 = 1;
            a.HP1 = a.HP1 - hurt1;
            System.out.println(name2[j] + "对" + a.name1 + "造成了" + hurt1 + "点伤害");
            System.out.println(a.name1 + "HP:" + a.HP1);
            System.out.println(name2[j] + "HP:" + HP2[j]);
        }
    }
}
