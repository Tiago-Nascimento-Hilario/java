package condicionais;

import javax.swing.JOptionPane;

// If Else
public class Exercicio01 {
    public static void main(String[] args) {
        
        Object[] opcao = {"Masculino", "Feminino"};
        
        String resposta = (String) JOptionPane.showInputDialog(null, "Selecione o sexo:\n", "Pesquisa", JOptionPane.PLAIN_MESSAGE, null, opcao, "Masculino");
        if (resposta == null) {
            JOptionPane.showMessageDialog(null, "Precionou cancelar");
        } else if(resposta == "Masculino"){
            JOptionPane.showMessageDialog(null, "Você é homem");

        }else if(resposta == "Feminino"){
            JOptionPane.showMessageDialog(null, "Você é mulher");

        }
        System.exit(0);
    }
}
