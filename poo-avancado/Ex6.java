import java.util.Scanner;

class Livro {
    private String nome, autor; // Privado, significa que apenas o que está dentro da classe Livro pode acessar os atributos
    private double preco;

    Livro(String _nome, String _autor, double _preco) { // Método construtor
        this.nome = _nome;
        this.autor = _autor;
        this.preco = _preco;
    }

    void exibirInformacoes() {
        System.out.println("\nNome do livro: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$" + preco);
    }
}

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Livro[] livros = new Livro[3];
        for(int i = 0; i < 3; i++) {
            System.out.println("Insira o nome do livro: ");
            String nome = scanner.nextLine();
            System.out.println("Insira o autor do livro: ");
            String autor = scanner.nextLine();
            System.out.println("Insira o preço do livro: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();
            
            livros[i] = new Livro(nome, autor, preco);
        }
        for(int i = 0; i < livros.length; i++) {
            livros[i].exibirInformacoes();
        }
        scanner.close();
    }
}