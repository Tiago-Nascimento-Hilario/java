package thread;

import javax.swing.*;
import java.awt.*;

public class TelaThread extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout())/*Painel de componetes*/;

    private JLabel descricaoHora = new JLabel("Time Thread 1");
    private  TextField mostraTempo = new TextField();

    private JLabel descricaoHora2 = new JLabel("Time Thread 1");
    private  TextField mostraTemp2 = new TextField();

    private JButton jButtonStart = new JButton("Start");
    private JButton jButtonStop = new JButton("Stop");

    public TelaThread(){/*Construtor executa o que tiver dentro no momento da execução do objeto da classe*/

        setTitle("Time Com Thread");
        setSize(new Dimension(240, 240))/*Dimensiona o tamanho da tela */;
        setLocationRelativeTo(null)/*Centraliza a tela */;
        setResizable(false)/*Bloqueia o aumenta da tela*/;

        /*Gerenciador de componentes*/
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = new Insets(5, 10, 5, 5);

        descricaoHora.setPreferredSize(new Dimension(200, 25));
        jPanel.add(descricaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        mostraTempo.setEditable(false);
        jPanel.add(mostraTempo, gridBagConstraints);

        descricaoHora2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(descricaoHora2, gridBagConstraints);

        mostraTemp2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        mostraTemp2.setEditable(false);
        jPanel.add(mostraTemp2, gridBagConstraints);

        gridBagConstraints.gridwidth = 1;

        jButtonStart.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(jButtonStart, gridBagConstraints);

        jButtonStop.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridx ++;
        jPanel.add(jButtonStop, gridBagConstraints);



        add(jPanel, BorderLayout.WEST);
        setVisible(true); /* Torna a tela visível para usuário sempre será o último comando a ser executado*/
    }
}
