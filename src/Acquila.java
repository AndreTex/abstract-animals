public class Acquila extends Animale{
    @Override
    public void verso() {
        System.out.println("AAAAAAAAA");
    }

    @Override
    public void mangia() {
        System.out.println("Piccoli roditori");
    }

    public Acquila() {
        verso();
        mangia();
        dormi();
    }
}
