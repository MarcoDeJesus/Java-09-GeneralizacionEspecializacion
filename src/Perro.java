public class Perro extends Mamifero{
    public Perro(){
        System.out.println("SOY UN PERRO!");
        tienePatas = true;
    }

    void masticar(){
        Alimentarse();
        System.out.println("Estoy comiendo mis croquetas.");
    }
}
