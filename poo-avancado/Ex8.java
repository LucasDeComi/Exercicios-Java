import java.util.Scanner;
import java.util.ArrayList;

class Produto {
    private String nome;
    private double preco;

    Produto(String _nome, double _preco) {
        this.nome = _nome;
        this.preco = _preco;
    }

    void exibirProduto() {
        System.out.println("\nProduto: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        boolean sair = false;

        while(!sair) {
            System.out.println("\nPara cadastrar um novo produto, digite 'cadastrar'");
            System.out.println("Para ver todos os produtos, digite 'listar'");
            System.out.println("Para encerrar o programa, digite 'sair'");
            System.out.println("O que deseja fazer? ");
            String escolha = scanner.nextLine();
            switch(escolha) {
                case "cadastrar":
                    System.out.println("\nInsira o nome do novo produto: ");
                    String nome = scanner.nextLine();
                    System.out.println("Insira o preço do novo produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    if(preco <= 0) {
                        System.out.println("Preço inválido!");
                    }
                    else {
                        produtos.add(new Produto(nome, preco));
                    }
                    break;
                case "listar":
                    if(produtos.isEmpty()) {
                        System.out.println("Nenhum produto ainda foi cadastrado");
                    }
                    else {
                        for(Produto p : produtos) { // Equivalente ao foreach em outras linguagens
                            p.exibirProduto();
                        }
                    }
                    break;
                case "sair":
                    sair = true;
                    break;
                default:
                    System.out.println("Comando inválido!");
                    break;
            }
        }

        scanner.close();
    }
}