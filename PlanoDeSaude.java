/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31610714
 */import java.util.ArrayList;
 
public class PlanoDeSaude {
    private int numDeAutorzacao;
    private String nome;
    private ArrayList<Segurado> segurado;
    
    public PlanoDeSaude(){
        segurado = new ArrayList();
    }
    
    public PlanoDeSaude(int numDeAutorizacao, String nome){
        this.numDeAutorzacao = numDeAutorizacao;
        this.nome = nome;
        segurado = new ArrayList();
        
    }


    public void addSegurado(Segurado segurado) {
        this.segurado.add(segurado);
    }

    public long getNumDeAutorzacao() {
        return numDeAutorzacao;
    }

    public void setNumDeAutorzacao(int nomeDeAutorzacao) {
        this.numDeAutorzacao = nomeDeAutorzacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public ArrayList<Segurado> getSegurado() {
        return segurado;
    }
    
}



