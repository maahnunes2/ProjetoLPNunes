/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */


public class Autorizacao {
    private String dataDaAvaliação;
    private Estado estado;
    private Local local;

    
    
    
    public Autorizacao(String dataDaAvaliação){
        this.dataDaAvaliação = dataDaAvaliação;
        estado = new Pendente ();
        estado.addAutorizacao(this);
        this.local = local;
    }

    public String getDataDaAvaliação() {
        return dataDaAvaliação;
    }

    public void setDataDaAvaliação(String dataDaAvaliação) {
        this.dataDaAvaliação = dataDaAvaliação;
    }

   public void autorizar(){
        this.estado = new Autorizado();
    }
    
    public void negar(){
        this.estado = new Negado();
    }

    public Estado getEstado() {
        return estado;
    }
    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
