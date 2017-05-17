/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31610714
 */

import java.util.List;

public class Procedimento {

    private String nome;
    private double custo;
    private List<Procedimento> listaProcedimentos;

    public Procedimento(String nome, double custo) {
        this.nome = nome;
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public double getCusto() {
        return custo;
    }

    public List<Procedimento> getListaProcedimentos() {
        return listaProcedimentos;
    }

    public void addProcedimento(Procedimento procedimento) {
        listaProcedimentos.add(procedimento);
    }
}

