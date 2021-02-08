public class Serpiente extends Reptil{

    public Serpiente(){
        System.out.println("Soy una SERPIENTE!");
        tienePatas = false;
    }

    void tragando(){
        Alimentarse();
        System.out.println("Estoy tragando una rata.");
    }
}
