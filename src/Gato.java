public class Gato extends Mamifero{
    public Gato(){
        System.out.println("SOY UN GATO!");
        tienePatas = true;
    }

    void masticar(){
        Alimentarse();
        System.out.println("Estoy comiendo huesos de pescado.");
    }
}
