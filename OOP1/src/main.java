import java.util.Scanner;

class main
{
    static int Encounter()
    {
        Bat.life = 20;
        long i;
        i = System.currentTimeMillis() % 2;
        if ( i == 1 )
        {
            System.out.println("The encounter has begun");
            for (int c = 0; ; c++)
            {
                System.out.println("");
                System.out.println("");
                System.out.println("Attack");
                long j, k;
                j = System.currentTimeMillis() % 2;
                System.out.println("Guess the number 0 or 1: ");
                Scanner a = new Scanner(System.in);
                k = a.nextInt();
                if (j == k)
                {
                    Bat.life -= 2;
                    if (Bat.life <= 0)
                    {
                        System.out.println("You've killed the bat!");
                        return 1;
                    }
                    System.out.println("You've hit the bat!");
                    System.out.println("Bat life is " + Bat.life + ", Miner life is " + Mine.life);
                }
                else
                    {
                        System.out.println("The bat has reflected your attack!");
                        System.out.println("Bat life is " + Bat.life + ", Miner life is " + Mine.life);
                    }

                System.out.println("");
                System.out.println("");
                System.out.println("Defense");
                j = System.currentTimeMillis() % 2;
                System.out.println("Guess the number 0 or 1: ");
                a = new Scanner(System.in);
                k = a.nextInt();
                if (j == k)
                {
                    System.out.println("You've reflected bat's attack!");
                    System.out.println("Bat life is " + Bat.life + ", Miner life is " + Mine.life);
                } else {
                    Mine.life -= 2;
                    if (Mine.life <= 0) {
                        System.out.println("You've been killed by the bat!");
                        return 0;
                    }
                    System.out.println("You've been hit!");
                    System.out.println("Bat life is " + Bat.life + ", Miner life is " + Mine.life);
                }
            }
        }
        else
        {
            System.out.println("");
            System.out.println("");
            System.out.println("The bat doesn't wish to fight!");
            System.out.println("Do you want to eat the bat? 1 if yes, 0 if no");
            Scanner b = new Scanner(System.in);
            int e = b.nextInt();
            if (e == 0)
            {
                System.out.println("You've passed by the bat");
                return 2;
            }
            else
            {
                System.out.println("");
                System.out.println("You've decided to eat the bat");
                long r = System.currentTimeMillis() % 2;
                if ( r == 0)
                {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("You've ate the bat successfully");
                    Mine.life += 10;
                    System.out.println("Your life has been increased, current life state is: " + Mine.life);
                    return 2;
                }
                else
                {
                    System.out.println("");
                    System.out.println("The bat was poisonous!");
                    Mine.life -= 5;
                    if (Mine.life <= 0)
                    {
                        System.out.println("");
                        System.out.println("You've died from eating the bat! Game over!");
                        return 0;
                    }
                    System.out.println("Your life has been decreased, current life state is: " + Mine.life);
                    return 2;
                }
            }
        }
    }


    static int Mining(int j)
    {
        Mine.coal += j;
        if ( j <= 50 )
            Mine.energy -= j/6;
        else
            Mine.energy -= j/3;
        if ( Mine.coal >= 500)
        {
            System.out.println("Miner has finished his job");
            return 1;
        }

        if ( Mine.energy <= 0 )
        {
            System.out.println("Miner has died from exhaust! Game over!");
            return 0;
        }
        return 10;
    }

    public static void main(String[] args)
    {
        int j, k, l;
        for (int i = 1; ; i++)
        {
            System.out.println("");
            System.out.println("input the amount of coal dug today: ");
            Scanner a = new Scanner(System.in);
            j = a.nextInt();
            k = Mining(j);
            if (k == 0 || k == 1)
            {
                System.out.println("Miner energy is " + Mine.energy + ", " + "Coal dug: " + Mine.coal);
                break;
            }
            System.out.println("Miner energy is " + Mine.energy + ", " + "Coal dug: " + Mine.coal);
            l = Encounter();
            if (l == 0)
            {
                System.out.println("Miner has been killed by the bat! Game over!");
                break;
            }
        }
    }
}