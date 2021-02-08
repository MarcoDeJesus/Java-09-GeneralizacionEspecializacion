public class Main {
    public static void main(String args[]){
        Gato minino = new Gato();
        System.out.println("¿Un gato tiene patas? "+ minino.tienePatas);
        minino.masticar();

        System.out.println();

        Serpiente sneiky = new Serpiente();
        System.out.println("¿Una Serpiente tiene patas? " + sneiky.tienePatas);
        sneiky.tragando();

        System.out.println();

        Mamifero scobby = new Perro();
        scobby.Alimentarse();

        System.out.println();

        Animal zorro = new Zorro();
        zorro.Alimentarse();
    }
}
