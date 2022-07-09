public class Man {

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    int hp;
    int damage;
    String name;


    public Man(int hp, String name, int damage) {
        this.hp = hp;
        this.name = name;
        this.damage = damage;
    }

    public void Attack(Man man){
        hp--;
    }




}
