package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
       imprimirSelecionados();

    }

    static  void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidados informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de N " + (indice + 1) + " e o " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        
        int cadidatosSelecionados = 0;
        int cadidatosAtual = 0;
        double salarioBase = 2000.0;
        while (cadidatosSelecionados < 5) {
            String candidato = candidatos[cadidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido );
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " Foi selecionado para a vaga");
                cadidatosSelecionados++;
            }
            cadidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2000);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
}
