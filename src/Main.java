public class Main {
    public static void main(String[] args) {

        Sanek sanek = new Sanek(100,"Sanechek",20);
        Aleksey aleksey = new Aleksey(100,"Leha",30);

        System.out.println("У каждого драчуна по 100 хп");

        sanek.Attack(aleksey);

        System.out.println(aleksey.hp);

        System.out.println("Сила Лехи" + aleksey.getAsString());

        aleksey.Attack(sanek);

        System.out.println(sanek.hp);

        System.out.println("Сила Санька" + sanek.getAsString());


    }
}