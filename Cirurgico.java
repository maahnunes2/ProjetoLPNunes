
import java.util.ArrayList;


public class Cirurgico extends Procedimento {
    private ArrayList<Hospital> hospital;

    public Cirurgico(ArrayList<Hospital> hospital, String nome, double custo) {
        super(nome, custo);
        this.hospital = hospital;
        hospital = new ArrayList();
    }
    

}
