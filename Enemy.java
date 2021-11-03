abstract class Enemy implements Mortal {
    public int health;
    int damage;

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth(){return health;}


    public void setHealth(int health){
        this.health = health;
    }


    void takeDamage(int damage){
        health = health - damage;
    }

    abstract void attackHero(Hero hero);


    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        }
        else{
            return false;
        }
    }



}
