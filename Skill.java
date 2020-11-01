package game;

import java.util.Scanner;

public class Skill {
    public void HeroSkill(Hero a,Monster b)
    {
        System.out.println("choose your enemy");
        int t;
        Scanner sa =new Scanner(System.in);
        t= sa.nextInt();
        t=t-1;
        String[]m={"1.普通攻击","2.舍身一击","3.治疗术","4.强化普攻攻击"};
        String[]n={"1倍伤害","伤害2倍,损失伤害1倍伤害血量","HP+100","1.5倍攻击伤害"};
        System.out.println("choose skill");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]);
            System.out.println(",技能描述:"+n[i]);
        }
        int choose;
        Scanner sc=new Scanner(System.in);
        choose=sc.nextInt();
        if(choose==1)
        {
            a.attack1= (int) (Math.random()*10000%30+30);
            float hurt1;
            hurt1=a.attack1-b.defence2[t];
            if(hurt1<=0)
                hurt1=1;
            b.HP2[t]=b.HP2[t]-hurt1;
            System.out.println(a.name1+"对"+b.name2[t]+"造成了"+hurt1+"点伤害");
        }
        else if(choose==2)
        {
            a.attack1= (int) (Math.random()*10000%30+30);
            a.attack1 = a.attack1 * 2;
            a.HP1=a.HP1-a.attack1*(float)0.3;
            float hurt1;
            hurt1=a.attack1-b.defence2[t];
            if(hurt1<=0)
                hurt1=1;
            b.HP2[t]=b.HP2[t]-hurt1;
            System.out.println(a.name1+"对"+b.name2[t]+"造成了"+hurt1+"点伤害,"+"自身损失"+a.attack1*(float)0.3+"点血量");
        }
        else if (choose==3)
        {
            a.HP1=a.HP1+100;
            if(a.HP1>a.HP1max)
                a.HP1=a.HP1max;
        }
        else if(choose==4)
        {
            a.attack1= (int) (Math.random()*10000%30+30);
            a.attack1 = a.attack1 * (float)1.5;
            float hurt1;
            hurt1=a.attack1-b.defence2[t];
            if(hurt1<=0)
                hurt1=1;
            b.HP2[t]=b.HP2[t]-hurt1;
            System.out.println(a.name1+"对"+b.name2[t]+"造成了"+hurt1+"点伤害");
        }

        else
        {
            System.out.println("输入失败，系统默认为普通攻击");
            a.attack1= (int) (Math.random()*10000%30+30);
            float hurt1;
            hurt1=a.attack1-b.defence2[t];
            if(hurt1<=0)
                hurt1=1;
            b.HP2[t]=b.HP2[t]-hurt1;
            System.out.println(a.name1+"对"+b.name2+"造成了"+hurt1+"点伤害");
        }
    }
}
