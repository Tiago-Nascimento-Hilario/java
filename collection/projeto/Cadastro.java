package collection.projeto;

import java.util.*;

public class Cadastro {
    private List<Produto> produtos = new ArrayList<>();
    private Set<String> categorias = new HashSet<>();
    private Map<Integer, Produto> mapaProdutos = new HashMap<>();

    // Adiciona um produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        categorias.add(produto.getCategoia());
        mapaProdutos.put(produto.getCodigo(), produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    // Exibe todos os produtos cadastrados
    public void listarProdutos() {
        System.out.println("\n📜 Lista de Produtos:");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    // Exibe todas as categorias cadastradas (sem repetição)
    public void listarCategorias() {
        System.out.println("\n📌 Categorias cadastradas:");
        for (String c : categorias) {
            System.out.println("- " + c);
        }
    }

    // Busca um produto pelo código
    public void buscarProduto(int codigo) {
        Produto produto = mapaProdutos.get(codigo);
        if (produto != null) {
            System.out.println("\n🔍 Produto encontrado: " + produto);
        } else {
            System.out.println("\n❌ Produto não encontrado!");
        }
    }
}

