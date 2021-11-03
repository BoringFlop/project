import java.util.Random;
import java.util.Scanner;

public class Battlegrounds{
    private static String Scanner;

    public static void main(String[] args) {
      Warrior hero = new Warrior("Guy");

      Zombie enemy = new Zombie();


        Random chanceOfRes = new Random();
        if(enemy.isAlive()){
            int randomNumber = chanceOfRes.nextInt(100);
            int resChance = randomNumber;
            if(resChance <= 25){
              boolean ressurect = true;
            }
        }




    }

}
