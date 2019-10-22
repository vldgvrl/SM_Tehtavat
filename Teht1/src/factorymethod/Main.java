package factorymethod;

public class Main {

    public static void main(String[] args) {
        System.out.println("****Opettaja****");
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        System.out.println("****Opiskelija****");
        AterioivaOtus opiskelija = new Opiskelija();
        opiskelija.aterioi();
        
        System.out.println("****Vieras****");
        AterioivaOtus vieras = new Vieras();
        vieras.aterioi();
    }
}
