package collection.projeto;

import java.util.Objects;

public class Produto {
    private int codigo;
    private String nome;
    private String categoria;
    private double preco;

    public Produto(int codigo, String nome, String categoia, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoia;
        this.preco = preco;
    }
    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public String getNome() {return nome;}
    public String getCategoia() {return categoria;}
    public double getPreco() {return preco;}


    @Override
    public String toString() {
        return "Código: " + codigo + " | Nome: " + nome + " | Categoria: " + categoria + " | Preço: R$ " + preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produto produto)) return false;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
