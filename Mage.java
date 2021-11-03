import java.util.Random;

public class Mage extends Hero{
    public Mage(String name) {
        super(name, 12, 10);
    }

    @Override
    void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.println("Casting A Spell on the Enemy!");
    }



}
