public class Passerotto extends Animale{
    @Override
    public void verso() {
        System.out.println("Chip Chip");
    }

    @Override
    public void mangia() {
        System.out.println("Vermi");
    }

    public void vola(){
        System.out.println("Sto volando!");
    }
    public Passerotto() {
        verso();
        mangia();
        dormi();
    }
}
