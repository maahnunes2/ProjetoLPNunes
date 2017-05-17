/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31610714
 */

import java.util.ArrayList;
import java.util.List;

public class ListaItemDeProcedimento {

    private List<Procedimento> listaDeProcedimentos;

    public ListaItemDeProcedimento() {
        listaDeProcedimentos = new ArrayList();
    }

    public void addProcedimento(Procedimento procedimento) {
        this.listaDeProcedimentos.add(procedimento);
    }
}

