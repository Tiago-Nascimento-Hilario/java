package org.tiago;

public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes(){
        System.out.println("DETALHES DO LIVRO");
        System.out.println("-----------------");
        System.out.println("NOME: "+nome);
        System.out.println("DESCRIÇÃO: "+descricao);
        System.out.println("VALOR: "+valor);
        System.out.println("ISBN: "+isbn);
        autor.mostrarDetalhesAutor();

    }
}
