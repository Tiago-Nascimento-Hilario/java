public class Conta {
    String nome;
    int agencia;
    int numeroConta;
    double saldo;

    void exibirSaldo(){
        System.out.println("Saldo: "+ saldo);
    }

    void deposito(double valorDeposito){
        if (valorDeposito > 0) {
            saldo = saldo + valorDeposito;
            System.out.println("Depósito realizado com sucesso");   
        }else{
            System.out.println("Valor depósito tem que ser maior que zero");
        }
    }

    void saque(double valorSaque){
        if (saldo >= valorSaque) {
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso");   
        }else{
            System.out.println("Saldo insuficiente");
        }
   }
}
