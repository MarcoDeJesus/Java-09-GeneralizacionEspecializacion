public class Zorro extends Mamifero{
    public Zorro(){
        System.out.println("SOY UN ZORRO!");
        tienePatas = true;
    }

    void devorando(){
        Alimentarse();
        System.out.println("Estoy comiendo una liebre.");
    }
}
