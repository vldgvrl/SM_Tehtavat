package factorymethod;

public class Vieras extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Maito();
    }

}
