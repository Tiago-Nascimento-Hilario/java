import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Colaborador {
    private String nome;
    private NivelProfissional nivelprofissional;
    private Double salarioBase;

    private Departamento departamento;
    private List<Contratos> contratos = new ArrayList<>();
//
//    public Colaborador() {
//    }

    public Colaborador(String nome, NivelProfissional nivelprofissional, Double salarioBase,
                       Departamento departamento) {
        this.nome = nome;
        this.nivelprofissional = nivelprofissional;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelProfissional getNivelprofissional() {
        return nivelprofissional;
    }

    public void setNivelprofissional(NivelProfissional nivelprofissional) {
        this.nivelprofissional = nivelprofissional;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Contratos> getContratos() {
        return contratos;
    }

    public void adicionarContrato(Contratos contrato){
        contratos.add(contrato);
    }
    public void removerContrato(Contratos contrato){
        contratos.remove(contrato);
    }

    public Double renda(int ano, int mes){
        
        double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();

        for (Contratos contrato : contratos ){

            calendario.setTime(contrato.getDate());
            int ano_do_contrato = calendario.get(Calendar.YEAR);
            int mes_do_contrato = 1 + calendario.get(Calendar.MONTH);

            if (ano == ano_do_contrato && mes == mes_do_contrato) {
                
                soma+= contrato.valorTotal();
            }
        }
        return soma;

    }



}
