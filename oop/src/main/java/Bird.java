public class Bird extends Animal implements Flyer, EggNester {

    private int age;
    private Color color;

    public void khKh(){
        System.out.println("KhKh!!!");
    }

    @Override
    public void fly() {
        System.out.println("flying!");
    }

    @Override
    public void lend() {
        EggNester.super.lend();
    }

//    @Override
//    public void lend() {
//        System.out.println("landing...");
//    }

    @Override
    public void up() {
        System.out.println("up!");
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Flyer flyer = new Bird();
        EggNester eggNester1 = new Bird();

        flyer.eat();

        if (flyer instanceof EggNester || flyer instanceof Bird) {
            EggNester eggNester = (EggNester) eggNester1;
            eggNester.nest();
        }
    }

    @Override
    public void nest() {
        System.out.println("Nesting!");
    }
}
