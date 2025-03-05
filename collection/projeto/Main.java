package collection.projeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n📌 MENU:");
            System.out.println("1️⃣ Adicionar Produto");
            System.out.println("2️⃣ Listar Produtos");
            System.out.println("3️⃣ Listar Categorias");
            System.out.println("4️⃣ Buscar Produto por Código");
            System.out.println("5️⃣ Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();

                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();

                    cadastro.adicionarProduto(new Produto(codigo, nome, categoria, preco));
                    break;

                case 2:
                    cadastro.listarProdutos();
                    break;

                case 3:
                    cadastro.listarCategorias();
                    break;

                case 4:
                    System.out.print("Digite o código do produto: ");
                    int codBusca = scanner.nextInt();
                    cadastro.buscarProduto(codBusca);
                    break;

                case 5:
                    System.out.println("🚀 Programa finalizado!");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Opção inválida! Tente novamente.");
            }
        }
    }
}
