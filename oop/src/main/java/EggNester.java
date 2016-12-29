public interface EggNester {

    default void lend() {
        System.out.println("Lending!..");
    }

    void nest();
}
