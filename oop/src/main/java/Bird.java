public class Bird extends Animal implements Flyer, EggNester {

    private int age;
    private Color color;

    @Override
    public void fly() {
        System.out.println("flying!");
    }

    @Override
    public void lend() {
        System.out.println("landing...");
    }

    @Override
    public void up() {
        System.out.println("up!");
    }

    public static void main(String[] args) {
        Flyer flyer = new Bird();

        flyer.up();
        flyer.fly();
        flyer.lend();

        if (flyer instanceof EggNester) {
            EggNester eggNester = (EggNester) flyer;
            eggNester.nest();
        }
    }

    @Override
    public void nest() {
        System.out.println("Nesting!");
    }
}
