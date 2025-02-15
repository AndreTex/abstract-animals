public class Delfino extends Animale implements Nuotante{
    @Override
    public void verso(){
        System.out.println("Ih Ih IHIHHIHIH");
    }

    @Override
    public void mangia(){
        System.out.println("Pesciolini");
    }

    @Override
    public void nuota(){
        System.out.println("Sto nuotando");
    }

    public Delfino() {
        verso();
        mangia();
        dormi();
    }
}
