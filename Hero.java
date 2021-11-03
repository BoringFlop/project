abstract class Hero implements Mortal{
    String name;
    int pHealth;
    int damage;

    public Hero(String name, int pHealth, int damage) {
        this.name = name;
        this.pHealth = pHealth;
        this.damage = damage;
    }


    abstract void attackEnemy(Enemy enemy);

    void takeDamage(int damage){
        pHealth = pHealth - damage;
    }

    public String getName(){
        return name;
    }


    @Override
    public boolean isAlive() {
        if(pHealth > 0){
          return true;
        }
        else{
            return false;
        }

    }
}
