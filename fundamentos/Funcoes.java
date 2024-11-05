import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.print("Primeiro Número: ");
        Double primeiroNumero = sc.nextDouble();

        System.out.print("Segundo Número: ");
        Double segundoNumero = sc.nextDouble();

        System.out.print("Terceiro Número: ");
        Double terceiroNumero = sc.nextDouble();
        
        double valor =  max(primeiroNumero, segundoNumero, terceiroNumero);
        exbirMensagem("O número maior é " , valor);

        sc.close();

    }

    // Criado uma função

    public static double max(double n1, double n2, double n3){
        double auxiliar;
        
        if (n1 > n2 && n1 > n3) {
            auxiliar = n1;
        }else if(n2 > n1 && n2 > n3) {
            auxiliar = n2;
        }else{
            auxiliar = n3;
        }
        return auxiliar;
    }

    public static void exbirMensagem(String msg, double resultado){
        System.out.println(msg + resultado);
    }


}
