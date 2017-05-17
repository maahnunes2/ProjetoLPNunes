


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
import java.util.ArrayList;
public class Estado {
    private ArrayList<Autorizacao> autorizacoes;

    public Estado() {
        autorizacoes = new ArrayList();
    }
    
    public void addAutorizacao(Autorizacao autorizacao){
        autorizacoes.add(autorizacao);
    }
    
    public enum EstadoEnum{
        ESTADO1("Autorizado"),ESTADO2("Negado");
        public String estado;
        EstadoEnum(String estado){
            this.estado = estado;
        }
}
}

