import java.util.Random;

public class Zombie extends Enemy implements Mortal{

   boolean ressurect;



    public Zombie() {
        super(30,3);
        this.ressurect = ressurect;
    }

    @Override
    void attackHero(Hero hero) {
        hero.takeDamage(damage);
        System.out.println("Grhh Grhh Grhh");
    }


  @Override
    public boolean isAlive(){
        if(ressurect == true){
            return true;
        }
        else{
            return false;
        }
  }



}
