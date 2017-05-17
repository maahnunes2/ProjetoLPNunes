import java.util.ArrayList;
public class Hospital extends Procedimento{
    private int qtdMedicos;
    private ArrayList<Cirurgico> cirurgico;
    public Hospital(int qtdMedicos, String nome, double custo) {
        super(nome, custo);
        this.qtdMedicos = qtdMedicos;
        cirurgico = new ArrayList();
    }

    
    
    public int getQtdMedicos() {
        return qtdMedicos;
    }

    public void setQtdMedicos(int qtdMedicos) {
        this.qtdMedicos = qtdMedicos;
    }

   
    
}
