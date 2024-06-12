import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Digite o primeiro numero: ");
        int param1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        int param2 = input.nextInt();

        try{
            contar(param1, param2);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    public static void contar(int parametro1, int parametro2)throws ParametrosInvalidosException {
        if (parametro1>parametro2){
            throw new ParametrosInvalidosException();    
        } else {int numFinal = parametro2 - parametro1; 
                for(int i=1;i<=numFinal;i++){
                    System.out.println("Imprimindo o numero "+ i);
                }
            }
    } 
}


