import java.util.Scanner;

class Produto {
    String nome;
    double preco;
    int qtdeEstoque;

    void valorTotal() {
        double valor = preco * qtdeEstoque;
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade em estoque: " + qtdeEstoque);
        System.out.println("Valor total da do estoque: " + valor);
    }

    void adicionarEstoque(int qtde) {
        qtdeEstoque += qtde;
        System.out.println("Quantidade em estoque: " + qtdeEstoque);
    }

    void removerEstoque(int qtde) {
        if(qtde > qtdeEstoque) {
            System.out.println("Não há essa quantidade no estoque");
        }
        else {
            qtdeEstoque -= qtde;
            System.out.println("Quantidade em estoque: " + qtdeEstoque);
        }
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Insira o nome do seu produto: ");
        produto.nome = scanner.nextLine();

        System.out.println("Insira o preço do seu produto: ");
        produto.preco = scanner.nextDouble();
        scanner.nextLine();

        boolean encerrar = false;
        while(!encerrar) {
            System.out.println("Para ver o valor total do estoque, digite 'ver estoque'");
            System.out.println("Para adicionar quantidade no estoque, digite 'adicionar'");
            System.out.println("Para remover quantidade do estoque, digite 'remover'");
            System.out.println("Para encerrar o programa, digite 'encerrar'");
            System.out.println("O que deseja fazer? ");
            String escolha = scanner.nextLine();
            int qtde;
            switch (escolha) {
                case "ver estoque":
                    produto.valorTotal();
                    break;
                case "adicionar":
                    System.out.println("Insira a quantidade a ser adicionada: ");
                    qtde = scanner.nextInt();
                    scanner.nextLine();
                    produto.adicionarEstoque(qtde);
                    break;
                case "remover":
                    System.out.println("Insira a quantidade a ser removida: ");
                    qtde = scanner.nextInt();
                    scanner.nextLine();
                    produto.removerEstoque(qtde);
                    break;
                case "encerrar":
                    encerrar = true;
                    break;
                default:
                    System.out.println("Comando inválido!");
                    break;
            }
        }
        scanner.close();
    }
}