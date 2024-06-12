package Candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("\f");
        System.out.println("Processo Seletivo");
        String [] candidatos = {"Joao","Arthur","Ronaldo","Marcio","Juan"};
        for(String candidato: candidatos){
            entrarContato(candidato);
        }
    }
    static void entrarContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            } else {System.out.println("Contato realizado com sucesso");}
            
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Coseguimos contato com "+ candidato + " na " + tentativasRealizadas + " tentativa");
        } else {System.out.println("Nao conseguimos contato com "+candidato+", numero maximo tentativas "+ tentativasRealizadas +" realizada.");}
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    public static void imprimirSelecionados(){
        String [] candidatos = {"Joao","Arthur","Ronaldo","Marcio","Juan"};
        for(int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato No"+(i+1)+" foi " + candidatos[i]);
        }
    }

    
    public static void candidatosSelecao(){
        String [] candidatos = {"Joao","Arthur","Ronaldo","Marcio","Juan","Salvio","Victor","Lucas","Jacinto"};
        double salarioBase = 2000;
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;

        while(candidatosSelecionados<5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println(candidato + " solicitou este valor de salario: "+ salarioPretendido);
            
            if (salarioPretendido<=salarioBase){
                candidatosSelecionados++;
                System.out.println(candidato + " foi selecionado!");
            }
            candidatosAtual++;
        }
    }
    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000;
        if (salarioPretendido<salarioBase){
            System.out.println("Ligar para o candidato!");
        } else if(salarioPretendido==salarioBase){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {System.out.println("Aguardando resultado demais candidatos");}
    }
    
    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

}
