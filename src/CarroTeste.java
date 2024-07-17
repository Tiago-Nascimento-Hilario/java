import javax.swing.JOptionPane;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modeloCarro = JOptionPane.showInputDialog("Informe o modelo do carro"); 
        carro1.anoFabricacao = JOptionPane.showInputDialog("Informe o ano do carro");

        JOptionPane.showMessageDialog(null,  carro1.modeloCarro + " " + carro1.anoFabricacao);

    }
}
