import java.util.Random;

public class Skeleton extends Enemy {
    public Skeleton() {
        super(15,10);
    }

    @Override
    void attackHero(Hero hero) {
        hero.takeDamage(damage);
        System.out.println("Shoo.. Theem!");
    }


}

