import java.util.Random;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name, 8,12);
    }

    @Override
    void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.println("Bashing the Enemy!");
    }


}
