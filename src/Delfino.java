public class Delfino extends Animale{
    @Override
    public void verso(){
        System.out.println("Ih Ih IHIHHIHIH");
    }

    @Override
    public void mangia(){
        System.out.println("Pesciolini");
    }

    public Delfino() {
        verso();
        mangia();
        dormi();
    }
}
