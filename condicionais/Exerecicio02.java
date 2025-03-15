package condicionais;

import javax.swing.JOptionPane;

public class Exerecicio02 {
    public static void main(String[] args) {

        String mes = (String) JOptionPane.showInputDialog(null, "Informe o número do mês");

        while (mes != "0") {
            if (mes != null) {

                switch (mes) {
                    case "1":
                        mes = "Janeiro";
                        break;
                    case "2":
                        mes = "Fevereiro";
                        break;
                    case "3":
                        mes = "Março";
                        break;
                    case "4":
                        mes = "Abril";
                        break;
                    case "5":
                        mes = "Maio";
                        break;
                    case "6":
                        mes = "Junho";
                        break;
                    case "7":
                        mes = "Julho";
                        break;
                    case "8":
                        mes = "Agosto";
                        break;
                    case "9":
                        mes = "Setembro";
                        break;
                    case "10":
                        mes = "Outubro";
                        break;
                    case "11":
                        mes = "Novembro";
                        break;
                    case "12":
                        mes = "Dezembro";
                        break;

                    default:
                        mes = "Desconehcido";
                        System.exit(0);

                }
                JOptionPane.showMessageDialog(null, mes);
                mes = (String) JOptionPane.showInputDialog(null, "Informe o número do mês");
            }

        }

    }
}
