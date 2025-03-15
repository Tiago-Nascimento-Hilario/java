public class TesteConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposito(10);
        primeiraConta.exibirSaldo();
        primeiraConta.saque(15);
    }
}
