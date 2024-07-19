import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Informe o departamento: ");
        String nome_do_departamento = entrada.next();
        System.out.println("-----------------DADOS DO COLABORADOR-----------------");
        System.out.print("Nome: ");
        String nome_do_colaborador = entrada.next();
        System.out.print("Nível profissional: ");
        String nivel_do_profissional = entrada.next();
        System.out.print("Salário base: ");
        double salario_base = entrada.nextDouble();


        Colaborador colaborador = new Colaborador(nome_do_colaborador,
                NivelProfissional.valueOf(nivel_do_profissional),
                salario_base, new Departamento(nome_do_departamento));

        System.out.println("-----------------COTRATOS DO COLABORADOR-----------------");
        System.out.print("Número de contratos: ");
        int numero_de_contratos = entrada.nextInt();
        System.out.println("--------------------------------------");
        for (int i = 1; i <= numero_de_contratos; i++) {
            System.out.print("dd/mm/aaaa contrato número " + i + ": ");

            Date data_do_contrato = dataFormatada.parse(entrada.next());
            System.out.print("Valor por hora: ");
            double valor_por_hora = entrada.nextDouble();
            System.out.print("Duração em horas do contrato: ");
            int horas_de_contrato = entrada.nextInt();
            Contratos contrato = new Contratos(data_do_contrato, valor_por_hora, horas_de_contrato);
            colaborador.adicionarContrato(contrato);
            System.out.println("--------------------------------------");

        }
        System.out.print("MM/AAAA Informe: ");
        String mmAa = entrada.next();
        int mes = Integer.parseInt(mmAa.substring(0,2));
        int ano = Integer.parseInt(mmAa.substring(3));

        System.out.println("-----------------CONTROLE DE PAGAMENTO-----------------");
        System.out.println("Nome: " + colaborador.getNome());
        System.out.println("Departamento: " + colaborador.getDepartamento().getNome());
        System.out.println("Renda em " + mmAa + ": " + String.format("%.2f", colaborador.renda(mes, ano)));






        entrada.close();
    }
}
