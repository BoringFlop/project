import java.util.Random;

public class Archer extends Hero{
    public Archer(String name) {
        super(name, 14, 6);
    }
    @Override
    void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.println("Shooting the Enemy!");
    }


}
