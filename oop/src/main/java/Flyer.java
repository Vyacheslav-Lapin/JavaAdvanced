public interface Flyer {
    void fly();
    void lend();
    void up();

    void setAge(int age);

    default void eat() {
        fly();
        lend();
        up();
        setAge(123);

        System.out.println("Mmmmm!..");
    }

    static void main(String[] args) {
        System.out.println("123");
    }
}
