package condicionais;

import javax.swing.*;
import java.awt.*;

public class Exercicio03 {
    public static void main(String[] args) {

        // Cria Formulario
        JTextField produtoField = new JTextField(15);
        JTextField precoField = new JTextField(15);


        // Cria painel para organizar componentes do formulário
        JPanel painel = new JPanel();

        painel.setLayout(new GridLayout(4, 1, 5, 5)); // add 4 lihas 1 coluna espaçamento de 5px

        // Adicionando os rótulos e campos ao painel
        painel.add(new JLabel("Produto:"));
        painel.add(produtoField);
        painel.add( new JLabel("Preço"));
        painel.add(precoField);

        // Exibir painel dentro de JOptionPane
        int resultado = JOptionPane.showConfirmDialog(null, painel, "Consultar produtos", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);
                
                if (resultado == JOptionPane.OK_OPTION) {
                    
                    String produto = produtoField.getText();
                    Double preco = Double.parseDouble(precoField.getText());
                    Double valorComDesconto = 0.0;

            if (preco >= 50 && preco < 200) {
                valorComDesconto = preco - 0.05;
                JOptionPane.showMessageDialog(null,produto+"\n"+"Valor: R$"+preco+"\n"+"desconto 5% " + "R$"+valorComDesconto );
            }
            
            else if (preco > 200 && preco <= 500) {
                valorComDesconto = preco - 0.06;
                JOptionPane.showMessageDialog(null,produto+"\n"+"Valor: R$"+preco+"\n"+"desconto 6% " + "R$"+valorComDesconto );
            }

            if (preco > 500 && preco <= 1000) {
                valorComDesconto = preco - 0.07;
                JOptionPane.showMessageDialog(null,produto+"\n"+"Valor: R$"+preco+"\n"+"desconto 7% " + "R$"+valorComDesconto );
            }

         }  


    }
}
