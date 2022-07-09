public class Aleksey extends Man{
    public Aleksey(int hp, String name, int damage) {
        super(hp, name, damage);
    }

    @Override
    public void Attack(Man man) {
        man.setHp(man.getHp() - this.getDamage());
    }

    public String getAsString() {
        return "{" +
                "hp=" + getHp() +
                ", damage=" + getDamage() +
                '}';
    }
}
