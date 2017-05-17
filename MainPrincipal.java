

//Mateus Nunes de Oliveira 31657461

import java.util.Scanner;
import java.util.ArrayList;

public class MainPrincipal {

    
    public static void main(String[] args) {

        boolean fim = false;
        boolean fim2 = false;
        String nomeDoPlano, nomeSegurado;
        int numAut, cpf, opc, opc2, opc3, opc4, opc5;

        Scanner string = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        
        ArrayList<Operadora> operadora = new ArrayList<Operadora>();
        ArrayList<PlanoDeSaude> plano = new ArrayList<PlanoDeSaude>();
        ArrayList<Segurado> segurado = new ArrayList<Segurado>();
        ArrayList<Procedimento> procedimento = new ArrayList<Procedimento>();

        while (fim == false) {
            System.out.println("Digite o nome do Plano de Saúde: ");
            nomeDoPlano = string.nextLine();
            
            System.out.println("Digite o numero de Autorização: ");
            numAut = num.nextInt();
            
            PlanoDeSaude p = new PlanoDeSaude(numAut, nomeDoPlano);
            plano.add(p);
            
            System.out.println("Deseja inserir um novo Plano De Saúde: (1-Sim | 2-Não)");
            opc = num.nextInt();
            
            if (opc == 2) {
                fim = true;
            }
        }
        while (fim2 == false) {
            System.out.println("Digite o nome do Segurado: ");
            nomeSegurado = string.nextLine();
            System.out.println("Digite o numero do CPF: ");
            cpf = num.nextInt();
            Segurado s = new Segurado(nomeSegurado, cpf);
            segurado.add(s);

            for (int i = 0; i < plano.size(); i++) {
                System.out.println("O Sr(a) Deseja comprar o plano " + plano.get(i).getNome() + " para o segurado " + s.getNome() + " :(1 - Sim | 2 - Não)");
                opc2 = num.nextInt();
                if (opc2 == 1) {
                    plano.get(i).addSegurado(s);
                    s.addPlanoDeSaude(plano.get(i));
                    System.out.println("Plano de Saude Adquirido com Sucesso!!!");
                }
            }
            for (int i = 0; i < plano.size(); i++) {
                System.out.println("Deseja Autorizar o segurado " + segurado.get(i).getNome() + " : (1 - Sim | 2 - Não)");
                opc3 = num.nextInt();
                if (opc3 == 1) {
                    System.out.println("Estado: " + Estado.EstadoEnum.ESTADO1.estado);
                }
                if (opc3 == 2) {
                    System.out.println("Estado: " + Estado.EstadoEnum.ESTADO2.estado);
                }

            }

            System.out.println("Deseja inserir um novo Plano De Saúde: (Press: 1-Sim | 2-Não)");
            opc4 = num.nextInt();
            if (opc4 == 2) {
                fim = true;
            }
            System.out.println("Deseja inserir um novo Segurado: (Press: 1-Sim | 2-Não)");
            opc5 = num.nextInt();
            if (opc5 == 2) {
                fim = true;
            }
        }
    }
}
